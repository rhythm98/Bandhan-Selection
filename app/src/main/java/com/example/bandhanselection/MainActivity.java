package com.example.bandhanselection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import android.widget.Toast;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import androidx.appcompat.widget.Toolbar;
public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationView navigationView=findViewById(R.id.nav_view);
        drawer = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.topAppBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open_nav_desc,R.string.close_nav_desc);
        drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

//        navigationView.setNavigationItemSelectedListener(onNavigationItemSelected());
        //          Bottom Navigation
//        BottomNavigationView.OnNavigationItemSelectedListener { item ->
//                when (item.itemId) {
//            R.id.item1 -> {
//                // Respond to navigation item 1 click
//                true
//            }
//            R.id.item2 -> {
//                // Respond to navigation item 2 click
//                true
//            }
//        else -> false
//        }
//        }
//        bottomNavigation.setOnNavigationItemReselectedListener { item ->
//                when(item.itemId) {
//            R.id.item1 -> {
//                // Respond to navigation item 1 reselection
//            }
//            R.id.item2 -> {
//                // Respond to navigation item 2 reselection
//            }
//        }
//        }


//      AppBar:Top
//        topAppBar.setNavigationOnClickListener {
//            // Handle navigation icon press
//        }
//
//        topAppBar.setOnMenuItemClickListener { menuItem ->
//                when (menuItem.itemId) {
//            R.id.favorite -> {
//                // Handle favorite icon press
//                true
//            }
//            R.id.search -> {
//                // Handle search icon press
//                true
//            }
//            R.id.more -> {
//                // Handle more item (inside overflow menu) press
//                true
//            }
//        else -> false
//        }
//        }


//        Handle Navigation Drawer -> setNavigationItemSelectedListener to listen to item selection and implement your navigation logic.
//        https://material.io/develop/android/components/navigation-view
//        Header views
//        You can only add one header in the XML layout, but you can add multiple header views programmatically with addHeaderView(View)
//        (even if you already added one in the XML layout). You can use getHeaderView(int) to get any of the header views at runtime.

//        If you need to access the header view you added in the XML layout, that will always be the first header view,
//        so you can get it with getHeaderView(0).


        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder(navController.getGraph()).build();

        NavigationUI.setupWithNavController(
                toolbar, navController, appBarConfiguration);
    }


//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        return NavigationUI.navigateUp(navController, appBarConfiguration)
//                || super.onSupportNavigateUp();
//    }

//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//        switch (item.getItemId()){
//            case R.id.nav_home:
//                Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_SHORT).show();
//                drawer.closeDrawers();
//                return true;
//
//            case R.id.nav_gallery:
//                Toast.makeText(getApplicationContext(),"Gallery",Toast.LENGTH_SHORT).show();
//                drawer.closeDrawers();
//                return true;
//
//            case R.id.nav_slideshow:
//                Toast.makeText(getApplicationContext(),"Slideshow",Toast.LENGTH_SHORT).show();
//                drawer.closeDrawers();
//                return true;
//        }
//        return true;
//    }

    @Override
    public void onBackPressed() {
        if(this.drawer.isDrawerOpen(GravityCompat.START))
            this.drawer.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_app_bar,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.favorite:
                Toast.makeText(getApplicationContext(),"Favourite",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.search:
                Toast.makeText(getApplicationContext(),"ImageSearch",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.more:
                Toast.makeText(getApplicationContext(),"Log Out Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.more1:
                Toast.makeText(getApplicationContext(),"Fuck Off",Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}