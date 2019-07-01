package com.dankook.danhobob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


//개인용 친구 공유용?

public class SelectActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    private Button soloBtn;
    private Button friendBtn;

    private float[] fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

//      Intent intent = getIntent();
//      fl = intent.getExtras().getFloatArray("rating");

        soloBtn = findViewById(R.id.bt_solo);
        friendBtn = findViewById(R.id.bt_friend);

        soloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(), SoloPickActivity.class
                );
                startActivity(intent);
            }
        });

        //friendBtn.setOnClickListener(this);
    }
}

/*    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.bt_solo:
                i = new Intent(this, SoloPickActivity.class);
                i.putExtra("rating", fl);
                startActivity(i);
                break;
            case R.id.bt_friend:
                i = new Intent(this, FriendActivity.class);
                i.putExtra("rating", fl);
                startActivity(i);
        }
    }
}
*/