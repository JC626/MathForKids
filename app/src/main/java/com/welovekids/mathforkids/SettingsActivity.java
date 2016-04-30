package com.welovekids.mathforkids;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.welovekids.util.Controller;

public class SettingsActivity extends AppCompatActivity {

    private static boolean basicB = true;
    private static boolean intermediateB = false;
    private static boolean advancedB = false;
    private static boolean muted = false;
    private Switch basic;
    private Switch intermediate;
    private Switch advanced;
    private Switch mute;
    MediaPlayer mp;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        basic = (Switch) findViewById(R.id.basic);
        intermediate = (Switch) findViewById(R.id.intermediate);
        advanced = (Switch) findViewById(R.id.advanced);
        mute = (Switch) findViewById(R.id.mute);
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this);
        muted=sp.getBoolean("mute",false);


        //set the switch to OFF
        mute.setChecked(muted);
        basic.setChecked(basicB);
        intermediate.setChecked(intermediateB);
        advanced.setChecked(advancedB);

        //attach a listener to check for changes in state
        basic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    basicB = true;
                    if (basicB == true) {
                        intermediateB = false;
                        advancedB = false;
                        basic.setChecked(basicB);
                        intermediate.setChecked(intermediateB);
                        advanced.setChecked(advancedB);
                    }
                    Controller.setRange(1);
                }

            }
        });
        intermediate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    intermediateB = true;
                    if (intermediateB == true) {
                        basicB = false;
                        advancedB = false;
                        basic.setChecked(basicB);
                        intermediate.setChecked(intermediateB);
                        advanced.setChecked(advancedB);
                    }
                    Controller.setRange(2);
                }

            }
        });
        advanced.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    advancedB = true;
                    if (advancedB == true) {
                        intermediateB = false;
                        basicB = false;
                        basic.setChecked(basicB);
                        intermediate.setChecked(intermediateB);
                        advanced.setChecked(advancedB);
                    }
                    Controller.setRange(3);
                }

            }
        });

        mute.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(SettingsActivity.this);
                sp.edit().putBoolean("mute", isChecked).commit();

            }
        });


    }
}
