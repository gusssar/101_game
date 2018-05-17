package com.gusssar.alexeev.podschet_kart_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CalculActivity extends AppCompatActivity {

    private TextView mView;
    private int selected_1,
                selected_2,
                selected_3,
                selected_4,
                selected_5,
                selected_6,
                selected_7,
                selected_8,
                selected_9,
                selected_ql,
                selected_qh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);

        mView = (TextView) findViewById(R.id.debug_total);

        //String SCORE_1 = getIntent().getExtras().getString("snd_score_1");//очки из предыдущей игры первого игрока
        //Integer SCORE_2 = getIntent().getExtras().getInt("snd_score_2");
    }

    public void ShowRes (View view) {
        int total = 0;
        RadioGroup radio_1 = (RadioGroup)findViewById(R.id.rad_group_1 );//6-ки
        RadioGroup radio_2 = (RadioGroup)findViewById(R.id.rad_group_2 );//7-ки
        RadioGroup radio_3 = (RadioGroup)findViewById(R.id.rad_group_3 );//8-ки
        RadioGroup radio_4 = (RadioGroup)findViewById(R.id.rad_group_4 );//9-ки
        RadioGroup radio_5 = (RadioGroup)findViewById(R.id.rad_group_5 );//10-ки
        RadioGroup radio_6 = (RadioGroup)findViewById(R.id.rad_group_6 );//Вальты
        RadioGroup radio_7 = (RadioGroup)findViewById(R.id.rad_group_7 );//Дамы
        RadioGroup radio_8 = (RadioGroup)findViewById(R.id.rad_group_8 );//Короли
        RadioGroup radio_9 = (RadioGroup)findViewById(R.id.rad_group_9 );//Тузы
        RadioGroup radio_ql = (RadioGroup)findViewById(R.id.rad_group_q_last );//Дамы последнего сброса
        RadioGroup radio_qh = (RadioGroup)findViewById(R.id.rad_group_q_hand );//Одинокие Дамы на руках

        /**отслеживание положения RadioGroup*/
        selected_1 = radio_1.getCheckedRadioButtonId();
        selected_2 = radio_2.getCheckedRadioButtonId();
        selected_3 = radio_3.getCheckedRadioButtonId();
        selected_4 = radio_4.getCheckedRadioButtonId();
        selected_5 = radio_5.getCheckedRadioButtonId();
        selected_6 = radio_6.getCheckedRadioButtonId();
        selected_7 = radio_7.getCheckedRadioButtonId();
        selected_8 = radio_8.getCheckedRadioButtonId();
        selected_9 = radio_9.getCheckedRadioButtonId();
        selected_ql = radio_ql.getCheckedRadioButtonId();
        selected_qh = radio_qh.getCheckedRadioButtonId();

        switch (selected_1){
            case R.id.radio_1_0:{break;}
            case R.id.radio_1_1:{total =total + 6;break;}
            case R.id.radio_1_2:{total =total + 12;break;}
            case R.id.radio_1_3:{total =total + 18;break;}
            case R.id.radio_1_4:{total =total + 24;break;}
        }

        switch (selected_2){
            case R.id.radio_2_0:{break;}
            case R.id.radio_2_1:{total =total + 7;break;}
            case R.id.radio_2_2:{total =total + 14;break;}
            case R.id.radio_2_3:{total =total + 21;break;}
            case R.id.radio_2_4:{total =total + 28;break;}
        }

        switch (selected_3){
            case R.id.radio_3_0:{break;}
            case R.id.radio_3_1:{total =total + 8;break;}
            case R.id.radio_3_2:{total =total + 16;break;}
            case R.id.radio_3_3:{total =total + 24;break;}
            case R.id.radio_3_4:{total =total + 32;break;}
        }

        switch (selected_4){
            case R.id.radio_4_0:{break;}
            case R.id.radio_4_1:{total =total + 9;break;}
            case R.id.radio_4_2:{total =total + 18;break;}
            case R.id.radio_4_3:{total =total + 27;break;}
            case R.id.radio_4_4:{total =total + 36;break;}
        }

        switch (selected_5){
            case R.id.radio_5_0:{break;}
            case R.id.radio_5_1:{total =total + 10;break;}
            case R.id.radio_5_2:{total =total + 20;break;}
            case R.id.radio_5_3:{total =total + 30;break;}
            case R.id.radio_5_4:{total =total + 40;break;}
        }

        switch (selected_6){
            case R.id.radio_6_0:{break;}
            case R.id.radio_6_1:{total =total + 2;break;}
            case R.id.radio_6_2:{total =total + 4;break;}
            case R.id.radio_6_3:{total =total + 6;break;}
            case R.id.radio_6_4:{total =total + 8;break;}
        }

        switch (selected_7){
            case R.id.radio_7_0:{break;}
            case R.id.radio_7_1:{total =total + 3;break;}
            case R.id.radio_7_2:{total =total + 6;break;}
            case R.id.radio_7_3:{total =total + 9;break;}
            case R.id.radio_7_4:{total =total + 12;break;}
        }

        switch (selected_8){
            case R.id.radio_8_0:{break;}
            case R.id.radio_8_1:{total =total + 4;break;}
            case R.id.radio_8_2:{total =total + 8;break;}
            case R.id.radio_8_3:{total =total + 12;break;}
            case R.id.radio_8_4:{total =total + 16;break;}
        }

        switch (selected_9){
            case R.id.radio_9_0:{break;}
            case R.id.radio_9_1:{total =total + 11;break;}
            case R.id.radio_9_2:{total =total + 22;break;}
            case R.id.radio_9_3:{total =total + 33;break;}
            case R.id.radio_9_4:{total =total + 44;break;}
        }

        switch (selected_ql){
            case R.id.radio_q_0:{break;}
            case R.id.radio_q_20:{total =total - 20;break;}
            case R.id.radio_q_40:{total =total - 40;break;}
        }

        switch (selected_qh){
            case R.id.radio_q_h_0:{break;}
            case R.id.radio_q_h_20:{total =total + 20;break;}
            case R.id.radio_q_h_40:{total =total + 40;break;}
        }



        mView.setText(Integer.toString(total));
    }

    Integer TOTAL_1, TOTAL_2;

    public void GoBack(View view) {
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока
        Integer SCORE_1 = getIntent().getExtras().getInt("SCORE_1");//очки из предыдущей игры первого игрока
        Integer SCORE_2 = getIntent().getExtras().getInt("SCORE_2");//очки из предыдущей игры второго игрока
        Integer SCORE_ED_1 = getIntent().getExtras().getInt("snd_ed_score_1");//посчитанные очки из предыдущей игры первого игрока
        Integer SCORE_ED_2 = getIntent().getExtras().getInt("snd_ed_score_2");//посчитанные очки из предыдущей игры второго игрока
        Integer FLAG_EDIT =getIntent().getExtras().getInt("FLAG_EDIT");

        Integer TOTAL = Integer.parseInt(mView.getText().toString());//забираем посчитанные очки
        if (FLAG_EDIT==1){
            TOTAL_1 = TOTAL;
            TOTAL_2 = SCORE_ED_2;
            //return;
        }
        if (FLAG_EDIT==2){
            TOTAL_1 = SCORE_ED_1;
            TOTAL_2 = TOTAL;
        }

        /**Высылаем обратно*/
        Intent intent = new Intent(this, TwoGameActivity.class);
        intent.putExtra("player_name_1", player_name_1);
        intent.putExtra("player_name_2", player_name_2);
        intent.putExtra("SCORE_1", SCORE_1);
        intent.putExtra("SCORE_2", SCORE_2);
        intent.putExtra("TOTAL_1", TOTAL_1);//передача посчитанных очков первого игрока
        intent.putExtra("TOTAL_2", TOTAL_2);//передача посчитанных очков второго игрока
        startActivity(intent);
    }
}
