package com.example.ebookmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_class);
    }

    public void twelve(View view) {
        Intent intent=new Intent(this,NavigationDrawer.class);
        startActivity(intent);
    }

    public void eleven(View view) {
        Intent intent=new Intent(this,NavigationDrawer.class);
        startActivity(intent);
    }
}
