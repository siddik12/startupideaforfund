package com.startupideaforfund.app;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.startupideaforfund.app.fragments.AboutFragment;
import com.startupideaforfund.app.fragments.AdvisorsFragment;
import com.startupideaforfund.app.fragments.ContactFragment;
import com.startupideaforfund.app.fragments.DaffodilBusinessIncubatorFragment;
import com.startupideaforfund.app.fragments.EntrepreneurshipFragment;
import com.startupideaforfund.app.fragments.GalleryFragment;
import com.startupideaforfund.app.fragments.HomeFragment;
import com.startupideaforfund.app.fragments.InnovationLabFragment;
import com.startupideaforfund.app.fragments.MethodologyFragment;
import com.startupideaforfund.app.fragments.SpeakersFragment;
import com.startupideaforfund.app.fragments.SponsorsFragment;
import com.startupideaforfund.app.fragments.VentureCapitalFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = new HomeFragment();
        fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        FragmentManager fm = getSupportFragmentManager();

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Fragment fragment = new HomeFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        } else if (id == R.id.nav_about) {
            Fragment fragment = new AboutFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        } else if (id == R.id.nav_advisors) {
            Fragment fragment = new AdvisorsFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        } else if (id == R.id.nav_speakers) {
            Fragment fragment = new SpeakersFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        } else if (id == R.id.nav_innovation_lab) {
            Fragment fragment = new InnovationLabFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        } else if (id == R.id.nav_sponsors) {
            Fragment fragment = new SponsorsFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        } else if (id == R.id.nav_contact) {
            Fragment fragment = new ContactFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        } else if (id == R.id.nav_business_incubator) {
            Fragment fragment = new DaffodilBusinessIncubatorFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        } else if (id == R.id.nav_venture_capital) {
            Fragment fragment = new VentureCapitalFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        } else if (id == R.id.nav_methodology) {
            Fragment fragment = new MethodologyFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        } else if (id == R.id.nav_entrepreneurship_development_fund) {
            Fragment fragment = new EntrepreneurshipFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        } else if (id == R.id.nav_gallery) {
            Fragment fragment = new GalleryFragment();
            fm.beginTransaction().replace(R.id.frame_layout,fragment).commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
