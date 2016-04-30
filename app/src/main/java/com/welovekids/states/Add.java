package com.welovekids.states;

import com.welovekids.util.Controller;
import com.welovekids.util.Question;
import com.welovekids.util.QuestionImpl;

/**
 * Created by dean on 30/04/16.
 */
public class Add implements State {

    private int correct;
    private int incorrect;
    private String question;

    @Override
    public Question getQuestion() {
        int digit1 = (int) generateRandomNumber();
        int digit2 = (int) generateRandomNumber();
        char operator = getOperator();
        double answer = Controller.getAnswer(digit1, digit2, operator);
        return new QuestionImpl("" + digit1 + operator + digit2, String.valueOf(answer), String.valueOf(operator));


    }

    @Override
    public int getCorrectAnswered() {
        return correct++;
    }

    @Override
    public char getOperator() {
        return '+';
    }

    @Override
    public int getIncorrectlyAnswered() {
        return incorrect--;
    }

    @Override
    public String getAnswer(Question g) {
        return g.getAnswer();
    }

    @Override
    public void setCorrectAnswered(int correct) {
        this.correct = correct;
    }

    @Override
    public void setIncorrectlyAnswered(int incorrect) {
        this.incorrect = incorrect;
    }

    @Override
    public double generateRandomNumber() {
        return (1 * Controller.range) + Math.random() * ((Math.random() * Controller.max) * Controller.range);
    }
}