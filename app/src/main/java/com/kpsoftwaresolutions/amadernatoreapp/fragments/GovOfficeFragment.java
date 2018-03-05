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
public class GovOfficeFragment extends Fragment {

    private static TextView text1, text2,text3, text4, text5, text6,text7,text8,text9,text10,text11,text12,text13;

    public GovOfficeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gov_office, container, false);

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
                intent.putExtra("weblink","http://dpe.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.jela_shikkha_office));
                startActivity(intent);

            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://dpe.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.jela_prathomik));
                startActivity(intent);
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://sports.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.jela_krira));
                startActivity(intent);

            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://police.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.police_super));
                startActivity(intent);

            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://fireservice.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.badc));
                startActivity(intent);
            }
        });
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://dnc.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.fire_service));
                startActivity(intent);
            }
        });


        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://dae.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.madok));
                startActivity(intent);
            }
        });
        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://shilpakala.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.agri_dev));
                startActivity(intent);
            }
        });
        text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://cs.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.jela_shilpo));
                startActivity(intent);
            }
        });
        text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://post.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.civil_surgon));
                startActivity(intent);
            }
        });
        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://www.ais.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.first_post));
                startActivity(intent);
            }
        });
        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://rhd.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.sorok_o_jonopod));
                startActivity(intent);
            }
        });

        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), BrowserActivity.class);
                intent.putExtra("weblink","http://brta.natore.gov.bd/");
                intent.putExtra("title", getResources().getString(R.string.brta));
                startActivity(intent);
            }
        });

        return v;
    }

}
