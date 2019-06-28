package com.sasin.s03test;

import android.app.Activity;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.RandomAccessFile;

public class s03Test extends AppCompatActivity {

    private String TAG = "s03Test";
    private Button ledTest;
    private Button wifiTest;
    private Button bluetoothTest;
    private boolean ledState = false;
    private Button trumpetTest;
    private boolean trumpetState = true;
    private Button cameraTest;
    private Button simTest;
    private Button keyTest;
    private Button tpTest;
    private Button recordingTest;
    private Button screenTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s03_test);
        Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE) ;
        final Ringtone mRingtone = RingtoneManager.getRingtone(this,uri);


        bluetoothTest = (Button) findViewById(R.id.bluetoothTest);
        bluetoothTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.provider.Settings.ACTION_BLUETOOTH_SETTINGS);
                startActivity(intent);
            }
        });

        wifiTest = (Button)findViewById(R.id.wifiTest);
        wifiTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("android.net.wifi.PICK_WIFI_NETWORK");
                startActivity(intent);
            }
        });

        ledTest = (Button)findViewById(R.id.ledTest);
        ledTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ledState) {
                    restoreDeviceValue(new File("/sys/class/sasin_gpios/sasin_gpio92/ledctrl"), "0x0");//熄灭
                    ledState = false;
                }else {
                    restoreDeviceValue(new File("/sys/class/sasin_gpios/sasin_gpio92/ledctrl"), "0x1");//点亮
                    ledState = true;
                }
            }
        });

        trumpetTest = (Button)findViewById(R.id.trumpetTest);
        trumpetTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (trumpetState){
                    mRingtone.play();
                    trumpetState = false;
                }else {
                    mRingtone.stop();
                    trumpetState = true;
                }
            }
        });

        cameraTest = (Button)findViewById(R.id.cameraTest);
        cameraTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("org.codeaurora.snapcam");
                startActivity(intent);
            }
        });

        simTest = (Button)findViewById(R.id.simTest);
        simTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.SimStatus");
                startActivity(intent);
            }
        });

        keyTest = (Button)findViewById(R.id.keyTest);
        keyTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s03Test.this,KeyActivity.class);
                startActivity(intent);
            }
        });

        tpTest = (Button)findViewById(R.id.tpTest);
        tpTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(s03Test.this,TpActivity.class);
//                startActivity(intent);

            }
        });

        recordingTest = (Button)findViewById(R.id.recordingTest);
        recordingTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.android.soundrecorder");
                startActivity(intent);
            }
        });

        screenTest = (Button)findViewById(R.id.screenTest);
        screenTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s03Test.this,ScreenActivity.class);
                startActivity(intent);
            }
        });
    }

    public void restoreDeviceValue(final File file, final String value) {
        if (file.exists()) {
            try {
                Log.d(TAG, "restoreDeviceValue value:"+value);
                RandomAccessFile rdf = null;
                rdf = new RandomAccessFile(file, "rw");
                rdf.writeBytes(value);
                rdf.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Log.e(TAG, "File:" + file + "not exists");
        }
    }
}
