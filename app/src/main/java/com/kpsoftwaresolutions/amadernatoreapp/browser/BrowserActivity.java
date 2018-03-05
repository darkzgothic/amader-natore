package com.kpsoftwaresolutions.amadernatoreapp.browser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.kpsoftwaresolutions.amadernatoreapp.R;

/**
 * Created by zahid on 10/17/2017.
 */

public class BrowserActivity extends AppCompatActivity {
    private WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        browser = (WebView) findViewById(R.id.browser);
        WebSettings webSettings= browser.getSettings();
        webSettings.setJavaScriptEnabled(true);
        browser.getSettings().setSupportZoom(true);
        browser.getSettings().setBuiltInZoomControls(true);
        browser.getSettings().setDisplayZoomControls(true);
        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        browser.loadUrl(getIntent().getStringExtra("weblink"));
        browser.copyBackForwardList();
        browser.setWebViewClient(new WebViewClient());

        String title = getIntent().getStringExtra("title");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        toolbar.setTitle(title);

        //Banner
        MobileAds.initialize(this, "ca-app-pub-5910423341335020/5841521955");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
    @Override
    public void onBackPressed() {
        if(browser.canGoForward())
        {
            browser.canGoForward();
        } else
        {
            super.onBackPressed();
        }
    }
}


