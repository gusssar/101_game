package com.gusssar.alexeev.podschet_kart_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TwoNameActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_name);
    }

    public void GoToCountTwo(View view) {
        EditText EditPlayer1 = (EditText) findViewById(R.id.EditPlayer1);
        EditText EditPlayer2 = (EditText) findViewById(R.id.EditPlayer2);

        Intent intent = new Intent(TwoNameActivity.this, TwoGameActivity.class);

            intent.putExtra("player_name_1",EditPlayer1.getText().toString());
            intent.putExtra("player_name_2",EditPlayer2.getText().toString());
        startActivity(intent);

    }

    public void GoToBegin(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }
}
