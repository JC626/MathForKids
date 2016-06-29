package com.welovekids.states;

import com.welovekids.util.Controller;
import com.welovekids.util.Question;

/**
 * Created by Janice on 29/06/2016.
 */
public abstract class AbstractState implements State {
    protected int correct;
    protected int incorrect;
    protected final int MAXRANGE = 10; //This max range is multiplied by the difficulty setting
    @Override
    public int getCorrectAnswered() {
        return correct;
    }

    @Override
    public int getIncorrectlyAnswered() {
        return incorrect;
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
        return ((MAXRANGE * (Controller.range - 1)) + Math.random() * (MAXRANGE*Controller.range));
    }
}
