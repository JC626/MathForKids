package com.welovekids.mathforkids;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.welovekids.util.Controller;

public class SettingsActivity extends AppCompatActivity {

    private static boolean basicB;
    private static boolean intermediateB;
    private static boolean advancedB;
    private Switch basic;
    private Switch intermediate;
    private Switch advanced;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        basic = (Switch) findViewById(R.id.basic);
        intermediate = (Switch) findViewById(R.id.intermediate);
        advanced = (Switch) findViewById(R.id.advanced);
        //set the switch to OFF
        basic.setChecked(false);
        intermediate.setChecked(false);
        advanced.setChecked(false);
        //attach a listener to check for changes in state
        basic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    basic.setChecked(true);
                    intermediate.setChecked(false);
                    advanced.setChecked(false);
                    Controller.setRange(1);
                }

            }
        });
        intermediate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    basic.setChecked(false);
                    intermediate.setChecked(true);
                    advanced.setChecked(false);
                    Controller.setRange(2);
                }

            }
        });
        advanced.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    basic.setChecked(false);
                    intermediate.setChecked(false);
                    advanced.setChecked(true);
                    Controller.setRange(3);
                }

            }
        });
    }


}
