package com.example.abdulbasit.weatherapplication.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.abdulbasit.weatherapplication.MainActivity;

/**
 * Created by abdul basit on 7/18/2016.
 */

public class BaseSupportFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);  }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    public MainActivity getMainActivity() {
        return (MainActivity) getActivity();
    }
}
