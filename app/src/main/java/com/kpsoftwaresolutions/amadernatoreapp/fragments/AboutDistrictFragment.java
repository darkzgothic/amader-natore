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
import com.kpsoftwaresolutions.amadernatoreapp.activities.DCCommentsActivity;
import com.kpsoftwaresolutions.amadernatoreapp.activities.FamousPersonsActivity;
import com.kpsoftwaresolutions.amadernatoreapp.activities.HistoricalPlaceActivity;
import com.kpsoftwaresolutions.amadernatoreapp.activities.LanguageCultureActivity;
import com.kpsoftwaresolutions.amadernatoreapp.activities.NatoreInWarActivity;
import com.kpsoftwaresolutions.amadernatoreapp.activities.UpozillaUnionActivity;
import com.kpsoftwaresolutions.amadernatoreapp.activities.ZillaPotovumiActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutDistrictFragment extends Fragment {


    public AboutDistrictFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_about_district, container, false);

        TextView textView1 = (TextView) v.findViewById(R.id.txtvw1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ZillaPotovumiActivity.class));
            }
        });

        TextView textView2 = (TextView) v.findViewById(R.id.txtvw2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), UpozillaUnionActivity.class));
            }
        });

        TextView textView3 = (TextView) v.findViewById(R.id.txtvw3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), DCCommentsActivity.class));
            }
        });

        TextView textView4 = (TextView) v.findViewById(R.id.txtvw4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), HistoricalPlaceActivity.class));
            }
        });

        TextView textView5 = (TextView) v.findViewById(R.id.txtvw5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), LanguageCultureActivity.class));
            }
        });

        TextView textView6 = (TextView) v.findViewById(R.id.txtvw6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), FamousPersonsActivity.class));
            }
        });

        TextView textView7 = (TextView) v.findViewById(R.id.txtvw7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), NatoreInWarActivity.class));
            }
        });

        //Banner
        MobileAds.initialize(getContext(), "ca-app-pub-5910423341335020/5841521955");

        AdView mAdView = (AdView) v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        return v;
    }

}
