package com.example.ebookmanagementsystem;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class NavigationDrawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=findViewById(R.id.drawer_layout);
        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        if (savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new com.example.ebookmanagementsystem.HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
        }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new com.example.ebookmanagementsystem.HomeFragment()).commit();
                break;
            case R.id.rate:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new com.example.ebookmanagementsystem.Fragments.RateApp()).commit();
                break;
            case R.id.aboutus:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new com.example.ebookmanagementsystem.Fragments.AboutUs()).commit();
                break;
            case R.id.terms:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new com.example.ebookmanagementsystem.Fragments.TermsAndCondition()).commit();
                break;
            case R.id.setting:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new com.example.ebookmanagementsystem.Fragments.Settings()).commit();
                break;
            case R.id.materials:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new com.example.ebookmanagementsystem.Fragments.MaterialsFragment()).commit();
                break;


        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }


    }
}
