package com.gusssar.alexeev.podschet_kart_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class WinActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        String name_win = getIntent().getExtras().getString("player_name");//имя победителя
        TextView PlayerName = (TextView)findViewById(R.id.name_win);
        PlayerName.setText(name_win);

        //анимация заголовка 1
        final ImageView title1ImageView = (ImageView) findViewById(R.id.title_1);
        final ImageView title2ImageView = (ImageView) findViewById(R.id.title_2);
        final ImageView title3ImageView = (ImageView) findViewById(R.id.title_3);
        final Animation titleAnimation = AnimationUtils.loadAnimation(this, R.anim.win_title);
        //title1ImageView.startAnimation(titleAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //анимация заголовка 2
                title1ImageView.startAnimation(titleAnimation);
            }
        }, 0);
        /** Задержка второго заголовка */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //анимация заголовка 2
                title2ImageView.startAnimation(titleAnimation);
            }
        }, 1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //анимация заголовка 3
                title3ImageView.startAnimation(titleAnimation);
            }
        }, 2000);
    }

    public void GoToBegin(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }
}
