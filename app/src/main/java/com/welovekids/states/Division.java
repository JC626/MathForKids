package com.welovekids.states;

import com.welovekids.util.Controller;
import com.welovekids.util.Question;
import com.welovekids.util.QuestionImpl;

/**
 * Created by chris on 30/04/2016.
 */
public class Division implements State {
    private int correct = 0;
    private int incorrect = 0;

    @Override
    public int getCorrectAnswered() {
        return correct;
    }

    @Override
    public int getIncorrectlyAnswered() {
        return incorrect;
    }

    @Override
    public Question getQuestion() {
        int digit1 = (int) generateRandomNumber();
        int digit2 = (int) generateRandomNumber();
        char operator = getOperator();
        int answer = Controller.getAnswer(digit1, digit2, operator);
        return new QuestionImpl("" + digit1 + operator + digit2,
                String.valueOf(answer), String.valueOf(operator));
    }

    @Override
    public String getAnswer(Question q) {
        return q.getAnswer();
    }

    @Override
    public double generateRandomNumber() {
        return (1 * Controller.range) + Math.random()
                * ((Math.random() * Controller.max) * Controller.range);
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
    public char getOperator() {
        return '/';
    }
}
