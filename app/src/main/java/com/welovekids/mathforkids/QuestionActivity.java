package com.welovekids.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QuestionActivity extends AppCompatActivity {
    private int currentResult;
    public QuestionActivity(){
        currentResult=0;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

    }
}
