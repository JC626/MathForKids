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

    public String getTotalString() {
        return "" + currentResult;
    }

    public void setTotal(String n) {
        currentResult = convertToNumber(n);
    }

    public void add(String n) {
        currentResult += convertToNumber(n);
    }

    public void subtract(String n) {
        currentResult -= convertToNumber(n);
    }

    public void multiply(String n) {
        currentResult *= convertToNumber(n);
    }

    public void divide(String n) {
        currentResult /= convertToNumber(n);
    }

    private int convertToNumber(String n) {
        return Integer.parseInt(n);
    }




}
