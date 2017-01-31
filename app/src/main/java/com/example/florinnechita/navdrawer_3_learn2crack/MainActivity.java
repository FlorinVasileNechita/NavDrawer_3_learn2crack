package com.example.florinnechita.navdrawer_3_learn2crack;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

// https://www.learn2crack.com/2014/06/android-sliding-navigation-drawer-example.html
public class MainActivity extends AppCompatActivity {

    String[] menu;

    DrawerLayout drawerLayout;
    ListView drawerListView;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = new String[]{"Test1", "Test2", "Test3", "Test4", "Test5", "Test6", "Test7", "Test8", "Test9", "Test10", "Test11", "Test12", "Test13", "Test14", "Test15"};

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerListView = (ListView) findViewById(R.id.left_drawer);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,menu);

        drawerListView.setAdapter(adapter);
        drawerListView.setSelector(android.R.color.holo_blue_bright);

        drawerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                drawerLayout.closeDrawers();
                Toast.makeText(view.getContext(),menu[position],Toast.LENGTH_SHORT).show();
            }
        });

    }
}
