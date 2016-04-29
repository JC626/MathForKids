package com.welovekids.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    private TextView switchStatus;
    private Switch basic;
    private Switch intermediate;
    private Switch advanced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        basic = (Switch) findViewById(R.id.basic);
        intermediate = (Switch) findViewById(R.id.intermediate);
        basic = (Switch) findViewById(R.id.advanced);
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
                }

            }
        });
    }


}
