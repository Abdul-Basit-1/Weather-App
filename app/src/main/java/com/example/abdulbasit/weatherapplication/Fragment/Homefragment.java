package com.example.abdulbasit.weatherapplication.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abdulbasit.weatherapplication.Helper.GpsTracker;
import com.example.abdulbasit.weatherapplication.R;

/**
 * Created by abdul basit on 7/18/2016.
 */
public class Homefragment extends BaseSupportFragment {
    View mItemView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mItemView = inflater.inflate(R.layout.home_fragment,container,false);
        return mItemView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GpsTracker gpsTracker = new GpsTracker(getContext(),getActivity());
        Log.d("LOCATION",gpsTracker.getLatitude() + "\n" + gpsTracker.getLongitude());
    }
}
