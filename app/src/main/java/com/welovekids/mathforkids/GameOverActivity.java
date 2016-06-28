package com.welovekids.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.welovekids.util.Controller;
import com.welovekids.util.SaveIntegerData;

public class GameOverActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
      Total correctly answered questions
      for all the rounds completed
      (Must reach the game over screen
      when the timer is 0)
     */
        SaveIntegerData overallCorrect = new SaveIntegerData(this, "overallCorrect");
        SaveIntegerData highscore = new SaveIntegerData(this, "highscore");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        TextView totalCorrect = (TextView) findViewById(R.id.roundCorrect);
        int correct = Integer.parseInt(Controller.getCorrect());
        if(correct > highscore.getData()){
            highscore.setData(correct);
            TextView newScore = (TextView) findViewById(R.id.newHighscore);
            newScore.setText("You have a new highscore of " + Controller.getCorrect());
        }
        overallCorrect.setData(correct + overallCorrect.getData());
        totalCorrect.append(Controller.getCorrect());

        TextView totalWrong = (TextView) findViewById(R.id.roundIncorrect);
        totalWrong.append(Controller.getTotalIncorrect());
        TextView totalQuestions = (TextView) findViewById(R.id.roundAnswered);
        totalQuestions.append(String.valueOf(Controller.getTotalQuestions()));


    }
}
