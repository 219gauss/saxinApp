package com.sasin.s03test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public class ScreenActivity extends AppCompatActivity {

    private View screenView;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        screenView = findViewById(R.id.screenView);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (i == 0) {
                screenView.setBackgroundColor(Color.rgb(255,0,0));
                i++;
            } else if (i == 1) {
                screenView.setBackgroundColor(Color.rgb(0,255,0));
                i++;
            } else {
                screenView.setBackgroundColor(Color.rgb(0,0,255));
                i = 0;
            }
        }
        return super.onTouchEvent(event);
    }
}
