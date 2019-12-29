package com.example.gerald.punzilaii;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gerald.punzilaii.adapter.SlidingMenuAdapter;
import com.example.gerald.punzilaii.model.ItemSlideMenu;

import java.util.ArrayList;
import java.util.List;


public class LogIn extends ActionBarActivity {

    private List<ItemSlideMenu> listSliding;
    private SlidingMenuAdapter adapter;
    private ListView listViewSliding;
    private DrawerLayout drawerLayout;
    private RelativeLayout mainContent;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView) findViewById(R.id.tVwelcome);
        tv.setText(username);


       /* //
        listViewSliding = (ListView) findViewById(R.id.lv_sliding_menu);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mainContent=(RelativeLayout)findViewById(R.id.main_content);
        listSliding=new ArrayList<>();
        //Add item sliding list
        listViewSliding.add(new ItemSlideMenu(R.drawable.ic_launcher,"Setting"));
        listViewSliding.add(new ItemSlideMenu(R.drawable.ic_launcher,"about"));
        listViewSliding.add(new ItemSlideMenu(R.drawable.ic_launcher,"Android"));
        adapter=new SlidingMenuAdapter(this,listSliding);
        listViewSliding.setAdapter(adapter);*/

    }
}
