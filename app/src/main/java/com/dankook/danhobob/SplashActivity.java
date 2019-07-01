package com.dankook.danhobob;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.R;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.dankook.danhobob.R.layout.activity_splash);
        startSplash();
    }

    private void startSplash() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 2048);
    }

}