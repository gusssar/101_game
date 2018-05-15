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
            selected_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);

        mView = (TextView) findViewById(R.id.debug_edit);
    }

    public void ShowRes (View view) {
        int total = 0;
        RadioGroup radio_1 = (RadioGroup)findViewById(R.id.rad_group_1 );
        RadioGroup radio_2 = (RadioGroup)findViewById(R.id.rad_group_2 );
        RadioGroup radio_3 = (RadioGroup)findViewById(R.id.rad_group_3 );

        selected_1 = radio_1.getCheckedRadioButtonId();
        selected_2 = radio_2.getCheckedRadioButtonId();
        selected_3 = radio_3.getCheckedRadioButtonId();

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

        mView.setText("Итого " + total);
    }

    public void GoBack(View view) {
        String player_name_1 = getIntent().getExtras().getString("player_name_1");//имя первого игрока
        String player_name_2 = getIntent().getExtras().getString("player_name_2");//имя второго игрока
        Integer SCORE_1 = getIntent().getExtras().getInt("SCORE_1");//очки из предыдущей игры первого игрока
        Integer SCORE_2 = getIntent().getExtras().getInt("SCORE_2");//очки из предыдущей игры второго игрока

        Intent intent = new Intent(this, TwoGameActivity.class);
        intent.putExtra("player_name_1", player_name_1);
        intent.putExtra("player_name_2", player_name_2);
        intent.putExtra("SCORE_1", SCORE_1);
        intent.putExtra("SCORE_2", SCORE_2);
        startActivity(intent);
    }
}
