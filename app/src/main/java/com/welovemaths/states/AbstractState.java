package com.welovemaths.states;

import com.welovemaths.util.Controller;
import com.welovemaths.util.Question;

/**
 * Created by Janice on 29/06/2016.
 */
public abstract class AbstractState implements State {
    protected int correct;
    protected int incorrect;
    //Ranges for adding and subtracting. I.e. is from 0 to (n-1)
    private final int BASIC_MAX_ADDSUB = 11;
    private final int INTERMEDIATE_MAX_ADDSUB = 51;
    private final int ADVANCED_MAX_ADDSUB = 201;

    //Ranges for dividing and multiplying. I.e. is from 0 to (n-1)
    private final int BASIC_MAX_MULTDIV = 6;
    private final int INTERMEDIATE_MAX_MULTDIV = 13;
    private final int ADVANCED_MAX_MULTDIV = 21;

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
        switch(Controller.difficulty){
            case 1: //Basic
                if(getOperator() == '*' || getOperator() == '/'){
                    return Math.random() * BASIC_MAX_MULTDIV;
                }
                return Math.random() * BASIC_MAX_ADDSUB;
            case 2: //Intermediate
                if(getOperator() == '*' || getOperator() == '/'){
                    return Math.random() * INTERMEDIATE_MAX_MULTDIV;
                }
                return Math.random() * INTERMEDIATE_MAX_ADDSUB;
            case 3: //Advanced
                if(getOperator() == '*' || getOperator() == '/'){
                    return Math.random() * ADVANCED_MAX_MULTDIV;
                }
                return Math.random() * ADVANCED_MAX_ADDSUB;
        }
        return 1;
        //return ((10 * (Controller.difficulty - 1)) + Math.random() * (10*Controller.difficulty));
    }
}
