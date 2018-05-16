package com.gusssar.alexeev.podschet_kart_2;

import android.support.v7.app.AppCompatActivity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//public class TwoGameActivity extends Activity implements OnClickListener {
public class TwoGameActivity extends AppCompatActivity implements OnClickListener {
    Button btnRun;
    TextView out_score_first, out_score_second;
    EditText scFirst, scSecond;
    int SCORE_1 = 0;
    int SCORE_2 = 0;
    //для диалога
    final int DIALOG_PRICE = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_game);

        btnRun = (Button) findViewById(R.id.btnRun);
        btnRun.setOnClickListener(this);

        scFirst = (EditText) findViewById(R.id.score_first);
        scSecond = (EditText) findViewById(R.id.score_second);

        out_score_first = (TextView) findViewById(R.id.out_score_first);
        out_score_second = (TextView) findViewById(R.id.out_score_second);


        /** Имена игроков из предыдущей активности*/
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока

        String total= getResources().getString(R.string.total);

        TextView PlayerName1 = (TextView) findViewById(R.id.TextNamePlayer1);
        TextView PlayerName2 = (TextView) findViewById(R.id.TextNamePlayer2);
        TextView PlayerSum1 = (TextView) findViewById(R.id.TextSumPlayer1);
        TextView PlayerSum2 = (TextView) findViewById(R.id.TextSumPlayer2);
        PlayerName1.setText(player_name_1);
        PlayerName2.setText(player_name_2);
        PlayerSum1.setText(total+" "+player_name_1+":");
        PlayerSum2.setText(total+" "+player_name_2+":");

        Integer SCORE_1 = getIntent().getExtras().getInt("SCORE_1");//очки из предыдущей игры первого игрока
        Integer SCORE_2 = getIntent().getExtras().getInt("SCORE_2");//очки из предыдущей игры второго игрока

        out_score_first.setText(Integer.toString(SCORE_1));
        out_score_second.setText(Integer.toString(SCORE_2));
    }

    @Override
    public void onClick(View v) {

        String sc_first = scFirst.getText().toString();
        String sc_second = scSecond.getText().toString();

        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока

        String TOAST_TO_ZERO= getResources().getString(R.string.TOAST_TO_ZERO);

         //Integer SCORE_1 = getIntent().getExtras().getInt("SCORE_1");//очки из предыдущей игры первого игрока
         //Integer SCORE_2 = getIntent().getExtras().getInt("SCORE_2");//очки из предыдущей игры второго игрока


        switch (v.getId()) {

            case R.id.btnRun:
                if (TextUtils.isEmpty(scFirst.getText().toString()) || TextUtils.isEmpty(scSecond.getText().toString())) {
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.TOAST_INPUT_FIELDS, Toast.LENGTH_LONG);
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

                    /**Проверка обнуления очков*/

                    if (SCORE_1 == 101) {
                        SCORE_1 = 0;
                        out_score_first.setText(Integer.toString(0));
                        scFirst.setText("");
                        //Toast toast = Toast.makeText(getApplicationContext(), player_name_1 + " обнуляет результат!", Toast.LENGTH_LONG);

                        //String pl_n_1= R.string.TOAST_TO_ZERO.getText().toString();
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


                    /**Проверка окончания игры*/
                    /**У всех перебор*/
                    if (SCORE_1 > 101 &&
                            SCORE_2 > 101) {
                        //здесь должна быть ссылка на проигрыш всех Death.class
//                    Toast toast = Toast.makeText(getApplicationContext(), "Камон! Такого не бывает! Давай сначала!", Toast.LENGTH_LONG);
//                    toast.show();
                        Intent intent = new Intent(this, WelcomeActivity.class);
                        startActivity(intent);
                    }

                    /**У всех кроме одного*/
                    if (SCORE_2 > 101) {
                        //здесь должна быть ссылка на выигранную игру Win.class
                        //передача имени игрока 1
                        Intent intent = new Intent(this, WinActivity.class);
                        intent.putExtra("player_name", player_name_1);
                        startActivity(intent);
                    }
                    if (SCORE_1 > 101) {
                        //здесь должна быть ссылка на выигранную игру Win.class
                        //передача имени игрока 2
                        Intent intent = new Intent(this, WinActivity.class);
                        intent.putExtra("player_name", player_name_2);
                        startActivity(intent);
                    }
                }
        }
    }

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

    public void GoToCalc1(View view) {
        //входящая информация

        //забираем информацию об очках из TextView
        Integer snd_score_1  = Integer.parseInt(out_score_first.getText().toString());
        Integer snd_score_2 = Integer.parseInt(out_score_second.getText().toString());

        //забираем имена игроков
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока


        //исходящая информация
        Intent intent = new Intent(this, CalculActivity.class);
        //отсылаем имена
        intent.putExtra("player_name_1", player_name_1);
        intent.putExtra("player_name_2", player_name_2);
        //отсылаем очки
        intent.putExtra("snd_score_1", snd_score_1);
        intent.putExtra("snd_score_2", snd_score_2);
        startActivity(intent);
    }
    public void GoToCalc2(View view) {

        //входящая информация
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока

        //исходящая информация
        Intent intent = new Intent(this, CalculActivity.class);
        intent.putExtra("player_name_1", player_name_1);
        intent.putExtra("player_name_2", player_name_2);
        intent.putExtra("SCORE_1", SCORE_1);
        intent.putExtra("SCORE_2", SCORE_2);
        startActivity(intent);
    }

}



