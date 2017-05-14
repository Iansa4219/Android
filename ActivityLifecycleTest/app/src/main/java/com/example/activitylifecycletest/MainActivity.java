package com.example.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //findViewById(R.id.edit_text);
        Log.i(TAG, "In onCreat invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "In onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "In onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "In onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "In onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "In onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "In onDestroy invoked");
    }
}
