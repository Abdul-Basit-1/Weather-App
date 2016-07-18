package com.example.abdulbasit.weatherapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.abdulbasit.weatherapplication.Fragment.Homefragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragmentToStack(new Homefragment());

    }

    @Override
    public int getDockFrameLayoutId() {
        return R.id.frame;
    }

    public <T> void changeActivity(Class<T> cls, boolean isActivityFinish) {
        Intent intent = new Intent(MainActivity.this, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        if (isActivityFinish) {
            finish();
        }
    }
}
