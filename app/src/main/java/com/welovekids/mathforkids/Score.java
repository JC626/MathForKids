package com.welovekids.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TextView totalCorrect = (TextView) findViewById(R.id.totalCorrect);
        TextView totalWrong = (TextView) findViewById(R.id.totalWrong);
        TextView totalQuestions = (TextView) findViewById(R.id.totalQuestions);
    }
}
