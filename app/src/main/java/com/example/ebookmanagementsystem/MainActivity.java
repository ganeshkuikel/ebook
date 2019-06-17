package com.example.ebookmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void clickforsignup(View view) {
        Intent intent = new Intent(MainActivity.this, SignupActivity.class);
        startActivity(intent);
    }

    public void clickforforgetpassword(View view) {
        Intent intent = new Intent(MainActivity.this, ForgetPassword.class);
        startActivity(intent);

    }

    public void clicksignin(View view) {
        Intent intent = new Intent(MainActivity.this, ChooseClass.class);
        startActivity(intent);
    }
}
