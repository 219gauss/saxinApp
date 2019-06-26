package com.sasin.s03test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class KeyActivity extends AppCompatActivity {

    private TextView keyNmae;
    private TextView keyValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key);

        keyNmae = (TextView) findViewById(R.id.keyName);
        keyValue = (TextView) findViewById(R.id.keyValue);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_0:
                keyNmae.setText("0".toString());
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_0));
                Log.d("pzp","KEYCODE_0 down");
                break;
            case KeyEvent.KEYCODE_1:
                keyNmae.setText("1");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_1));
                Log.d("pzp","KEYCODE_1 down");
                break;
            case KeyEvent.KEYCODE_2:
                keyNmae.setText("2");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_2));
                Log.d("pzp","KEYCODE_2 down");
                break;
            case KeyEvent.KEYCODE_3:
                keyNmae.setText("3");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_3));
                Log.d("pzp","KEYCODE_3 down");
                break;
            case KeyEvent.KEYCODE_4:
                keyNmae.setText("4");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_4));
                Log.d("pzp","KEYCODE_4 down");
                break;
            case KeyEvent.KEYCODE_5:
                keyNmae.setText("5");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_5));
                Log.d("pzp","KEYCODE_5 down");
                break;
            case KeyEvent.KEYCODE_6:
                keyNmae.setText("6");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_6));
                Log.d("pzp","KEYCODE_6 down");
                break;
            case KeyEvent.KEYCODE_7:
                keyNmae.setText("7");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_7));
                Log.d("pzp","KEYCODE_7 down");
                break;
            case KeyEvent.KEYCODE_8:
                keyNmae.setText("8");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_8));
                Log.d("pzp","KEYCODE_8 down");
                break;
            case KeyEvent.KEYCODE_9:
                keyNmae.setText("9");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_9));
                Log.d("pzp","KEYCODE_9 down");
                break;
            case KeyEvent.KEYCODE_STAR:
                keyNmae.setText("星号键");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_STAR));
                Log.d("pzp","KEYCODE_STAR down");
                break;
            case KeyEvent.KEYCODE_POUND:
                keyNmae.setText("井号键");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_POUND));
                Log.d("pzp","KEYCODE_POUND down");
                break;
            case 292: //KEYCODE_DIAL
                keyNmae.setText("重播键");
                keyValue.setText(String.valueOf(292));
                Log.d("pzp","KEYCODE_DIAL down");
                break;
            case 291:   //KEYCODE_REDIAL
                keyNmae.setText("拨号键");
                keyValue.setText(String.valueOf(291));
                Log.d("pzp","KEYCODE_REDIAL down");
                break;
            case 293: //KEYCODE_HANDFREE
                keyNmae.setText("免提键");
                keyValue.setText(String.valueOf(293));
                Log.d("pzp","KEYCODE_HANDFREE down");
                break;
            case 294:   //KEYCODE_WIFIAP
                keyNmae.setText("wifi热点键");
                keyValue.setText(String.valueOf(294));
                Log.d("pzp","KEYCODE_WIFIAP down");
                break;
            case KeyEvent.KEYCODE_DPAD_UP:
                keyNmae.setText("上");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_DPAD_UP));
                Log.d("pzp","KEYCODE_DPAD_UP down");
                break;
            case KeyEvent.KEYCODE_DPAD_DOWN:
                keyNmae.setText("下");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_DPAD_DOWN));
                Log.d("pzp","KEYCODE_DPAD_DOWN down");
                break;
            case KeyEvent.KEYCODE_DEL:
                keyNmae.setText("删除(左)");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_DEL));
                Log.d("pzp","KEYCODE_DEL down");
                break;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                keyNmae.setText("右");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_DPAD_RIGHT));
                Log.d("pzp","KEYCODE_DPAD_RIGHT down");
                break;
            case KeyEvent.KEYCODE_ENTER:
                keyNmae.setText("OK");
                keyValue.setText(String.valueOf(KeyEvent.KEYCODE_ENTER));
                Log.d("pzp","KEYCODE_ENTER down");
                break;
            case 284:   //KEYCODE_M1
                keyNmae.setText("快捷拨号1");
                keyValue.setText(String.valueOf(284));
                Log.d("pzp","KEYCODE_M1 down");
                break;
            case 285:   //KEYCODE_M2
                keyNmae.setText("快捷拨号2");
                keyValue.setText(String.valueOf(285));
                Log.d("pzp","KEYCODE_M2 down");
                break;
            case 286:   //KEYCODE_M3
                keyNmae.setText("快捷拨号3");
                keyValue.setText(String.valueOf(286));
                Log.d("pzp","KEYCODE_M3 down");
                break;
            case 287:   //KEYCODE_M4
                keyNmae.setText("快捷拨号4");
                keyValue.setText(String.valueOf(287));
                Log.d("pzp","KEYCODE_M4 down");
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

}
