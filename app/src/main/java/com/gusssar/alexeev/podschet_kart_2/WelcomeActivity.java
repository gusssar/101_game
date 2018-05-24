package com.gusssar.alexeev.podschet_kart_2;

import android.app.Dialog;
//import android.support.v4.app.Fragment
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {
    final int DIALOG_INFO = 1;
    final int DIALOG_PRICE = 2;
    final int DIALOG_INFO_FULL = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void GoToGameTwo(View view) {
        Intent intent = new Intent(this, TwoNameActivity.class);
        startActivity(intent);
    }

    public void GoToGameThree(View view) {
        Intent intent = new Intent(this, ThreeNameActivity.class);
        startActivity(intent);
    }

    public void GoToGameFour(View view) {
        Intent intent = new Intent(this, FourNameActivity.class);
        startActivity(intent);
    }

    public void GoToGameFive(View view) {
        Intent intent = new Intent(this, FiveNameActivity.class);
        startActivity(intent);
    }

 //   public void GoToGameInfo(View view) {
 //   }

    /** Процедура управления кнопкой назад*/
   @Override
   public void onBackPressed() {

       AlertDialog.Builder quitDialog = new AlertDialog.Builder(
               this);
       quitDialog.setTitle(R.string.WELCOME_EXIT);

       quitDialog.setPositiveButton(R.string.WELCOME_YES, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
                    //эмуляция закрытия приложения под скрытие
                   Intent startMain = new Intent(Intent.ACTION_MAIN);
                   startMain.addCategory(Intent.CATEGORY_HOME);
                   startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                   startActivity(startMain);
               }
       });

       quitDialog.setNegativeButton(R.string.WELCOME_NO, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
           }
       });

       quitDialog.show();
   }


    public void Info (View v){
        //changeCount();
        switch (v.getId()) {
            case R.id.imageButtonRules:
                showDialog(DIALOG_INFO);
                break;
            case R.id.imageButtonPrice:
                showDialog(DIALOG_PRICE);
                break;
            case R.id.GameInfo:
                showDialog(DIALOG_INFO_FULL);
            default:
                break;
        }
    }

    protected Dialog onCreateDialog (int id){
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            switch (id){
                case DIALOG_INFO:
                    adb.setTitle(R.string.GameRulesTitle);
                    adb.setMessage(R.string.GameRulesShortList);
                    adb.setIcon(android.R.drawable.ic_menu_info_details);
                    break;
                case DIALOG_PRICE:
                    adb.setTitle(R.string.PriceTitle);
                    adb.setMessage(R.string.PriceList);
                    adb.setIcon(android.R.drawable.ic_menu_help);
                    break;
                case DIALOG_INFO_FULL:
                    adb.setTitle(R.string.GameRulesTitle);
                    adb.setMessage(R.string.GameRulesFullList);
                    break;
            }
            return adb.create();
        }

    public void Test(View view) {
        Intent intent = new Intent(this, WinActivity.class);
        intent.putExtra("player_name", "тест");
        startActivity(intent);
    }
}
