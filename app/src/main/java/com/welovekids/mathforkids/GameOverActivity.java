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
        int correct = Integer.parseInt(Controller.getCorrect());
        int wrong = Integer.parseInt(Controller.getTotalIncorrect());
        int total = Controller.getTotalQuestions();
        int highscore = Controller.getHighScore();

        TextView totalCorrect = (TextView) findViewById(R.id.totalCorrect);
        totalCorrect.append(String.valueOf(correct));
//        TextView totalCorrect = (TextView) findViewById(R.id.totalCorrect);
//        totalCorrect.append(String.valueOf(correct));
//        TextView totalCorrect = (TextView) findViewById(R.id.totalCorrect);
//        totalCorrect.append(String.valueOf(correct));
//        TextView totalCorrect = (TextView) findViewById(R.id.totalCorrect);
//        totalCorrect.append(String.valueOf(correct));
        //Get gameCorrect, gameQuestions, gameWrong, highSocre
        //Set to textviews
        //TextView highScore = (TextView)findViewById(R.id.roundScore);

    }
}
