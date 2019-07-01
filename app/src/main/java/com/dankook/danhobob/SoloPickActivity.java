package com.dankook.danhobob;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class SoloPickActivity extends AppCompatActivity {

    Button backBtn;

    ImageView imageViews;
    TextView foodNames;
    TextView foodExplain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_pick);

        backBtn = findViewById(R.id.bt_back);
        imageViews = findViewById(R.id.img_food);
        foodNames = findViewById(R.id.tv_food);
        foodExplain = findViewById(R.id.tv_expain_food);

        Random random = new Random();
        int num = random.nextInt(6);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    onBackPressed();
            }
        });

        switch (num) {
            case 0:
                imageViews.setImageResource(R.drawable.food10);
                foodNames.setText("마라탕");
                foodExplain.setText("오늘은 익산에 안개가 꼈네!  기온이 27.4도인 오늘 점심..  따뜻한 중식은 어때? 면인 마라탕을 먹는 것을 추천한단호밥!\n\n매콤하고 맛있는 마라탕 먹고 힘내랏!");
                break;
            case 1:
                imageViews.setImageResource(R.drawable.fodod4);
                foodNames.setText("막국수");
                foodExplain.setText("오늘은 익산에 비도 오고 쌀쌀하니까, 부드럽고 담백하고 시원한 막국수 한사발 먹는 것을 추천한단호밥!\n\n막국수 먹고 좋은 하루 보내시길! ٩(◦`꒳´◦)۶");
                break;
            case 2:
                imageViews.setImageResource(R.drawable.food2);
                foodNames.setText("햄버거");
                foodExplain.setText("오늘의 익산은 날씨가 맑고 적당하네~!무려 27.4도라굿! 식감있는 햄버거 한번 잡솨보라굿!\n나 단호밥이 귀찮을 때 적극 추천한단호밥~_~");
                break;
            case 3:
                imageViews.setImageResource(R.drawable.food6);
                foodNames.setText("초밥");
                foodExplain.setText("오늘은 익산에 바람이 많이 부니까, 오랜만에 일식 어때? 차갑게 식감이 살아있는 초밥 한번 먹어보라굿!\n나 단호밥이 정말 좋아한단호밥 ٩(◦`꒳´◦)۶");
                break;
            case 4:
                imageViews.setImageResource(R.drawable.food3);
                foodNames.setText("간장게장");
                foodExplain.setText("오늘은 익산의 날씨가 27.4도로 밖에 나돌아다니기에 적당한 거 같아,\n 오랜만에 우리 동네 간장게장 맛집을 찾아보는건 어때? 짭쪼롬한 우리의 한식!밥도둑! 간장게장 한번 잡솨보라굿!\n나 단호밥도 먹고싶단호밥+_+");
                break;
            case 5:
                imageViews.setImageResource(R.drawable.food1);
                foodNames.setText("떡볶이");
                foodExplain.setText("오늘은 날씨가 27.4도로 밖에 나돌아다니기에 적당한 거 같아 , 떡볶이나 한번 잡솨보라굿!\n나 단호밥도 먹고싶단호밥+_+");
                break;
        }
    }
}