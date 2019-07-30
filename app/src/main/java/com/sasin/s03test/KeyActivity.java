package com.sasin.s03test;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class KeyActivity extends AppCompatActivity {

    private TextView key_M1;
    private TextView key_M2;
    private TextView key_M3;
    private TextView key_M4;
    private TextView key_1;
    private TextView key_2;
    private TextView key_3;
    private TextView key_4;
    private TextView key_5;
    private TextView key_6;
    private TextView key_7;
    private TextView key_8;
    private TextView key_9;
    private TextView key_star;
    private TextView key_0;
    private TextView key_pound;
    private TextView key_voldown;
    private TextView key_volup;
    private TextView key_redial;
    private TextView key_wifiap;
    private TextView key_up;
    private TextView key_ok;
    private TextView key_left;
    private TextView key_right;
    private TextView key_down;
    private TextView key_power;
    private TextView key_handfree;
    private TextView key_dial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key);

        key_M1 = (TextView)findViewById(R.id.key_M1);
        key_M2 = (TextView)findViewById(R.id.key_M2);
        key_M3 = (TextView)findViewById(R.id.key_M3);
        key_M4 = (TextView)findViewById(R.id.key_M4);
        key_1 = (TextView)findViewById(R.id.key_1);
        key_2 = (TextView)findViewById(R.id.key_2);
        key_3 = (TextView)findViewById(R.id.key_3);
        key_4 = (TextView)findViewById(R.id.key_4);
        key_5 = (TextView)findViewById(R.id.key_5);
        key_6 = (TextView)findViewById(R.id.key_6);
        key_7 = (TextView)findViewById(R.id.key_7);
        key_8 = (TextView)findViewById(R.id.key_8);
        key_9 = (TextView)findViewById(R.id.key_9);
        key_star = (TextView)findViewById(R.id.key_star);
        key_0 = (TextView)findViewById(R.id.key_0);
        key_pound = (TextView)findViewById(R.id.key_pound);
        key_voldown = (TextView)findViewById(R.id.key_voldown);
        key_volup = (TextView)findViewById(R.id.key_volup);
        key_redial = (TextView)findViewById(R.id.key_redial);
        key_wifiap = (TextView)findViewById(R.id.key_wifiap);
        key_up = (TextView)findViewById(R.id.key_up);
        key_ok = (TextView)findViewById(R.id.key_ok);
        key_left = (TextView)findViewById(R.id.key_left);
        key_right = (TextView)findViewById(R.id.key_right);
        key_down = (TextView)findViewById(R.id.key_down);
        key_power = (TextView)findViewById(R.id.key_power);
        key_handfree = (TextView)findViewById(R.id.key_handfree);
        key_dial = (TextView)findViewById(R.id.key_dial);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_0:
                key_0.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_0 down");
                break;
            case KeyEvent.KEYCODE_1:
                key_1.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_1 down");
                break;
            case KeyEvent.KEYCODE_2:
                key_2.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_2 down");
                break;
            case KeyEvent.KEYCODE_3:
                key_3.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_3 down");
                break;
            case KeyEvent.KEYCODE_4:
                key_4.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_4 down");
                break;
            case KeyEvent.KEYCODE_5:
                key_5.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_5 down");
                break;
            case KeyEvent.KEYCODE_6:
                key_6.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_6 down");
                break;
            case KeyEvent.KEYCODE_7:
                key_7.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_7 down");
                break;
            case KeyEvent.KEYCODE_8:
                key_8.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_8 down");
                break;
            case KeyEvent.KEYCODE_9:
                key_9.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_9 down");
                break;
            case KeyEvent.KEYCODE_STAR:
                key_star.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_STAR down");
                break;
            case KeyEvent.KEYCODE_POUND:
                key_pound.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_POUND down");
                break;
            case 292: //KEYCODE_DIAL
                key_dial.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_DIAL down");
                break;
            case 291:   //KEYCODE_REDIAL
                key_redial.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_REDIAL down");
                break;
            case 293: //KEYCODE_HANDFREE
                key_handfree.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_HANDFREE down");
                break;
            case 294:   //KEYCODE_WIFIAP
                key_wifiap.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_WIFIAP down");
                break;
            case KeyEvent.KEYCODE_DPAD_UP:
                key_up.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_DPAD_UP down");
                break;
            case KeyEvent.KEYCODE_DPAD_DOWN:
                key_down.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_DPAD_DOWN down");
                break;
            case KeyEvent.KEYCODE_DPAD_LEFT:
                key_left.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_DPAD_LEFT down");
                break;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                key_right.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_DPAD_RIGHT down");
                break;
            case KeyEvent.KEYCODE_ENTER:
                key_ok.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_ENTER down");
                break;
            case 284:   //KEYCODE_M1
                key_M1.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_M1 down");
                break;
            case 285:   //KEYCODE_M2
                key_M2.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_M2 down");
                break;
            case 286:   //KEYCODE_M3
                key_M3.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_M3 down");
                break;
            case 287:   //KEYCODE_M4
                key_M4.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_M4 down");
                break;
            case KeyEvent.KEYCODE_VOLUME_UP:
                key_volup.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_VOLUME_UP down");
                break;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                key_voldown.setBackgroundColor(Color.GRAY);
                Log.d("pzp","KEYCODE_VOLUME_DOWN down");
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

}
