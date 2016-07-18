package com.example.abdulbasit.weatherapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.abdulbasit.weatherapplication.Fragment.BaseSupportFragment;

/**
 * Created by abdul basit on 7/18/2016.
 */
public abstract class BaseActivity extends AppCompatActivity {

    public abstract int getDockFrameLayoutId();
    public static final String KEY_FRAGMENT = "firstfragment";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void addFragmentToStack(BaseSupportFragment fragment) {
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(getDockFrameLayoutId(), fragment);
        fragmentTransaction.addToBackStack(getSupportFragmentManager().getBackStackEntryCount() == 0 ? KEY_FRAGMENT : null)
                .commit();
    }

}
