package com.kpsoftwaresolutions.amadernatoreapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kpsoftwaresolutions.amadernatoreapp.R;

public class DCCommentsActivity extends AppCompatActivity {

    private RewardedVideoAd mAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dccomments);

        configAd();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showRewardedAd();
            }
        });
        toolbar.setTitle(R.string.jela_proshashoker_barta);

        FirebaseAnalytics mFirebaseAnalytics;
        String log = "DC Comments Acivity Started";
        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.VALUE, log);
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

        //Banner
        MobileAds.initialize(this, "ca-app-pub-5910423341335020/5841521955");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
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
        super.onBackPressed();
        showRewardedAd();
    }
}
