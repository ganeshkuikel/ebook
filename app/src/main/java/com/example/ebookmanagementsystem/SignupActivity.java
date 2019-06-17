package com.example.ebookmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void clickforsignIn(View view) {
        Intent intent = new Intent(SignupActivity.this, MainActivity.class);
        startActivity(intent);

    }

    public void _clicksignup(View view) {

        Intent intent = new Intent(SignupActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
