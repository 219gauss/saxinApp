package com.sasin.s03test;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp);

        Intent intent = new Intent("com.android.S03SystemTest.pointerLocation");
        intent.putExtra("extra_data", "enable_PointerLocation");
        sendBroadcast(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent("com.android.S03SystemTest.pointerLocation");
        intent.putExtra("extra_data", "disable_PointerLocation");
        sendBroadcast(intent);
    }
}
