package com.example.megatek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private static int DELAY_TIME = 3000; // 3 seconds
    private Handler mHandler = new Handler();
    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            // Remove the introductory screen
            removeIntroLayout();

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       showIntroLayout();


    }
    private void showIntroLayout() {
        setContentView(R.layout.intro);

        // Delay the removal of the introductory screen
        mHandler.postDelayed(mRunnable, DELAY_TIME);
    }
    private void removeIntroLayout() {
        //setContentView(R.layout.activity_main);
        Intent x =new Intent(this,Login.class);
        startActivity(x);
        finish();

    }

}