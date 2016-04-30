package com.welovekids.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by megan on 01-May-16.
 */
public class Highscore {
    SharedPreferences preferences;

    public Highscore(Context context) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public int getHighScore() {
        return preferences.getInt("highscore",0);
    }

    public void setHighscore(int score) {
        if(score > getHighScore()) {
            preferences.edit().putInt("highscore", score).commit();
        }
    }
}
