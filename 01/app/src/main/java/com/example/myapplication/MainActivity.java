package com.example.myapplication;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String MY_TAG = "Lifecycle test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG, "1.This is OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, "2.This is onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, "3.This is onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, "This is onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG, "This is onStop");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i(MY_TAG, "This is onSaveInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG, "This is onDestroy");
    }
}
