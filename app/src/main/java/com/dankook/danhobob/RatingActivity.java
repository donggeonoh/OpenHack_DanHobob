package com.dankook.danhobob;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

//tutorial 점수 매기기

public class RatingActivity extends AppCompatActivity {

    private static final int VIEW_NUM = 10;

    private RelativeLayout[] relativeLayouts = new RelativeLayout[VIEW_NUM + 1];
    private LinearLayout[] contentLinearLayout= new LinearLayout[VIEW_NUM + 1];

    private LinearLayout linearLayout;

    private ImageView[] foodImgs = new ImageView[VIEW_NUM];
    private TextView[] foodTxts = new TextView[VIEW_NUM];
    private RatingBar[] ratingBars = new RatingBar[VIEW_NUM];

    private Button submitButton;

    private String[] foodNames = {"떡볶이", "햄버거", "간장게장", "막국수", "샤브샤브", "초밥", "찜닭", "짜장면", "샐러드", "마라탕"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        Typeface type = Typeface.createFromAsset(this.getAssets(), "jalnan.ttf");

        submitButton = new Button(this);
        linearLayout = findViewById(R.id.layout_linear);

        RelativeLayout.LayoutParams imageParams = new RelativeLayout.LayoutParams(256, 256);

        RelativeLayout.LayoutParams textParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams ratingParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        LinearLayout.LayoutParams submitParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        submitButton.setLayoutParams(submitParams);
        submitButton.setBackgroundColor(Color.parseColor("#36542A"));
        submitButton.setTextSize(32);
        submitButton.setText("확인!");
        submitButton.setTypeface(type);

        textParams.setMargins(0, 0, 64, 0);

        for (int i = 0; i < VIEW_NUM; i++) {
            relativeLayouts[i] = new RelativeLayout(this);
            contentLinearLayout[i] = new LinearLayout(this);

            foodImgs[i] = new ImageView(this);
            foodTxts[i] = new TextView(this);
            ratingBars[i] = new RatingBar(this);

            foodImgs[i].setLayoutParams(imageParams);
            foodTxts[i].setLayoutParams(textParams);
            ratingBars[i].setLayoutParams(ratingParams);

            contentLinearLayout[i].setLayoutParams(linearLayoutParams);
            contentLinearLayout[i].setGravity(Gravity.RIGHT);
            contentLinearLayout[i].setOrientation(LinearLayout.VERTICAL);

            imageParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            textParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            ratingParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

            foodTxts[i].setTextSize(20);
            foodTxts[i].setText(foodNames[i]);
            foodTxts[i].setTypeface(type);

            ratingBars[i].setStepSize(1.0f);
        }

        foodImgs[0].setImageResource(R.drawable.food1);
        foodImgs[1].setImageResource(R.drawable.food2);
        foodImgs[2].setImageResource(R.drawable.food3);
        foodImgs[3].setImageResource(R.drawable.fodod4);
        foodImgs[4].setImageResource(R.drawable.food5);
        foodImgs[5].setImageResource(R.drawable.food6);
        foodImgs[6].setImageResource(R.drawable.food7);
        foodImgs[7].setImageResource(R.drawable.food8);
        foodImgs[7].setImageResource(R.drawable.food8);
        foodImgs[8].setImageResource(R.drawable.food9);
        foodImgs[9].setImageResource(R.drawable.food10);

        int i;

        for (i = 0; i < VIEW_NUM; i++) {

            relativeLayouts[i].addView(foodImgs[i]);
            contentLinearLayout[i].addView(foodTxts[i]);
            contentLinearLayout[i].addView(ratingBars[i]);
            relativeLayouts[i].addView(contentLinearLayout[i]);

            linearLayout.addView(relativeLayouts[i]);
        }

        relativeLayouts[i] = new RelativeLayout(this);
        relativeLayouts[i].addView(submitButton);

        linearLayout.addView(relativeLayouts[i]);

        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float[] numStar = new float[VIEW_NUM];

                for (int i = 0; i < VIEW_NUM; i++) {
                    numStar[i] = ratingBars[i].getRating();
                    Database.UpdatePreference(i, (int) numStar[i]);
                }

                Intent intent = new Intent(v.getContext(), SelectActivity.class);
                intent.putExtra("rating", numStar);

                finish();
                startActivity(intent);
            }

        });
    }
}
