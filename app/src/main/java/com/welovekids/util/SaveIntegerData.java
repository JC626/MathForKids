package com.welovekids.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by megan on 01-May-16.
 */
public class SaveIntegerData {
    private final SharedPreferences preferences;
    private final String name;
    public SaveIntegerData(Context context, String name) {
        this.name = name;
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public int getData() {
        return preferences.getInt(name,0);
    }

    public void setData(int score) {
        preferences.edit().putInt(name, score).apply();
    }
}
