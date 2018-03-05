package com.kpsoftwaresolutions.amadernatoreapp.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.kpsoftwaresolutions.amadernatoreapp.R;
import com.kpsoftwaresolutions.amadernatoreapp.browser.BrowserActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class OtherInstituteFragment extends Fragment {

    private TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12;

    public OtherInstituteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_other_institute, container, false);

        //Banner
        MobileAds.initialize(getContext(), "ca-app-pub-5910423341335020/5841521955");

        AdView mAdView = (AdView) v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        text1 = (TextView) v.findViewById(R.id.tv1);
        text2 = (TextView) v.findViewById(R.id.tv2);
        text3 = (TextView) v.findViewById(R.id.tv3);
        text4 = (TextView) v.findViewById(R.id.tv4);
        text5 = (TextView) v.findViewById(R.id.tv5);
        text6 = (TextView) v.findViewById(R.id.tv6);
        text7 = (TextView) v.findViewById(R.id.tv7);
        text8 = (TextView) v.findViewById(R.id.tv8);
        text9 = (TextView) v.findViewById(R.id.tv9);
        text10 = (TextView) v.findViewById(R.id.tv10);
        text11 = (TextView) v.findViewById(R.id.tv11);
        text12 = (TextView) v.findViewById(R.id.tv12);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.jela_sports));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/page/8ec80329-1ab0-11e7-8120-286ed488c766/%E2%96%A1-%E0%A6%9C%E0%A7%87%E0%A6%B2%E0%A6%BE-%E0%A6%95%E0%A7%8D%E0%A6%B0%E0%A7%80%E0%A6%A1%E0%A6%BC%E0%A6%BE-%E0%A6%B8%E0%A6%82%E0%A6%B8%E0%A7%8D%E0%A6%A5%E0%A6%BE");
                startActivity(intent);
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.dis_otistic));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/page/ab0239c8-1ab0-11e7-8120-286ed488c766/%E2%96%A1-%E0%A6%A8%E0%A6%BE%E0%A6%9F%E0%A7%8B%E0%A6%B0-%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%A4%E0%A6%BF%E0%A6%AC%E0%A6%A8%E0%A7%8D%E0%A6%A7%E0%A7%80-%E0%A6%B8%E0%A6%82%E0%A6%B8%E0%A7%8D%E0%A6%A5%E0%A6%BE");
                startActivity(intent);
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.college));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/view/college/%E2%96%A1-%E0%A6%95%E0%A6%B2%E0%A7%87%E0%A6%9C");
                startActivity(intent);
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.sec_school));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/view/college/%E2%96%A1-%E0%A6%95%E0%A6%B2%E0%A7%87%E0%A6%9C");
                startActivity(intent);
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.pri_school));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/view/primary_school/%E2%96%A1-%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%BE%E0%A6%A5%E0%A6%AE%E0%A6%BF%E0%A6%95-%E0%A6%AC%E0%A6%BF%E0%A6%A6%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%AF%E0%A6%BC");
                startActivity(intent);
            }
        });

        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.mosque));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/view/madrasa/%E2%96%A1-%E0%A6%AE%E0%A6%BE%E0%A6%A6%E0%A7%8D%E0%A6%B0%E0%A6%BE%E0%A6%B8%E0%A6%BE");
                startActivity(intent);
            }
        });

        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.other_institutes));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/view/others/%E2%96%A1-%E0%A6%85%E0%A6%A8%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%A8%E0%A7%8D%E0%A6%AF-%E0%A6%B6%E0%A6%BF%E0%A6%95%E0%A7%8D%E0%A6%B7%E0%A6%BE-%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%A4%E0%A6%BF%E0%A6%B7%E0%A7%8D%E0%A6%A0%E0%A6%BE%E0%A6%A8%E0%A6%B8%E0%A6%AE%E0%A7%82%E0%A6%B9");
                startActivity(intent);
            }
        });

        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.bank));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/page/5e903c67-1ab0-11e7-8120-286ed488c766/%E2%96%A1-%E0%A6%AC%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%82%E0%A6%95");
                startActivity(intent);
            }
        });

        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.beema));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/page/5e903668-1ab0-11e7-8120-286ed488c766/%E2%96%A1-%E0%A6%AC%E0%A7%80%E0%A6%AE%E0%A6%BE");
                startActivity(intent);
            }
        });

        text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.ngo));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/page/e88cfeb1-1ab0-11e7-8120-286ed488c766/%E2%96%A1-%E0%A6%8F%E0%A6%A8%E0%A6%9C%E0%A6%BF%E0%A6%93");
                startActivity(intent);
            }
        });

        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.mondir));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/page/8ec80856-1ab0-11e7-8120-286ed488c766/%E2%96%A1-%E0%A6%AE%E0%A6%A8%E0%A7%8D%E0%A6%A6%E0%A6%BF%E0%A6%B0");
                startActivity(intent);
            }
        });

        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("title", getResources().getString(R.string.mosque2));
                intent.putExtra("weblink", "http://www.natore.gov.bd/site/page/61fee85d-1ab0-11e7-8120-286ed488c766/%E2%96%A1-%E0%A6%AE%E0%A6%B8%E0%A6%9C%E0%A6%BF%E0%A6%A6");
                startActivity(intent);
            }
        });
        return v;
    }

}
