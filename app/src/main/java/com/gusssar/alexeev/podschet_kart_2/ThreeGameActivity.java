package com.gusssar.alexeev.podschet_kart_2;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThreeGameActivity extends AppCompatActivity implements OnClickListener {
    Button btnRun, btnClear;
    TextView out_score_first, out_score_second, out_score_third;
    EditText scFirst, scSecond, scThird;
    int SCORE_1 = 0;
    int SCORE_2 = 0;
    int SCORE_3 = 0;
    //для диалога
    final int DIALOG_PRICE = 1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_game);

        btnRun = (Button) findViewById(R.id.btnRun);
            btnRun.setOnClickListener(this);
        btnClear = (Button) findViewById(R.id.btnClear);
            btnClear.setOnClickListener(this);
        scFirst = (EditText) findViewById(R.id.score_first);
        scSecond = (EditText) findViewById(R.id.score_second);
        scThird = (EditText) findViewById(R.id.score_third);
            out_score_first = (TextView) findViewById(R.id.out_score_first);
            out_score_second = (TextView) findViewById(R.id.out_score_second);
            out_score_third = (TextView) findViewById(R.id.out_score_third);

        /** Имена игроков из предыдущей активности*/
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока
        String player_name_3 = getIntent().getExtras().getString("player_name_3");//имя третьего игрока
            TextView PlayerName1 = (TextView)findViewById(R.id.TextNamePlayer1);
            TextView PlayerName2 = (TextView)findViewById(R.id.TextNamePlayer2);
            TextView PlayerName3 = (TextView)findViewById(R.id.TextNamePlayer3);
                TextView PlayerSum1 = (TextView)findViewById(R.id.TextSumPlayer1);
                TextView PlayerSum2 = (TextView)findViewById(R.id.TextSumPlayer2);
                TextView PlayerSum3 = (TextView)findViewById(R.id.TextSumPlayer3);
                    PlayerName1.setText(player_name_1);
                    PlayerName2.setText(player_name_2);
                    PlayerName3.setText(player_name_3);
                        PlayerSum1.setText("Итого " + player_name_1 +":");
                        PlayerSum2.setText("Итого " + player_name_2 +":");
                        PlayerSum3.setText("Итого " + player_name_3 +":");
        /**очки из предыдущей активности если есть*/


        Integer SCORE_1 = getIntent().getExtras().getInt("SCORE_1");//очки первого игрока
        Integer SCORE_2 = getIntent().getExtras().getInt("SCORE_2");//очки второго игрока
        Integer SCORE_3 = getIntent().getExtras().getInt("SCORE_3");//очки третьего игрока

            out_score_first.setText(Integer.toString(SCORE_1)); //выхлоп суммарного значения
            out_score_second.setText(Integer.toString(SCORE_2)); //выхлоп суммарного значен
            out_score_third.setText(Integer.toString(SCORE_3)); //выхлоп суммарного значения



    }

    @Override
    public void onClick(View v) {

        String sc_first = scFirst.getText().toString();
        String sc_second = scSecond.getText().toString();
        String sc_third = scThird.getText().toString();

        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока
        String player_name_3 = getIntent().getExtras().getString("player_name_3");//имя третьего игрока

        /** не нужно
        Integer SCORE_1 = getIntent().getExtras().getInt("SCORE_1");//очки первого игрока
        Integer SCORE_2 = getIntent().getExtras().getInt("SCORE_2");//очки второго игрока
        Integer SCORE_3 = getIntent().getExtras().getInt("SCORE_3");//очки третьего игрока
        */

        switch (v.getId()) {

            case R.id.btnRun:
                if (TextUtils.isEmpty(scFirst.getText().toString()) ||
                        TextUtils.isEmpty(scSecond.getText().toString()) ||
                            TextUtils.isEmpty(scThird.getText().toString())) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Заполните поля!", Toast.LENGTH_LONG);
                    toast.show();
                    return;
                } else {

                    /**Вычисление очков партии*/
                    //SCORE_1 = SCORE_1 + Integer.parseInt(sc_first);
                    SCORE_1 = Integer.parseInt(out_score_first.getText().toString()) + Integer.parseInt(sc_first);
                    out_score_first.setText(Integer.toString(SCORE_1)); //выхлоп суммарного значения
                    scFirst.setText(""); //очистка Edit
                    //SCORE_2 = SCORE_2 + Integer.parseInt(sc_second);
                    SCORE_2 = Integer.parseInt(out_score_second.getText().toString()) + Integer.parseInt(sc_second);
                    out_score_second.setText(Integer.toString(SCORE_2)); //выхлоп суммарного значен
                    scSecond.setText("");
                    //SCORE_3 = SCORE_3 + Integer.parseInt(sc_third);
                    SCORE_3 = Integer.parseInt(out_score_third.getText().toString()) + Integer.parseInt(sc_third);
                    out_score_third.setText(Integer.toString(SCORE_3)); //выхлоп суммарного значения
                    scThird.setText("");

                    /**Проверка обнуления очков*/

                    if (SCORE_1 == 101) {
                        SCORE_1 = 0;
                        out_score_first.setText(Integer.toString(0));
                        scFirst.setText("");
                        Toast toast = Toast.makeText(getApplicationContext(), player_name_1 + " обнуляет результат!", Toast.LENGTH_LONG);
                        toast.show();
                    }
                    if (SCORE_2 == 101) {
                        SCORE_2 = 0;
                        out_score_second.setText(Integer.toString(0));
                        scSecond.setText("");
                        Toast toast = Toast.makeText(getApplicationContext(), player_name_2 + " обнуляет результат!", Toast.LENGTH_LONG);
                        toast.show();
                    }
                    if (SCORE_3 == 101) {
                        SCORE_3 = 0;
                        out_score_third.setText(Integer.toString(0));
                        scThird.setText("");
                        Toast toast = Toast.makeText(getApplicationContext(), player_name_3 + " обнуляет результат!", Toast.LENGTH_LONG);
                        toast.show();
                    }

                    /**Проверка окончания игры*/
                    /**У всех перебор*/
                    if (SCORE_1 > 101 &&
                            SCORE_2 > 101 &&
                            SCORE_3 > 101) {
                        //здесь должна быть ссылка на проигрыш всех Death.class
//                    Toast toast = Toast.makeText(getApplicationContext(), "Камон! Такого не бывает! Давай сначала!", Toast.LENGTH_LONG);
//                    toast.show();
                        Intent intent = new Intent(this, WelcomeActivity.class);
                        startActivity(intent);
                    }

                    /**У всех кроме одного*/
                    if (SCORE_2 > 101 && SCORE_3 > 101) {
                        //здесь должна быть ссылка на выигранную игру Win.class
                        //передача имени игрока 1
                        Intent intent = new Intent(this, WelcomeActivity.class);
                        intent.putExtra("player_name", player_name_1);
                        startActivity(intent);
                    }
                    if (SCORE_1 > 101 && SCORE_3 > 101) {
                        //здесь должна быть ссылка на выигранную игру Win.class
                        //передача имени игрока 2
                        Intent intent = new Intent(this, WelcomeActivity.class);
                        intent.putExtra("player_name", player_name_2);
                        startActivity(intent);
                    }
                    if (SCORE_1 > 101 && SCORE_2 > 101) {
                        //здесь должна быть ссылка на выигранную игру Win.class
                        //передача имени игрока 3
                        Intent intent = new Intent(this, WelcomeActivity.class);
                        intent.putExtra("player_name", player_name_3);
                        startActivity(intent);
                    }


                    /**У всех кроме двоих*/
                    if (SCORE_3 > 101 ) {
                        Intent intent = new Intent(this, TwoGameActivity.class);
                        intent.putExtra("player_name_1", player_name_1);
                        intent.putExtra("player_name_2", player_name_2);
                        intent.putExtra("SCORE_1", SCORE_1);
                        intent.putExtra("SCORE_2", SCORE_2);
                        startActivity(intent);
                    }
                    if (SCORE_1 > 101 ) {
                        Intent intent = new Intent(this, TwoGameActivity.class);
                        intent.putExtra("player_name_1", player_name_2);
                        intent.putExtra("player_name_2", player_name_3);
                        intent.putExtra("SCORE_1", SCORE_2);
                        intent.putExtra("SCORE_2", SCORE_3);
                        startActivity(intent);
                    }
                    if (SCORE_2 > 101 ) {
                        Intent intent = new Intent(this, TwoGameActivity.class);
                        intent.putExtra("player_name_1", player_name_1);
                        intent.putExtra("player_name_2", player_name_3);
                        intent.putExtra("SCORE_1", SCORE_1);
                        intent.putExtra("SCORE_2", SCORE_3);
                        startActivity(intent);
                    }
                }}}

    public void GoToGamePrice (View v){
        showDialog(DIALOG_PRICE);
    }

    protected Dialog onCreateDialog (int id){
        if (id == DIALOG_PRICE) {
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            adb.setTitle(R.string.PriceTitle);
            adb.setMessage(R.string.PriceList);
            adb.setIcon(android.R.drawable.ic_menu_help);
            return adb.create();
        }
        return super.onCreateDialog(id);
    }
}