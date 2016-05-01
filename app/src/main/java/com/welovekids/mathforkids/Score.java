package com.welovekids.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.welovekids.util.Controller;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TextView highscore = (TextView) findViewById(R.id.roundScore);
        highscore.append(String.valueOf(Controller.getHighScore()));

    }
}
