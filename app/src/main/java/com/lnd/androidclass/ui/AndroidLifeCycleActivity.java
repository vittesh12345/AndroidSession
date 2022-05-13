package com.lnd.androidclass.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lnd.androidclass.R;

public class AndroidLifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_life_cycle);

    }
}