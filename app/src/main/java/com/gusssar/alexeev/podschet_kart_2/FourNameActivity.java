package com.gusssar.alexeev.podschet_kart_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

        if (TextUtils.isEmpty(EditPlayer1.getText().toString()) ||
                TextUtils.isEmpty(EditPlayer2.getText().toString()) ||
                TextUtils.isEmpty(EditPlayer3.getText().toString()) ||
                TextUtils.isEmpty(EditPlayer4.getText().toString())) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.TOAST_INPUT_FIELDS, Toast.LENGTH_LONG);
            toast.show();
            return;
        } else {
            Intent intent = new Intent(this, FourGameActivity.class);

            intent.putExtra("player_name_1", EditPlayer1.getText().toString());
            intent.putExtra("player_name_2", EditPlayer2.getText().toString());
            intent.putExtra("player_name_3", EditPlayer3.getText().toString());
            intent.putExtra("player_name_4", EditPlayer4.getText().toString());
            startActivity(intent);
        }
    }

    public void GoToBegin(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }
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
