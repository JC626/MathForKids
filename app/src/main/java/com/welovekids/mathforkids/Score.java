package com.welovekids.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.welovekids.util.SaveIntegerData;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        SaveIntegerData highscore = new SaveIntegerData(this,"highscore");
        TextView output = (TextView) findViewById(R.id.roundScore);
        output.append(String.valueOf(highscore.getData()));

    }
}
