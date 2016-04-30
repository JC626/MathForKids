package com.welovekids.mathforkids;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.welovekids.util.Controller;
import com.welovekids.util.Highscore;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Highscore highscore = new Highscore(this);
        TextView output = (TextView) findViewById(R.id.roundScore);
        output.append(String.valueOf(highscore.getHighScore()));

    }
}
