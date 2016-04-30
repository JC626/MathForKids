package com.welovekids.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.welovekids.util.Controller;

public class AchievementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement);

        TextView totalQuestions1 = (TextView) findViewById(R.id.totalQuestions1);
        final ImageView solved = (ImageView) findViewById(R.id.solved);

        if (Controller.getTotalQuestions() == 1) {
            //trophy for one Q ans
            solved.setImageResource(R.drawable.trophy);
        }


        if (Controller.getTotalQuestions() == 5) {
            //trophy for 5 Q ans
            solved.setImageResource(R.drawable.trophy);
        }


    }
}
