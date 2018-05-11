package com.gusssar.alexeev.podschet_kart_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ThreeNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_name);
    }

    public void GoToCountThree(View view) {
        EditText EditPlayer1 = (EditText) findViewById(R.id.EditPlayer1);
        EditText EditPlayer2 = (EditText) findViewById(R.id.EditPlayer2);
        EditText EditPlayer3 = (EditText) findViewById(R.id.EditPlayer3);

        if (TextUtils.isEmpty(EditPlayer1.getText().toString()) ||
                TextUtils.isEmpty(EditPlayer2.getText().toString()) ||
                TextUtils.isEmpty(EditPlayer3.getText().toString())) {
            Toast toast = Toast.makeText(getApplicationContext(), "Заполните поля!", Toast.LENGTH_LONG);
            toast.show();
            return;
        } else {

            Intent intent = new Intent(this, ThreeGameActivity.class);

            intent.putExtra("player_name_1", EditPlayer1.getText().toString());
            intent.putExtra("player_name_2", EditPlayer2.getText().toString());
            intent.putExtra("player_name_3", EditPlayer3.getText().toString());
            startActivity(intent);
        }
    }

    public void GoToBegin(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }

}


