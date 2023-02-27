package com.example.megatek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        TextView Gotosp = findViewById(R.id.gotosnp);
        Gotosp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeview();
            }
        });
    }

    public void changeview(){
        Intent Signp = new Intent(this,Signup.class);
        startActivity(Signp);
    }



}