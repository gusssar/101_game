package com.gusssar.alexeev.podschet_kart_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
            Animation NameAnimation = AnimationUtils.loadAnimation(this, R.anim.win_title);
                title2Animation.setStartOffset(800);
                title3Animation.setStartOffset(1600);
                NameAnimation.setStartOffset(2400);
                    PlayerName.startAnimation(NameAnimation);
                    title1ImageView.startAnimation(title1Animation);
                    title2ImageView.startAnimation(title2Animation);
                    title3ImageView.startAnimation(title3Animation);

        //анимация заголовка 1
        ImageView manImageView = (ImageView) findViewById(R.id.man);
        Animation manAnimation = AnimationUtils.loadAnimation(this, R.anim.win_man);
        manImageView.startAnimation(manAnimation);
        ImageView shine_bh_ImageView = (ImageView) findViewById(R.id.shine_blue_half);
        ImageView shine_bf_ImageView = (ImageView) findViewById(R.id.shine_blue_full);
            Animation shine_bh_Animation = AnimationUtils.loadAnimation(this, R.anim.win_shine);
            Animation shine_bf_Animation = AnimationUtils.loadAnimation(this, R.anim.win_shine);
                shine_bh_Animation.setStartOffset(2500);
                shine_bf_Animation.setStartOffset(3500);
                    shine_bh_ImageView.startAnimation(shine_bh_Animation);
                    shine_bf_ImageView.startAnimation(shine_bf_Animation);

/**
        manImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                WinEgg();
                return true;
            }
        }); */
    }

        public void GoToBegin (View view){
            Intent intent = new Intent(this, WelcomeActivity.class);
            startActivity(intent);
        }


/**
    public void WinEgg() {
        ImageView egg_1_ImageView = (ImageView) findViewById(R.id.egg_title_1);
        ImageView egg_2_ImageView = (ImageView) findViewById(R.id.egg_title_2);
            Animation egg_1_Animation = AnimationUtils.loadAnimation(this, R.anim.win_sunset);
            Animation egg_2_Animation = AnimationUtils.loadAnimation(this, R.anim.win_sunset);
                egg_1_Animation.setStartOffset(1000);
                egg_2_Animation.setStartOffset(1000);
                    egg_1_ImageView.startAnimation(egg_1_Animation);
                    egg_2_ImageView.startAnimation(egg_2_Animation);

    }
*/
    //при ошибочном нажатии Back
    private static long back_pressed;

    @Override
    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis())
            super.onBackPressed();
        else
            Toast.makeText(getBaseContext(), R.string.DOUBLE_PRESS_BACK,
                    Toast.LENGTH_SHORT).show();
        back_pressed = System.currentTimeMillis();
    }
}

