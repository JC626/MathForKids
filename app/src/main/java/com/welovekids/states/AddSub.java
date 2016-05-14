package com.welovekids.states;

import com.welovekids.util.Controller;
import com.welovekids.util.Question;
import com.welovekids.util.QuestionImpl;

/**
 * Created by dean on 30/04/16.
 */
public class AddSub implements State {


    private int correct;
    private int incorrect;

    private String question;

    public Question getQuestion() {
        int digit1 = (int) generateRandomNumber();
        int digit2 = (int) generateRandomNumber();
        char operator = getOperator();
        //Switch digits around so don't get integers
        if(digit1 < digit2 && operator == '-'){
            int temp = digit1;
            digit1 = digit2;
            digit2 = temp;
        }
        int answer = (int)Controller.getAnswer(digit1, digit2, operator);
        return new QuestionImpl("" + digit1 + operator + digit2, String.valueOf(answer), String.valueOf(operator));


    }

    public int getCorrectAnswered() {
        return correct;
    }

    @Override
    public char getOperator() {
        double val = Math.random();
        if (val < 0.5) {
            return '+';
        } else {
            return '-';
        }
    }

    public int getIncorrectlyAnswered() {
        return incorrect;
    }

    public String getAnswer(Question g) {
        return g.getAnswer();
    }

    public void setCorrectAnswered(int correct) {
        this.correct = correct;
    }

    public void setIncorrectlyAnswered(int incorrect) {
        this.incorrect = incorrect;
    }

    public double generateRandomNumber() {
        return (1 * (10* (Controller.range-1)) + Math.random() * (10*Controller.range));
    }
}
