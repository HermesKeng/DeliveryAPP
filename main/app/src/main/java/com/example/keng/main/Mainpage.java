package com.example.keng.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Mainpage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener ,NewOrderFragment3.ListComplete{
        int index=0;
    HomeFragment homeFragment;
    NewOrderFragment newOrderFragment;
    HistoryMainFragment historyMainFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if(savedInstanceState==null){
            homeFragment=new HomeFragment();
            newOrderFragment=new NewOrderFragment();
            historyMainFragment=new HistoryMainFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.frame,homeFragment).commit();
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if(id==R.id.nav_home){
            if(index!=0){
                switchFragment(homeFragment,index);
                index=0;
            }
        }else if(id==R.id.nav_newOrder){
            if(index!=1){
                switchFragment(newOrderFragment,index);
                index=1;
            }

        }else if(id==R.id.nav_history){
            if(index!=2){
                switchFragment(historyMainFragment,index);
                index=2;
            }

        }else if(id==R.id.nav_setting){

        }else if(id==R.id.nav_logout){

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void switchFragment(Fragment to,int index){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        switch (index){
            case 0:
                if(!to.isAdded()){
                    transaction.addToBackStack(null);
                    transaction.add(R.id.frame,to).hide(homeFragment).commit();
                }else {
                    transaction.addToBackStack(null);
                    transaction.show(to).hide(homeFragment).commit();
                }
                break;
            case 1:
                if(!to.isAdded()){
                    transaction.addToBackStack(null);
                    transaction.add(R.id.frame,to).hide(newOrderFragment).commit();
                }else {
                    transaction.addToBackStack(null);
                    transaction.show(to).hide(newOrderFragment).commit();
                }
                break;
            case 2:
                if(!to.isAdded()){
                    transaction.addToBackStack(null);
                    transaction.add(R.id.frame,to).hide(historyMainFragment).commit();
                }else {
                    transaction.addToBackStack(null);
                    transaction.show(to).hide(historyMainFragment).commit();
                }
                break;


        }


    }
    @Override
    public void setIndex(int i){
        index=i;
        Log.d(getClass().getSimpleName(),"index 已更新");
    }
}
