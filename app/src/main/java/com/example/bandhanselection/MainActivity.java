package com.example.bandhanselection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.gesture.GestureLibraries;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
public class MainActivity extends AppCompatActivity {
    private AppBarConfiguration appBarConfiguration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
//        NavigationView navigationView = findViewById(R.id.nav_view);
//        appBarConfiguration =
//                new AppBarConfiguration.Builder( R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
//                        .setDrawerLayout(drawer)
//                        .build();
//
////        NavHostFragment navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment);
//        NavController navController =  Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        appBarConfiguration =
                new AppBarConfiguration.Builder(navController.getGraph()).build();
        Toolbar toolbar = findViewById(R.id.topAppBar);
        NavigationUI.setupWithNavController(
                toolbar, navController, appBarConfiguration);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.top_app_bar, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}