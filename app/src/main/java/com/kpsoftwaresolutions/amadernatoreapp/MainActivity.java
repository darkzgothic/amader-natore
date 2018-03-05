package com.kpsoftwaresolutions.amadernatoreapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kpsoftwaresolutions.amadernatoreapp.fragments.AboutDistrictFragment;
import com.kpsoftwaresolutions.amadernatoreapp.fragments.AboutFragment;
import com.kpsoftwaresolutions.amadernatoreapp.fragments.CallFragment;
import com.kpsoftwaresolutions.amadernatoreapp.fragments.EServiceFragment;
import com.kpsoftwaresolutions.amadernatoreapp.fragments.GovOfficeFragment;
import com.kpsoftwaresolutions.amadernatoreapp.fragments.ImportantCallFragment;
import com.kpsoftwaresolutions.amadernatoreapp.fragments.LocalGovFragment;
import com.kpsoftwaresolutions.amadernatoreapp.fragments.MapFragment;
import com.kpsoftwaresolutions.amadernatoreapp.fragments.OtherInstituteFragment;
import com.kpsoftwaresolutions.amadernatoreapp.fragments.OurNatoreFragment;
import com.kpsoftwaresolutions.amadernatoreapp.fragments.PhotoGalleryFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RewardedVideoAd mAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        OurNatoreFragment fragment = new OurNatoreFragment();
        ft.replace(R.id.content, fragment, fragment.getTag());
        ft.commit();

        FirebaseAnalytics mFirebaseAnalytics;
        String log = "MainActivity Started";
        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.VALUE, log);
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

        configAd();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void configAd() {
        //Rewarded Video
        mAd = MobileAds.getRewardedVideoAdInstance(this);
        mAd.loadAd("ca-app-pub-5910423341335020/7845525305", new AdRequest.Builder().build());
        mAd.setRewardedVideoAdListener(new RewardedVideoAdListener() {
            @Override
            public void onRewardedVideoAdLoaded() {

            }

            @Override
            public void onRewardedVideoAdOpened() {

            }

            @Override
            public void onRewardedVideoStarted() {

            }

            @Override
            public void onRewardedVideoAdClosed() {

            }

            @Override
            public void onRewarded(RewardItem rewardItem) {

            }

            @Override
            public void onRewardedVideoAdLeftApplication() {

            }

            @Override
            public void onRewardedVideoAdFailedToLoad(int i) {

            }
        });
    }

    public void showRewardedAd(){
        if(mAd.isLoaded()){
            mAd.show();
        }
        else {
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("আপনি কি অ্যাপ থেকে বের হতে চান?");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "হ্যাঁ",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    });

            builder1.setNegativeButton(
                    "না",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert11 = builder1.create();
            alert11.show();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_abou) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            AboutFragment fragment = new AboutFragment();
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.replace(R.id.content, fragment, fragment.getTag());
            ft.commit();
        }
        if (id == R.id.action_call){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            CallFragment fragment = new CallFragment();
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.replace(R.id.content, fragment, fragment.getTag());
            ft.commit();
        }

        if (id == R.id.action_exit){
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("আপনি কি অ্যাপ থেকে বের হতে চান?");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "হ্যাঁ",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    });

            builder1.setNegativeButton(
                    "না",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert11 = builder1.create();
            alert11.show();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.ac_amader_natore){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            OurNatoreFragment fragment = new OurNatoreFragment();
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.replace(R.id.content, fragment, fragment.getTag());
            ft.commit();
        }

        if (id == R.id.about_dis){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            AboutDistrictFragment fragment = new AboutDistrictFragment();
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.replace(R.id.content, fragment, fragment.getTag());
            ft.commit();
        }
        if (id == R.id.local_gov){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            LocalGovFragment fragment = new LocalGovFragment();
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.replace(R.id.content, fragment, fragment.getTag());
            ft.commit();
        }
        if (id == R.id.nav_slideshow){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            PhotoGalleryFragment fragment = new PhotoGalleryFragment();
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.replace(R.id.content, fragment, fragment.getTag());
            ft.commit();
        }
        if (id == R.id.e_service){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            EServiceFragment fragment = new EServiceFragment();
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.replace(R.id.content, fragment, fragment.getTag());
            ft.commit();
        }
        if (id == R.id.gov_office){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            GovOfficeFragment fragment = new GovOfficeFragment();
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.replace(R.id.content, fragment, fragment.getTag());
            ft.commit();
        }
        if (id == R.id.other_institute){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            OtherInstituteFragment fragment = new OtherInstituteFragment();
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.replace(R.id.content, fragment, fragment.getTag());
            ft.commit();
        }
        if (id == R.id.map){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            MapFragment fragment = new MapFragment();
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.replace(R.id.content, fragment, fragment.getTag());
            ft.commit();
        }

        if (id == R.id.call){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ImportantCallFragment fragment = new ImportantCallFragment();
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.replace(R.id.content, fragment, fragment.getTag());
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
