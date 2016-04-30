package com.welovekids.mathforkids;

import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.welovekids.util.Controller;

public class MainActivity extends AppCompatActivity {

    Score score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Retrieve high score
//        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
//        Controller.setHighScore(pref.getInt("Highscore", Controller.getHighScore()));
        SharedPreferences mPrefs = getSharedPreferences("label", 0);
        String mString = mPrefs.getString("tag", "default_value_if_variable_not_found");
        SharedPreferences.Editor mEditor = mPrefs.edit();
        mEditor.putString("tag", String.valueOf(Controller.getHighScore())).commit();
        // Create buttons and add action listeners
        Button score = (Button) findViewById(R.id.score);

        score.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Score.class);
                startActivity(intent);
            }
        });
        Button start = (Button) findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
                startActivity(intent);
            }
        });

        Button acheive = (Button) findViewById(R.id.acheive);
        acheive.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AchievementActivity.class);
                startActivity(intent);
            }
        });

        Button settings = (Button) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }


}
