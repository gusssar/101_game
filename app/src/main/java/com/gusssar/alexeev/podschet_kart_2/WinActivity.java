package com.gusssar.alexeev.podschet_kart_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WinActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        String name_win = getIntent().getExtras().getString("player_name");//имя победителя
        TextView PlayerName = (TextView)findViewById(R.id.name_win);
        PlayerName.setText(name_win);

    }

    public void GoToBegin(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }
}
