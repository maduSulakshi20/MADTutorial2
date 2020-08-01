package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.xml.transform.Templates;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: invoked  ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: invoked  ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: invoked  ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: invoked  ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: invoked  ");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: invoked  ");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textMsg2 = findViewById(R.id.tvMsg2);
        textMsg2.setText(R.string.Msg2);


        Log.i(TAG, "onCreate: invoked  ");

    }
}