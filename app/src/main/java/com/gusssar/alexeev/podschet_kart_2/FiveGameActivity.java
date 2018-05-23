package com.gusssar.alexeev.podschet_kart_2;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class FiveGameActivity extends AppCompatActivity implements OnClickListener {
    Button btnRun;
    TextView out_score_first, out_score_second, out_score_third, out_score_fourth, out_score_fifth;
    EditText scFirst, scSecond, scThird, scFourth, scFifth;
    int SCORE_1 = 0;
    int SCORE_2 = 0;
    int SCORE_3 = 0;
    int SCORE_4 = 0;
    int SCORE_5 = 0;
    //для диалога
    final int DIALOG_PRICE = 1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_game);

        btnRun = (Button) findViewById(R.id.btnRun);
            btnRun.setOnClickListener(this);

            scFirst = (EditText) findViewById(R.id.score_first);
            scSecond = (EditText) findViewById(R.id.score_second);
            scThird = (EditText) findViewById(R.id.score_third);
            scFourth = (EditText) findViewById(R.id.score_fourth);
            scFifth = (EditText) findViewById(R.id.score_fifth);

                out_score_first = (TextView) findViewById(R.id.out_score_first);
                out_score_second = (TextView) findViewById(R.id.out_score_second);
                out_score_third = (TextView) findViewById(R.id.out_score_third);
                out_score_fourth = (TextView) findViewById(R.id.out_score_fourth);
                out_score_fifth = (TextView) findViewById(R.id.out_score_fifth);



        /** Имена игроков из предыдущей активности*/
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока
        String player_name_3 = getIntent().getExtras().getString("player_name_3");//имя третьего игрока
        String player_name_4 = getIntent().getExtras().getString("player_name_4");//имя четвертого игрока
        String player_name_5 = getIntent().getExtras().getString("player_name_5");//имя четвертого игрока

        String total= getResources().getString(R.string.total);

        TextView PlayerName1 = (TextView)findViewById(R.id.TextNamePlayer1);
        TextView PlayerName2 = (TextView)findViewById(R.id.TextNamePlayer2);
        TextView PlayerName3 = (TextView)findViewById(R.id.TextNamePlayer3);
        TextView PlayerName4 = (TextView)findViewById(R.id.TextNamePlayer4);
        TextView PlayerName5 = (TextView)findViewById(R.id.TextNamePlayer5);

        TextView PlayerSum1 = (TextView)findViewById(R.id.TextSumPlayer1);
        TextView PlayerSum2 = (TextView)findViewById(R.id.TextSumPlayer2);
        TextView PlayerSum3 = (TextView)findViewById(R.id.TextSumPlayer3);
        TextView PlayerSum4 = (TextView)findViewById(R.id.TextSumPlayer4);
        TextView PlayerSum5 = (TextView)findViewById(R.id.TextSumPlayer5);

        PlayerName1.setText(player_name_1);
        PlayerName2.setText(player_name_2);
        PlayerName3.setText(player_name_3);
        PlayerName4.setText(player_name_4);
        PlayerName5.setText(player_name_5);

        PlayerSum1.setText(total+" "+player_name_1+":");
        PlayerSum2.setText(total+" "+player_name_2+":");
        PlayerSum3.setText(total+" "+player_name_3+":");
        PlayerSum4.setText(total+" "+player_name_4+":");
        PlayerSum5.setText(total+" "+player_name_5+":");

        /**очки из предыдущей активности если есть*/


        Integer SCORE_1 = getIntent().getExtras().getInt("SCORE_1");//очки первого игрока
        Integer SCORE_2 = getIntent().getExtras().getInt("SCORE_2");//очки второго игрока
        Integer SCORE_3 = getIntent().getExtras().getInt("SCORE_3");//очки третьего игрока
        Integer SCORE_4 = getIntent().getExtras().getInt("SCORE_4");//очки  игрока
        Integer SCORE_5 = getIntent().getExtras().getInt("SCORE_5");//очки игрока

        Integer TOTAL_1 = getIntent().getExtras().getInt("TOTAL_1");//очки из калькулятора для первого игрока
        Integer TOTAL_2 = getIntent().getExtras().getInt("TOTAL_2");//очки из калькулятора для второго игрока
        Integer TOTAL_3 = getIntent().getExtras().getInt("TOTAL_3");//очки из калькулятора для третьего игрока
        Integer TOTAL_4 = getIntent().getExtras().getInt("TOTAL_4");//очки из калькулятора для второго игрока
        Integer TOTAL_5 = getIntent().getExtras().getInt("TOTAL_5");//очки из калькулятора для третьего игрока

        out_score_first.setText(Integer.toString(SCORE_1)); //выхлоп суммарного значения
        out_score_second.setText(Integer.toString(SCORE_2)); //выхлоп суммарного значен
        out_score_third.setText(Integer.toString(SCORE_3)); //выхлоп суммарного значения
        out_score_fourth.setText(Integer.toString(SCORE_4)); //выхлоп суммарного значен
        out_score_fifth.setText(Integer.toString(SCORE_5)); //выхлоп суммарного значения

        scFirst.setText(Integer.toString(TOTAL_1));
        scSecond.setText(Integer.toString(TOTAL_2));
        scThird.setText(Integer.toString(TOTAL_3));
        scFourth.setText(Integer.toString(TOTAL_4));
        scFifth.setText(Integer.toString(TOTAL_5));

    }

    @Override
    public void onClick(View v) {


        String sc_first = scFirst.getText().toString();
        String sc_second = scSecond.getText().toString();
        String sc_third = scThird.getText().toString();
        String sc_fourth = scFourth.getText().toString();
        String sc_fifth = scFifth.getText().toString();

        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока
        String player_name_3 = getIntent().getExtras().getString("player_name_3");//имя третьего игрока
        String player_name_4 = getIntent().getExtras().getString("player_name_4");//имя четвертого игрока
        String player_name_5 = getIntent().getExtras().getString("player_name_5");//имя четвертого игрока

        String TOAST_TO_ZERO= getResources().getString(R.string.TOAST_TO_ZERO);

        switch (v.getId()) {

            case R.id.btnRun:
                if
                    (TextUtils.isEmpty(sc_first) ||
                    TextUtils.isEmpty(sc_second) ||
                    TextUtils.isEmpty(sc_third) ||
                    TextUtils.isEmpty(sc_fourth) ||
                    TextUtils.isEmpty(sc_fifth))
                {
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.TOAST_INPUT_FIELDS, Toast.LENGTH_LONG);
                    toast.show();
                    return;
                } else {


                    /**Вычисление очков партии*/
                    SCORE_1 = Integer.parseInt(out_score_first.getText().toString()) + Integer.parseInt(sc_first);
                    out_score_first.setText(Integer.toString(SCORE_1)); //выхлоп суммарного значения
                    scFirst.setText(""); //очистка Edit
                    SCORE_2 = Integer.parseInt(out_score_second.getText().toString()) + Integer.parseInt(sc_second);
                    out_score_second.setText(Integer.toString(SCORE_2)); //выхлоп суммарного значен
                    scSecond.setText("");
                    SCORE_3 = Integer.parseInt(out_score_third.getText().toString()) + Integer.parseInt(sc_third);
                    out_score_third.setText(Integer.toString(SCORE_3)); //выхлоп суммарного значения
                    scThird.setText("");
                    SCORE_4 = Integer.parseInt(out_score_fourth.getText().toString()) + Integer.parseInt(sc_fourth);
                    out_score_fourth.setText(Integer.toString(SCORE_4)); //выхлоп суммарного значен
                    scFourth.setText("");
                    SCORE_5 = Integer.parseInt(out_score_fifth.getText().toString()) + Integer.parseInt(sc_fifth);
                    out_score_fifth.setText(Integer.toString(SCORE_5)); //выхлоп суммарного значения
                    scFifth.setText("");

                    /**Проверка обнуления очков*/

                    if (SCORE_1 == 101) {
                        SCORE_1 = 0;
                        out_score_first.setText(Integer.toString(0));
                        scFirst.setText("");
                        Toast toast = Toast.makeText(getApplicationContext(), player_name_1 + " " + TOAST_TO_ZERO, Toast.LENGTH_LONG);
                        toast.show();
                    }
                    if (SCORE_2 == 101) {
                        SCORE_2 = 0;
                        out_score_second.setText(Integer.toString(0));
                        scSecond.setText("");
                        Toast toast = Toast.makeText(getApplicationContext(), player_name_2 + " " + TOAST_TO_ZERO, Toast.LENGTH_LONG);
                        toast.show();
                    }
                    if (SCORE_3 == 101) {
                        SCORE_3 = 0;
                        out_score_third.setText(Integer.toString(0));
                        scThird.setText("");
                        Toast toast = Toast.makeText(getApplicationContext(), player_name_3 + " " + TOAST_TO_ZERO, Toast.LENGTH_LONG);
                        toast.show();
                    }
                    if (SCORE_4 == 101) {
                        SCORE_4 = 0;
                        out_score_fourth.setText(Integer.toString(0));
                        scFourth.setText("");
                        Toast toast = Toast.makeText(getApplicationContext(), player_name_4 + " " + TOAST_TO_ZERO, Toast.LENGTH_LONG);
                        toast.show();
                    }
                    if (SCORE_5 == 101) {
                        SCORE_5 = 0;
                        out_score_fifth.setText(Integer.toString(0));
                        scFifth.setText("");
                        Toast toast = Toast.makeText(getApplicationContext(), player_name_5 + " " + TOAST_TO_ZERO, Toast.LENGTH_LONG);
                        toast.show();
                    }

            /**Проверка окончания игры*/
            /**У всех перебор*/
                if (SCORE_1 > 101 &&
                    SCORE_2 > 101 &&
                    SCORE_3 > 101 &&
                    SCORE_4 > 101 &&
                    SCORE_5 > 101)
                {
                    //здесь должна быть ссылка на проигрыш всех Death.class
//                    Toast toast = Toast.makeText(getApplicationContext(), "Камон! Такого не бывает! Давай сначала!", Toast.LENGTH_LONG);
//                    toast.show();
                    Intent intent = new Intent(this, WelcomeActivity.class);
                    startActivity(intent);
                }

            /**У всех кроме одного*/
                if (SCORE_2 > 101 && SCORE_3 > 101 && SCORE_4 > 101 && SCORE_5 > 101)
                {
                    //здесь должна быть ссылка на выигранную игру Win.class
                    //передача имени игрока 1
                    Intent intent = new Intent(this, WelcomeActivity.class);
                    intent.putExtra("player_name",player_name_1);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_3 > 101 && SCORE_4 > 101 && SCORE_5 > 101)
                {
                    //здесь должна быть ссылка на выигранную игру Win.class
                    //передача имени игрока 2
                    Intent intent = new Intent(this, WelcomeActivity.class);
                    intent.putExtra("player_name",player_name_2);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_2 > 101 && SCORE_4 > 101 && SCORE_5 > 101)
                {
                    //здесь должна быть ссылка на выигранную игру Win.class
                    //передача имени игрока 3
                    Intent intent = new Intent(this, WelcomeActivity.class);
                    intent.putExtra("player_name",player_name_3);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_2 > 101 && SCORE_3 > 101 && SCORE_5 > 101)
                {
                    //здесь должна быть ссылка на выигранную игру Win.class
                    //передача имени игрока 4
                    Intent intent = new Intent(this, WelcomeActivity.class);
                    intent.putExtra("player_name",player_name_4);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_2 > 101 && SCORE_3 > 101 && SCORE_4 > 101)
                {
                    //здесь должна быть ссылка на выигранную игру Win.class
                    //передача имени игрока 5
                    Intent intent = new Intent(this, WelcomeActivity.class);
                    intent.putExtra("player_name",player_name_5);
                    startActivity(intent);
                }

                /**У всех кроме двоих*/
                //if (SCORE_1 > 101 && SCORE_2 > 101 && SCORE_3 > 101 && SCORE_4 > 101 && SCORE_5 > 101)
                if (SCORE_1 > 101 && SCORE_2 > 101 && SCORE_3 > 101)
                {
                    //передача имени игрока 1 и 2
                    Intent intent = new Intent(this, TwoGameActivity.class);
                    intent.putExtra("player_name_1",player_name_4);
                    intent.putExtra("player_name_2",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_4);
                    intent.putExtra("SCORE_2",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_2 > 101 && SCORE_3 > 101 && SCORE_4 > 101)
                {
                    Intent intent = new Intent(this, TwoGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_3 > 101 && SCORE_4 > 101 && SCORE_5 > 101){
                    Intent intent = new Intent(this, TwoGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_2);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_2);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_4 > 101 && SCORE_5 > 101){
                    Intent intent = new Intent(this, TwoGameActivity.class);
                    intent.putExtra("player_name_1",player_name_2);
                    intent.putExtra("player_name_2",player_name_3);
                    intent.putExtra("SCORE_1",SCORE_2);
                    intent.putExtra("SCORE_2",SCORE_3);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_2 > 101 && SCORE_5 > 101){
                    Intent intent = new Intent(this, TwoGameActivity.class);
                    intent.putExtra("player_name_1",player_name_3);
                    intent.putExtra("player_name_2",player_name_4);
                    intent.putExtra("SCORE_1",SCORE_3);
                    intent.putExtra("SCORE_2",SCORE_4);
                    startActivity(intent);
                }
                if (SCORE_2 > 101 && SCORE_4 > 101 && SCORE_5 > 101){
                    Intent intent = new Intent(this, TwoGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_3);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_3);
                    startActivity(intent);
                }
                if (SCORE_2 > 101 && SCORE_3 > 101 && SCORE_5 > 101){
                    Intent intent = new Intent(this, TwoGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_4);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_4);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_3 > 101 && SCORE_5 > 101){
                    Intent intent = new Intent(this, TwoGameActivity.class);
                    intent.putExtra("player_name_1",player_name_2);
                    intent.putExtra("player_name_2",player_name_4);
                    intent.putExtra("SCORE_1",SCORE_2);
                    intent.putExtra("SCORE_2",SCORE_4);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_3 > 101 && SCORE_4 > 101){
                    Intent intent = new Intent(this, TwoGameActivity.class);
                    intent.putExtra("player_name_1",player_name_2);
                    intent.putExtra("player_name_2",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_2);
                    intent.putExtra("SCORE_2",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_2 > 101 && SCORE_4 > 101){
                    Intent intent = new Intent(this, TwoGameActivity.class);
                    intent.putExtra("player_name_1",player_name_3);
                    intent.putExtra("player_name_2",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_3);
                    intent.putExtra("SCORE_2",SCORE_5);
                    startActivity(intent);
                }

                /**У двоих проигрыш одновременно*/

                if (SCORE_4 > 101 && SCORE_5 > 101){
                    Intent intent = new Intent(this, ThreeGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_2);
                    intent.putExtra("player_name_3",player_name_3);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_2);
                    intent.putExtra("SCORE_3",SCORE_3);
                    startActivity(intent);
                }
                if (SCORE_3 > 101 && SCORE_5 > 101){
                    Intent intent = new Intent(this, ThreeGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_2);
                    intent.putExtra("player_name_3",player_name_4);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_2);
                    intent.putExtra("SCORE_3",SCORE_4);
                    startActivity(intent);
                }
                if (SCORE_3 > 101 && SCORE_4 > 101){
                    Intent intent = new Intent(this, ThreeGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_2);
                    intent.putExtra("player_name_3",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_2);
                    intent.putExtra("SCORE_3",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_2 > 101 && SCORE_5 > 101){
                    Intent intent = new Intent(this, ThreeGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_3);
                    intent.putExtra("player_name_3",player_name_4);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_3);
                    intent.putExtra("SCORE_3",SCORE_4);
                    startActivity(intent);
                }
                if (SCORE_2 > 101 && SCORE_3 > 101){
                    Intent intent = new Intent(this, ThreeGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_4);
                    intent.putExtra("player_name_3",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_4);
                    intent.putExtra("SCORE_3",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_2 > 101 && SCORE_4 > 101){
                    Intent intent = new Intent(this, ThreeGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_3);
                    intent.putExtra("player_name_3",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_3);
                    intent.putExtra("SCORE_3",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_2 > 101){
                    Intent intent = new Intent(this, ThreeGameActivity.class);
                    intent.putExtra("player_name_1",player_name_3);
                    intent.putExtra("player_name_2",player_name_4);
                    intent.putExtra("player_name_3",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_3);
                    intent.putExtra("SCORE_2",SCORE_4);
                    intent.putExtra("SCORE_3",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_3 > 101){
                    Intent intent = new Intent(this, ThreeGameActivity.class);
                    intent.putExtra("player_name_1",player_name_2);
                    intent.putExtra("player_name_2",player_name_4);
                    intent.putExtra("player_name_3",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_2);
                    intent.putExtra("SCORE_2",SCORE_4);
                    intent.putExtra("SCORE_3",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_4 > 101){
                    Intent intent = new Intent(this, ThreeGameActivity.class);
                    intent.putExtra("player_name_1",player_name_2);
                    intent.putExtra("player_name_2",player_name_3);
                    intent.putExtra("player_name_3",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_2);
                    intent.putExtra("SCORE_2",SCORE_3);
                    intent.putExtra("SCORE_3",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_1 > 101 && SCORE_5 > 101){
                    Intent intent = new Intent(this, ThreeGameActivity.class);
                    intent.putExtra("player_name_1",player_name_2);
                    intent.putExtra("player_name_2",player_name_3);
                    intent.putExtra("player_name_3",player_name_4);
                    intent.putExtra("SCORE_1",SCORE_2);
                    intent.putExtra("SCORE_2",SCORE_3);
                    intent.putExtra("SCORE_3",SCORE_4);
                    startActivity(intent);
                }

                /**Проигрыш у одного*/

                if (SCORE_5 > 101){
                    Intent intent = new Intent(this, FourGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_2);
                    intent.putExtra("player_name_3",player_name_3);
                    intent.putExtra("player_name_4",player_name_4);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_2);
                    intent.putExtra("SCORE_3",SCORE_3);
                    intent.putExtra("SCORE_4",SCORE_4);
                    startActivity(intent);
                }
                if (SCORE_4 > 101){
                    Intent intent = new Intent(this, FourGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_2);
                    intent.putExtra("player_name_3",player_name_3);
                    intent.putExtra("player_name_4",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_2);
                    intent.putExtra("SCORE_3",SCORE_3);
                    intent.putExtra("SCORE_4",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_3 > 101){
                    Intent intent = new Intent(this, FourGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_2);
                    intent.putExtra("player_name_3",player_name_4);
                    intent.putExtra("player_name_4",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_2);
                    intent.putExtra("SCORE_3",SCORE_4);
                    intent.putExtra("SCORE_4",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_2 > 101){
                    Intent intent = new Intent(this, FourGameActivity.class);
                    intent.putExtra("player_name_1",player_name_1);
                    intent.putExtra("player_name_2",player_name_3);
                    intent.putExtra("player_name_3",player_name_4);
                    intent.putExtra("player_name_4",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_1);
                    intent.putExtra("SCORE_2",SCORE_3);
                    intent.putExtra("SCORE_3",SCORE_4);
                    intent.putExtra("SCORE_4",SCORE_5);
                    startActivity(intent);
                }
                if (SCORE_1 > 101){
                    Intent intent = new Intent(this, FourGameActivity.class);
                    intent.putExtra("player_name_1",player_name_2);
                    intent.putExtra("player_name_2",player_name_3);
                    intent.putExtra("player_name_3",player_name_4);
                    intent.putExtra("player_name_4",player_name_5);
                    intent.putExtra("SCORE_1",SCORE_2);
                    intent.putExtra("SCORE_2",SCORE_3);
                    intent.putExtra("SCORE_3",SCORE_4);
                    intent.putExtra("SCORE_4",SCORE_5);
                    startActivity(intent);
                }

}}}

    /**фрагмент для правил игры (количества очков)*/

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

    //переменные для EditText
    Integer snd_ed_score_1,
            snd_ed_score_2,
            snd_ed_score_3,
            snd_ed_score_4,
            snd_ed_score_5;

    public void GoToCalc1(View view) {
        //входящая информация

        //забираем информацию об очках из TextView
        Integer SCORE_1 = Integer.parseInt(out_score_first.getText().toString());
        Integer SCORE_2 = Integer.parseInt(out_score_second.getText().toString());
        Integer SCORE_3 = Integer.parseInt(out_score_third.getText().toString());
        Integer SCORE_4 = Integer.parseInt(out_score_fourth.getText().toString());
        Integer SCORE_5 = Integer.parseInt(out_score_fifth.getText().toString());

        //забираем информацию об очках из EditText с условием о незаполненных полях
        if (TextUtils.isEmpty(scFirst.getText().toString())) {
            snd_ed_score_1 = 0;
        } else {
            snd_ed_score_1 = Integer.parseInt(scFirst.getText().toString());
        }
        if (TextUtils.isEmpty(scSecond.getText().toString())) {
            snd_ed_score_2 = 0;
        } else {
            snd_ed_score_2 = Integer.parseInt(scSecond.getText().toString());
        }
        if (TextUtils.isEmpty(scThird.getText().toString())) {
            snd_ed_score_3 = 0;
        } else {
            snd_ed_score_3 = Integer.parseInt(scThird.getText().toString());
        }
        if (TextUtils.isEmpty(scFourth.getText().toString())) {
            snd_ed_score_4 = 0;
        } else {
            snd_ed_score_4 = Integer.parseInt(scFourth.getText().toString());
        }
        if (TextUtils.isEmpty(scFifth.getText().toString())) {
            snd_ed_score_5 = 0;
        } else {
            snd_ed_score_5 = Integer.parseInt(scFifth.getText().toString());
        }

        //забираем имена игроков
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока
        String player_name_3 = getIntent().getExtras().getString("player_name_3");//имя третьего игрока
        String player_name_4 = getIntent().getExtras().getString("player_name_4");//имя второго игрока
        String player_name_5 = getIntent().getExtras().getString("player_name_5");//имя третьего игрока


        //исходящая информация
        Intent intent = new Intent(this, CalculActivity.class);
        //отсылаем имена
        intent.putExtra("player_name_1", player_name_1);
        intent.putExtra("player_name_2", player_name_2);
        intent.putExtra("player_name_3", player_name_3);
        intent.putExtra("player_name_4", player_name_4);
        intent.putExtra("player_name_5", player_name_5);

        //отсылаем очки
        intent.putExtra("SCORE_1", SCORE_1);
        intent.putExtra("SCORE_2", SCORE_2);
        intent.putExtra("SCORE_3", SCORE_3);
        intent.putExtra("SCORE_4", SCORE_4);
        intent.putExtra("SCORE_5", SCORE_5);

        //отсылаем посчитанные очки
        intent.putExtra("snd_ed_score_1", snd_ed_score_1);
        intent.putExtra("snd_ed_score_2", snd_ed_score_2);
        intent.putExtra("snd_ed_score_3", snd_ed_score_3);
        intent.putExtra("snd_ed_score_4", snd_ed_score_4);
        intent.putExtra("snd_ed_score_5", snd_ed_score_5);

        //отсылаем флаг Edit
        intent.putExtra("FLAG_EDIT", 1);
        //отсылаем флаг Активности
        intent.putExtra("FLAG_ACTIVITY", 5);
        startActivity(intent);
    }
    /**2-кнопка*/
    public void GoToCalc2(View view) {
        //входящая информация

        //забираем информацию об очках из TextView
        Integer SCORE_1 = Integer.parseInt(out_score_first.getText().toString());
        Integer SCORE_2 = Integer.parseInt(out_score_second.getText().toString());
        Integer SCORE_3 = Integer.parseInt(out_score_third.getText().toString());
        Integer SCORE_4 = Integer.parseInt(out_score_fourth.getText().toString());
        Integer SCORE_5 = Integer.parseInt(out_score_fifth.getText().toString());

        //забираем информацию об очках из EditText с условием о незаполненных полях
        if (TextUtils.isEmpty(scFirst.getText().toString())) {
            snd_ed_score_1 = 0;
        } else {
            snd_ed_score_1 = Integer.parseInt(scFirst.getText().toString());
        }
        if (TextUtils.isEmpty(scSecond.getText().toString())) {
            snd_ed_score_2 = 0;
        } else {
            snd_ed_score_2 = Integer.parseInt(scSecond.getText().toString());
        }
        if (TextUtils.isEmpty(scThird.getText().toString())) {
            snd_ed_score_3 = 0;
        } else {
            snd_ed_score_3 = Integer.parseInt(scThird.getText().toString());
        }
        if (TextUtils.isEmpty(scFourth.getText().toString())) {
            snd_ed_score_4 = 0;
        } else {
            snd_ed_score_4 = Integer.parseInt(scFourth.getText().toString());
        }
        if (TextUtils.isEmpty(scFifth.getText().toString())) {
            snd_ed_score_5 = 0;
        } else {
            snd_ed_score_5 = Integer.parseInt(scFifth.getText().toString());
        }

        //забираем имена игроков
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока
        String player_name_3 = getIntent().getExtras().getString("player_name_3");//имя третьего игрока
        String player_name_4 = getIntent().getExtras().getString("player_name_4");//имя второго игрока
        String player_name_5 = getIntent().getExtras().getString("player_name_5");//имя третьего игрока


        //исходящая информация
        Intent intent = new Intent(this, CalculActivity.class);
        //отсылаем имена
        intent.putExtra("player_name_1", player_name_1);
        intent.putExtra("player_name_2", player_name_2);
        intent.putExtra("player_name_3", player_name_3);
        intent.putExtra("player_name_4", player_name_4);
        intent.putExtra("player_name_5", player_name_5);

        //отсылаем очки
        intent.putExtra("SCORE_1", SCORE_1);
        intent.putExtra("SCORE_2", SCORE_2);
        intent.putExtra("SCORE_3", SCORE_3);
        intent.putExtra("SCORE_4", SCORE_4);
        intent.putExtra("SCORE_5", SCORE_5);

        //отсылаем посчитанные очки
        intent.putExtra("snd_ed_score_1", snd_ed_score_1);
        intent.putExtra("snd_ed_score_2", snd_ed_score_2);
        intent.putExtra("snd_ed_score_3", snd_ed_score_3);
        intent.putExtra("snd_ed_score_4", snd_ed_score_4);
        intent.putExtra("snd_ed_score_5", snd_ed_score_5);

        //отсылаем флаг Edit
        intent.putExtra("FLAG_EDIT", 2);
        //отсылаем флаг Активности
        intent.putExtra("FLAG_ACTIVITY", 5);
        startActivity(intent);
    }
    /**3-кнопка*/
    public void GoToCalc3(View view) {
        //входящая информация

        //забираем информацию об очках из TextView
        Integer SCORE_1 = Integer.parseInt(out_score_first.getText().toString());
        Integer SCORE_2 = Integer.parseInt(out_score_second.getText().toString());
        Integer SCORE_3 = Integer.parseInt(out_score_third.getText().toString());
        Integer SCORE_4 = Integer.parseInt(out_score_fourth.getText().toString());
        Integer SCORE_5 = Integer.parseInt(out_score_fifth.getText().toString());

        //забираем информацию об очках из EditText с условием о незаполненных полях
        if (TextUtils.isEmpty(scFirst.getText().toString())) {
            snd_ed_score_1 = 0;
        } else {
            snd_ed_score_1 = Integer.parseInt(scFirst.getText().toString());
        }
        if (TextUtils.isEmpty(scSecond.getText().toString())) {
            snd_ed_score_2 = 0;
        } else {
            snd_ed_score_2 = Integer.parseInt(scSecond.getText().toString());
        }
        if (TextUtils.isEmpty(scThird.getText().toString())) {
            snd_ed_score_3 = 0;
        } else {
            snd_ed_score_3 = Integer.parseInt(scThird.getText().toString());
        }
        if (TextUtils.isEmpty(scFourth.getText().toString())) {
            snd_ed_score_4 = 0;
        } else {
            snd_ed_score_4 = Integer.parseInt(scFourth.getText().toString());
        }
        if (TextUtils.isEmpty(scFifth.getText().toString())) {
            snd_ed_score_5 = 0;
        } else {
            snd_ed_score_5 = Integer.parseInt(scFifth.getText().toString());
        }

        //забираем имена игроков
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока
        String player_name_3 = getIntent().getExtras().getString("player_name_3");//имя третьего игрока
        String player_name_4 = getIntent().getExtras().getString("player_name_4");//имя второго игрока
        String player_name_5 = getIntent().getExtras().getString("player_name_5");//имя третьего игрока


        //исходящая информация
        Intent intent = new Intent(this, CalculActivity.class);
        //отсылаем имена
        intent.putExtra("player_name_1", player_name_1);
        intent.putExtra("player_name_2", player_name_2);
        intent.putExtra("player_name_3", player_name_3);
        intent.putExtra("player_name_4", player_name_4);
        intent.putExtra("player_name_5", player_name_5);

        //отсылаем очки
        intent.putExtra("SCORE_1", SCORE_1);
        intent.putExtra("SCORE_2", SCORE_2);
        intent.putExtra("SCORE_3", SCORE_3);
        intent.putExtra("SCORE_4", SCORE_4);
        intent.putExtra("SCORE_5", SCORE_5);

        //отсылаем посчитанные очки
        intent.putExtra("snd_ed_score_1", snd_ed_score_1);
        intent.putExtra("snd_ed_score_2", snd_ed_score_2);
        intent.putExtra("snd_ed_score_3", snd_ed_score_3);
        intent.putExtra("snd_ed_score_4", snd_ed_score_4);
        intent.putExtra("snd_ed_score_5", snd_ed_score_5);

        //отсылаем флаг Edit
        intent.putExtra("FLAG_EDIT", 3);
        //отсылаем флаг Активности
        intent.putExtra("FLAG_ACTIVITY", 5);
        startActivity(intent);
    }
    /**4-кнопка*/
    public void GoToCalc4(View view) {
        //входящая информация

        //забираем информацию об очках из TextView
        Integer SCORE_1 = Integer.parseInt(out_score_first.getText().toString());
        Integer SCORE_2 = Integer.parseInt(out_score_second.getText().toString());
        Integer SCORE_3 = Integer.parseInt(out_score_third.getText().toString());
        Integer SCORE_4 = Integer.parseInt(out_score_fourth.getText().toString());
        Integer SCORE_5 = Integer.parseInt(out_score_fifth.getText().toString());

        //забираем информацию об очках из EditText с условием о незаполненных полях
        if (TextUtils.isEmpty(scFirst.getText().toString())) {
            snd_ed_score_1 = 0;
        } else {
            snd_ed_score_1 = Integer.parseInt(scFirst.getText().toString());
        }
        if (TextUtils.isEmpty(scSecond.getText().toString())) {
            snd_ed_score_2 = 0;
        } else {
            snd_ed_score_2 = Integer.parseInt(scSecond.getText().toString());
        }
        if (TextUtils.isEmpty(scThird.getText().toString())) {
            snd_ed_score_3 = 0;
        } else {
            snd_ed_score_3 = Integer.parseInt(scThird.getText().toString());
        }
        if (TextUtils.isEmpty(scFourth.getText().toString())) {
            snd_ed_score_4 = 0;
        } else {
            snd_ed_score_4 = Integer.parseInt(scFourth.getText().toString());
        }
        if (TextUtils.isEmpty(scFifth.getText().toString())) {
            snd_ed_score_5 = 0;
        } else {
            snd_ed_score_5 = Integer.parseInt(scFifth.getText().toString());
        }

        //забираем имена игроков
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока
        String player_name_3 = getIntent().getExtras().getString("player_name_3");//имя третьего игрока
        String player_name_4 = getIntent().getExtras().getString("player_name_4");//имя второго игрока
        String player_name_5 = getIntent().getExtras().getString("player_name_5");//имя третьего игрока


        //исходящая информация
        Intent intent = new Intent(this, CalculActivity.class);
        //отсылаем имена
        intent.putExtra("player_name_1", player_name_1);
        intent.putExtra("player_name_2", player_name_2);
        intent.putExtra("player_name_3", player_name_3);
        intent.putExtra("player_name_4", player_name_4);
        intent.putExtra("player_name_5", player_name_5);

        //отсылаем очки
        intent.putExtra("SCORE_1", SCORE_1);
        intent.putExtra("SCORE_2", SCORE_2);
        intent.putExtra("SCORE_3", SCORE_3);
        intent.putExtra("SCORE_4", SCORE_4);
        intent.putExtra("SCORE_5", SCORE_5);

        //отсылаем посчитанные очки
        intent.putExtra("snd_ed_score_1", snd_ed_score_1);
        intent.putExtra("snd_ed_score_2", snd_ed_score_2);
        intent.putExtra("snd_ed_score_3", snd_ed_score_3);
        intent.putExtra("snd_ed_score_4", snd_ed_score_4);
        intent.putExtra("snd_ed_score_5", snd_ed_score_5);

        //отсылаем флаг Edit
        intent.putExtra("FLAG_EDIT", 4);
        //отсылаем флаг Активности
        intent.putExtra("FLAG_ACTIVITY", 5);
        startActivity(intent);
    }
    /**5-кнопка*/
    public void GoToCalc5(View view) {
        //входящая информация

        //забираем информацию об очках из TextView
        Integer SCORE_1 = Integer.parseInt(out_score_first.getText().toString());
        Integer SCORE_2 = Integer.parseInt(out_score_second.getText().toString());
        Integer SCORE_3 = Integer.parseInt(out_score_third.getText().toString());
        Integer SCORE_4 = Integer.parseInt(out_score_fourth.getText().toString());
        Integer SCORE_5 = Integer.parseInt(out_score_fifth.getText().toString());

        //забираем информацию об очках из EditText с условием о незаполненных полях
        if (TextUtils.isEmpty(scFirst.getText().toString())) {
            snd_ed_score_1 = 0;
        } else {
            snd_ed_score_1 = Integer.parseInt(scFirst.getText().toString());
        }
        if (TextUtils.isEmpty(scSecond.getText().toString())) {
            snd_ed_score_2 = 0;
        } else {
            snd_ed_score_2 = Integer.parseInt(scSecond.getText().toString());
        }
        if (TextUtils.isEmpty(scThird.getText().toString())) {
            snd_ed_score_3 = 0;
        } else {
            snd_ed_score_3 = Integer.parseInt(scThird.getText().toString());
        }
        if (TextUtils.isEmpty(scFourth.getText().toString())) {
            snd_ed_score_4 = 0;
        } else {
            snd_ed_score_4 = Integer.parseInt(scFourth.getText().toString());
        }
        if (TextUtils.isEmpty(scFifth.getText().toString())) {
            snd_ed_score_5 = 0;
        } else {
            snd_ed_score_5 = Integer.parseInt(scFifth.getText().toString());
        }

        //забираем имена игроков
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока
        String player_name_3 = getIntent().getExtras().getString("player_name_3");//имя третьего игрока
        String player_name_4 = getIntent().getExtras().getString("player_name_4");//имя второго игрока
        String player_name_5 = getIntent().getExtras().getString("player_name_5");//имя третьего игрока


        //исходящая информация
        Intent intent = new Intent(this, CalculActivity.class);
        //отсылаем имена
        intent.putExtra("player_name_1", player_name_1);
        intent.putExtra("player_name_2", player_name_2);
        intent.putExtra("player_name_3", player_name_3);
        intent.putExtra("player_name_4", player_name_4);
        intent.putExtra("player_name_5", player_name_5);

        //отсылаем очки
        intent.putExtra("SCORE_1", SCORE_1);
        intent.putExtra("SCORE_2", SCORE_2);
        intent.putExtra("SCORE_3", SCORE_3);
        intent.putExtra("SCORE_4", SCORE_4);
        intent.putExtra("SCORE_5", SCORE_5);

        //отсылаем посчитанные очки
        intent.putExtra("snd_ed_score_1", snd_ed_score_1);
        intent.putExtra("snd_ed_score_2", snd_ed_score_2);
        intent.putExtra("snd_ed_score_3", snd_ed_score_3);
        intent.putExtra("snd_ed_score_4", snd_ed_score_4);
        intent.putExtra("snd_ed_score_5", snd_ed_score_5);

        //отсылаем флаг Edit
        intent.putExtra("FLAG_EDIT", 5);
        //отсылаем флаг Активности
        intent.putExtra("FLAG_ACTIVITY", 5);
        startActivity(intent);
    }

}