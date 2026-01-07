package com.example.project7;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Definisi LOG_TAG agar tidak error
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "---------");
        Log.d(LOG_TAG, "onCreate");
    }

    public void openActivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
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
    protected void onRestart() { super.onRestart(); Log.d(LOG_TAG, "onRestart"); }

    @Override
    protected void onDestroy() { super.onDestroy(); Log.d(LOG_TAG, "onDestroy"); }
}