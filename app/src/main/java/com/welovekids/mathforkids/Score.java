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

        TextView totalCorrect = (TextView) findViewById(R.id.totalCorrect);
        totalCorrect.append(Controller.getCorrect());
        TextView totalWrong = (TextView) findViewById(R.id.totalWrong);
        totalWrong.append(Controller.getTotalIncorrect());
        TextView totalQuestions = (TextView) findViewById(R.id.totalQuestions);
        totalQuestions.append(String.valueOf(Controller.getTotalQuestions()));
    }
}
