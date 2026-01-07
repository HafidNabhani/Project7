package com.example.project7;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(LOG_TAG, "---------");
        Log.d(LOG_TAG, "onCreate");
    }

    @Override
    protected void onStart() { super.onStart(); Log.d(LOG_TAG, "onStart"); }

    @Override
    protected void onResume() { super.onResume(); Log.d(LOG_TAG, "onResume"); }

    @Override
    protected void onPause() { super.onPause(); Log.d(LOG_TAG, "onPause"); }

    @Override
    protected void onStop() { super.onStop(); Log.d(LOG_TAG, "onStop"); }

    @Override
    protected void onDestroy() { super.onDestroy(); Log.d(LOG_TAG, "onDestroy"); }
}