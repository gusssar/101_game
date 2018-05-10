package com.gusssar.alexeev.podschet_kart_2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /**Анимация левого лица*/
        // Получим ссылку на эмблему
        ImageView sunImageView = (ImageView) findViewById(R.id.label);
        // Анимация для эмблемы
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.label_anim);
        // Подключаем анимацию к нужному View
        sunImageView.startAnimation(sunRiseAnimation);

        /**Анимация левого лица*/
        ImageView faceLeftImageView = (ImageView) findViewById(R.id.face_left);
        Animation faceLeftAnimation = AnimationUtils.loadAnimation(this, R.anim.face_up_left);
        faceLeftImageView.startAnimation(faceLeftAnimation);

        /**Анимация правого лица*/
        ImageView faceRightImageView = (ImageView) findViewById(R.id.face_right);
        Animation faceRightAnimation = AnimationUtils.loadAnimation(this, R.anim.face_up_right);
        faceRightImageView.startAnimation(faceRightAnimation);

        /** Задержка открытия WelcomeActivity */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));
            }
        }, 4000);


    }
}
