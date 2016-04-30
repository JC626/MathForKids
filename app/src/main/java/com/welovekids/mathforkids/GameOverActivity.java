package com.welovekids.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.welovekids.util.Controller;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        TextView totalCorrect = (TextView) findViewById(R.id.roundCorrect);
        totalCorrect.append(Controller.getCorrect());
        TextView totalWrong = (TextView) findViewById(R.id.roundIncorrect);
        totalWrong.append(Controller.getTotalIncorrect());
        TextView totalQuestions = (TextView) findViewById(R.id.roundAnswered);
        totalQuestions.append(String.valueOf(Controller.getTotalQuestions()));


    }
}
