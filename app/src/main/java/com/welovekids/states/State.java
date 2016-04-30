package com.welovekids.states;

import com.welovekids.util.Question;

/**
 * Created by chris on 30/04/2016.
 */
public interface State {
    public int getCorrectAnswered();

    public int getIncorrectlyAnswered();

    public Question getQuestion();

    public String getAnswer(Question q);

    public double generateRandomNumber();

    public void setCorrectAnswered(int correct);

    public void setIncorrectlyAnswered(int incorrect);

    public char getOperator();
}
