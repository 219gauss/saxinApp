package com.sasin.s03test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TpActivity extends AppCompatActivity {

    private float x = 0f;
    private float y = 0f;
    private TextView tpX;
    private TextView tpY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp);

        tpX = (TextView) findViewById(R.id.tpX);
        tpY = (TextView) findViewById(R.id.tpY);
        tpX.setText(Float.toString(x));
        tpY.setText(Float.toString(y));
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY();
        tpX.setText(Float.toString(x));
        tpY.setText(Float.toString(y));
        return super.onTouchEvent(event);
    }

}
