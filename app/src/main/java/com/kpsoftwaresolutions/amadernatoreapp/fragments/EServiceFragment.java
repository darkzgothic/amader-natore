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
public class EServiceFragment extends Fragment {


    private static TextView text1, text2,text3, text4, text5, text6,text7,text8,text9,text10,text11,text12,text13;

    public EServiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_e_service, container, false);

        //Banner
        MobileAds.initialize(getContext(), "ca-app-pub-5910423341335020/5841521955");

        AdView mAdView = (AdView) v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        text1 = (TextView)v.findViewById(R.id.tv1);
        text2 = (TextView)v.findViewById(R.id.tv2);
        text3 = (TextView)v.findViewById(R.id.tv3);
        text4 = (TextView)v.findViewById(R.id.tv4);
        text5 = (TextView)v.findViewById(R.id.tv5);
        text6 = (TextView)v.findViewById(R.id.tv6);
        text7 = (TextView)v.findViewById(R.id.tv7);
        text8 = (TextView)v.findViewById(R.id.tv8);
        text9 = (TextView)v.findViewById(R.id.tv9);
        text10 = (TextView)v.findViewById(R.id.tv10);
        text11 = (TextView)v.findViewById(R.id.tv11);
        text12 = (TextView)v.findViewById(R.id.tv12);
        text13 = (TextView)v.findViewById(R.id.tv13);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://nothi.gov.bd/users/login/");
                intent.putExtra("title", getResources().getString(R.string.nothi));
                startActivity(intent);

            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://nothi.gov.bd/downloadApp/");
                intent.putExtra("title", getResources().getString(R.string.down_nothi_app));
                startActivity(intent);
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://online.forms.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.online_seba));
                startActivity(intent);

            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://উত্তরাধিকার.বাংলা/");
                intent.putExtra("title", getResources().getString(R.string.uttoradhikar_cal));
                startActivity(intent);

            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://www.forms.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.nari_o_shishu));
                startActivity(intent);
            }
        });
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://www.forms.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.bd_form));
                startActivity(intent);
            }
        });


        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://www.infokosh.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.national_e_service));
                startActivity(intent);
            }
        });
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://services.portal.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.seba_kunja));
                startActivity(intent);
            }
        });
        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://www.ebook.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.e_book));
                startActivity(intent);
            }
        });
        text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://www.natore.gov.bd/site/eservices/d9c5aaa9-84ec-4be6-b081-54d748ea7ba0/%E0%A6%A8%E0%A6%BE%E0%A6%97%E0%A6%B0%E0%A6%BF%E0%A6%95-%E0%A6%86%E0%A6%AC%E0%A7%87%E0%A6%A6%E0%A6%A8");
                intent.putExtra("title", getResources().getString(R.string.nagorik_abedon));
                startActivity(intent);
            }
        });
        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://www.ais.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.agri_news));
                startActivity(intent);
            }
        });
        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://bdlaws.minlaw.gov.bd/?language=bangla&page=home/");
                intent.putExtra("title", getResources().getString(R.string.bd_law));
                startActivity(intent);
            }
        });

        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://www.natore.gov.bd/site/eservices/fdb26386-b847-4262-938d-8d1e4a586a96/%E0%A6%B8%E0%A6%B0%E0%A7%8D%E0%A6%AC%E0%A6%B6%E0%A7%87%E0%A6%B7-%E0%A6%85%E0%A6%AC%E0%A6%B8%E0%A7%8D%E0%A6%A5%E0%A6%BE-%E0%A6%9C%E0%A6%BE%E0%A6%A8%E0%A7%81%E0%A6%A8");
                intent.putExtra("title", getResources().getString(R.string.know_last_update));
                startActivity(intent);
            }
        });

        return v;
    }

}
