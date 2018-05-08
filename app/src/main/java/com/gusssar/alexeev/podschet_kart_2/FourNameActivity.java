package com.gusssar.alexeev.podschet_kart_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FourNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_name);
    }

    public void GoToCountFour(View view) {
        /**без цикла и массива*/
        EditText EditPlayer1 = (EditText) findViewById(R.id.EditPlayer1);
        EditText EditPlayer2 = (EditText) findViewById(R.id.EditPlayer2);
        EditText EditPlayer3 = (EditText) findViewById(R.id.EditPlayer3);
        EditText EditPlayer4 = (EditText) findViewById(R.id.EditPlayer4);

        /**проба с помощью цикла и массива

        int numb_of_player = 4;
        for (int i=1; i < numb_of_player + 1; i++)
        {
            EditText EditPlayer[i] = (EditText) findViewById(R.id.EditPlayer[i]);
        }
        */

        Intent intent = new Intent(this, FourGameActivity.class);

        intent.putExtra("player_name_1",EditPlayer1.getText().toString());
        intent.putExtra("player_name_2",EditPlayer2.getText().toString());
        intent.putExtra("player_name_3",EditPlayer3.getText().toString());
        intent.putExtra("player_name_4",EditPlayer4.getText().toString());
        startActivity(intent);
    }

    public void GoToBegin(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }
}