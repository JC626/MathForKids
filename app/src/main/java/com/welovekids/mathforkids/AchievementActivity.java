package com.welovekids.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.welovekids.util.Controller;
import com.welovekids.util.SaveIntegerData;

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
        final ImageView trophy7 = (ImageView) findViewById(R.id.trophy7);
        final ImageView trophy8 = (ImageView) findViewById(R.id.trophy8);

        SaveIntegerData highscore = new SaveIntegerData(this,"highscore");
        SaveIntegerData overallCorrect = new SaveIntegerData(this,"overallCorrect");
        //Highscore trophies
        if (highscore.getData() >= 10) {
            //yellowtrophy for 10 Q ans
            trophy1.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy1.setImageResource(R.drawable.graytrophy);
        }

        if (highscore.getData() >= 20) {
            //yellowtrophy for 20 Q ans
            trophy2.setImageResource(R.drawable.yellowtrophy);

        }else {
            trophy2.setImageResource(R.drawable.graytrophy);
        }
        if (highscore.getData() >= 30) {
            //yellowtrophy for 30 Q ans
            trophy3.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy3.setImageResource(R.drawable.graytrophy);
        }


        if (highscore.getData() >= 40) {
            //yellowtrophy for 40 Q ans
            trophy4.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy4.setImageResource(R.drawable.graytrophy);
        }
        //Total questions correct trophies
        int allCorrect = overallCorrect.getData();
        if (allCorrect >= 50) {
            //yellowtrophy for 50 Q ans
            trophy5.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy5.setImageResource(R.drawable.graytrophy);
        }
        if (allCorrect >= 100) {
            //yellowtrophy for 100 Q ans
            trophy6.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy6.setImageResource(R.drawable.graytrophy);
        }

        if (allCorrect >=500) {
            //yellowtrophy for 100 Q ans
            trophy7.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy7.setImageResource(R.drawable.graytrophy);
        }
        if (allCorrect >= 1000) {
            //yellowtrophy for 1000 Q ans
            trophy8.setImageResource(R.drawable.yellowtrophy);
        }else {
            trophy8.setImageResource(R.drawable.graytrophy);
        }
    }
}
