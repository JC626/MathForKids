package com.welovekids.mathforkids;

import android.os.SystemClock;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.welovekids.util.Controller;

public class AchievementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement);

        final ImageView trophy1 = (ImageView) findViewById(R.id.trophy1);
        final ImageView trophy2 = (ImageView) findViewById(R.id.trophy2);
        final ImageView trophy3 = (ImageView) findViewById(R.id.trophy3);
        final ImageView trophy4 = (ImageView) findViewById(R.id.trophy4);
        final ImageView trophy5 = (ImageView) findViewById(R.id.trophy5);
        final ImageView trophy6 = (ImageView) findViewById(R.id.trophy6);
        final ImageView trophy7 = (ImageView) findViewById(R.id.trophy6);
        final ImageView trophy8 = (ImageView) findViewById(R.id.trophy6);

        if (Integer.parseInt(Controller.getCorrect()) >= 1) {
            //yellowtrophy for one Q ans
            trophy1.setImageResource(R.drawable.yellowtrophy);
            System.out.println("it's suppose to be yellow");
            System.out.println(Controller.getTotalQuestions());
        }else {
            trophy1.setImageResource(R.drawable.graytrophy);
        }


        if (Integer.parseInt(Controller.getCorrect()) >= 5) {
            //yellowtrophy for 5 Q ans
            trophy2.setImageResource(R.drawable.yellowtrophy);

        }else {
            trophy2.setImageResource(R.drawable.graytrophy);
        }
        if (Integer.parseInt(Controller.getCorrect()) >= 10) {
            //yellowtrophy for 10 Q ans
            trophy3.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy3.setImageResource(R.drawable.graytrophy);
        }


        if (Integer.parseInt(Controller.getCorrect()) >= 20) {
            //yellowtrophy for 20 Q ans
            trophy4.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy4.setImageResource(R.drawable.graytrophy);
        }
        if (Integer.parseInt(Controller.getCorrect()) >= 50) {
            //yellowtrophy for 50 Q ans
            trophy5.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy5.setImageResource(R.drawable.graytrophy);
        }
        if (Integer.parseInt(Controller.getCorrect()) >= 100) {
            //yellowtrophy for 100 Q ans
            trophy6.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy6.setImageResource(R.drawable.graytrophy);
        }

        if (Integer.parseInt(Controller.getCorrect()) >= 50) {
            //yellowtrophy for 100 Q ans
            trophy6.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy6.setImageResource(R.drawable.graytrophy);
        }
        if (Integer.parseInt(Controller.getCorrect()) >= 100) {
            //yellowtrophy for 100 Q ans
            trophy6.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy6.setImageResource(R.drawable.graytrophy);
        }
    }
}
