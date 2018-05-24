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
        TextView PlayerName = (TextView) findViewById(R.id.name_win);
        PlayerName.setText(name_win);

        //анимация заголовка 1
        ImageView title1ImageView = (ImageView) findViewById(R.id.title_1);
        ImageView title2ImageView = (ImageView) findViewById(R.id.title_2);
        ImageView title3ImageView = (ImageView) findViewById(R.id.title_3);
            Animation title1Animation = AnimationUtils.loadAnimation(this, R.anim.win_title);
            Animation title2Animation = AnimationUtils.loadAnimation(this, R.anim.win_title);
            Animation title3Animation = AnimationUtils.loadAnimation(this, R.anim.win_title);
                title2Animation.setStartOffset(800);
                title3Animation.setStartOffset(1600);
                    title1ImageView.startAnimation(title1Animation);
                    title2ImageView.startAnimation(title2Animation);
                    title3ImageView.startAnimation(title3Animation);

        //анимация заголовка 1
        ImageView manImageView = (ImageView) findViewById(R.id.man);
        Animation manAnimation = AnimationUtils.loadAnimation(this, R.anim.win_man);
        manImageView.startAnimation(manAnimation);
/**не понятно, необходимо доработать*/
        ImageView shine_bh_ImageView = (ImageView) findViewById(R.id.shine_blue_half);
        ImageView ashine_bh_ImageView = (ImageView) findViewById(R.id.shine_blue_half);
            Animation shine_bh_Animation = AnimationUtils.loadAnimation(this, R.anim.win_shine);
            Animation ashine_bh_Animation = AnimationUtils.loadAnimation(this, R.anim.win_sunset);
                shine_bh_Animation.setStartOffset(2500);
                ashine_bh_Animation.setStartOffset(3500);
                    shine_bh_ImageView.startAnimation(shine_bh_Animation);
                    //ashine_bh_ImageView.startAnimation(ashine_bh_Animation);
    }

        public void GoToBegin (View view){
            Intent intent = new Intent(this, WelcomeActivity.class);
            startActivity(intent);
        }
}

