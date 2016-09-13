package com.welovemaths.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.welovekids.mathforkids.R;
import com.welovemaths.util.SaveIntegerData;

/**
 * Created by Janice
 */
public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        SaveIntegerData highscore = new SaveIntegerData(this,"highscore");
        TextView output = (TextView) findViewById(R.id.roundScore);
        output.append(String.valueOf(highscore.getData()));

    }
}
