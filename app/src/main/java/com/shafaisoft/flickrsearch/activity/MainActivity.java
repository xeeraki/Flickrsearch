package com.shafaisoft.flickrsearch.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.shafaisoft.flickrsearch.R;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ui.AppBarConfiguration;

public class MainActivity extends AppCompatActivity {
 private AppBarConfiguration mAppBarConfiguration;
    private static final int KEEP_TIME = 1000;
    private DrawerLayout mDrawer;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
                startActivity(intent);
                finish();
            }
        }, KEEP_TIME);
     mDrawer = (DrawerLayout)findViewById(R.id.drawer_layout);
     mToggle = new ActionBarDrawerToggle(this,mDrawer,R.string.navigation_drawer_open,R.string.
             navigation_drawer_close);

     mDrawer.addDrawerListener(mToggle);
     mToggle.syncState();
     getSupportActionBar().setDisplayHomeAsUpEnabled(true);

}
}