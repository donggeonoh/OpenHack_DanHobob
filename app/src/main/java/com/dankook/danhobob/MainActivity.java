package com.dankook.danhobob;

        import android.content.Intent;
        import android.content.pm.PackageInstaller;
        import android.content.pm.PackageManager;
        import android.content.pm.Signature;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.inputmethod.InputMethod;
        import android.view.inputmethod.InputMethodSession;
        import android.widget.Button;
        import android.widget.TextView;
        import io.realm.Realm;
        import io.realm.RealmConfiguration;
        import com.kakao.auth.AuthType;
        import com.kakao.auth.ISessionCallback;
        import com.kakao.auth.Session;
        import com.kakao.util.exception.KakaoException;
        import com.kakao.util.helper.log.Logger;
        import java.security.MessageDigest;
        import java.security.NoSuchAlgorithmException;

public class MainActivity<val> extends AppCompatActivity implements View.OnClickListener {

    private Button noneLoginBtn;

    private Button kakaoLoginBtn;

    private TextView tv_user_id;
    private TextView tv_user_name;
    private TextView tv_user_profile;
    private String userName;
    private String userID;
    private String profileUrl;

    private SessionCallback callback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getAppKeyHash();

        kakaoLoginBtn = (Button) findViewById(R.id.bt_kakao_login);
        kakaoLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickKakaoLogin();
            }
        });

        startActivity(new Intent(this, SplashActivity.class));
//      startActivity(new Intent(this, com.dankook.danhobob.SplashActivity.class));

        noneLoginBtn = findViewById(R.id.bt_none_login);
        noneLoginBtn.setOnClickListener(this);

        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .schemaVersion(0)
                .modules(new MyRealmModule())
                .build();
        Realm.setDefaultConfiguration(configuration);
        ImportData.Import();
    }

    private void onClickKakaoLogin() {
        callback = new SessionCallback();
        com.kakao.auth.Session.getCurrentSession().addCallback(callback);
        com.kakao.auth.Session.getCurrentSession().checkAndImplicitOpen();
        com.kakao.auth.Session.getCurrentSession().open(AuthType.KAKAO_TALK_EXCLUDE_NATIVE_LOGIN, MainActivity.this);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(Session.getCurrentSession().handleActivityResult(requestCode, resultCode, data)) {
            return;
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Session.getCurrentSession().removeCallback(callback);
    }


    private class SessionCallback implements ISessionCallback {

        @Override
        public void onSessionOpened() {
            redirectRatingActivity();
        }

        @Override
        public void onSessionOpenFailed(KakaoException exception) {
            if(exception != null) {
                Logger.e(exception);
            }
        }
    }

    protected void redirectRatingActivity() {
        final Intent intent = new Intent(this, RatingActivity.class);
        startActivity(intent);
        finish();
    }




    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        switch (v.getId()) {
            case R.id.bt_none_login:
                intent = new Intent(this, RatingActivity.class);
                break;

            case R.id.bt_kakao_login:
                intent = new Intent(this, RatingActivity.class);
            default:
        }

        startActivity(intent);
        finish();
    }







}
