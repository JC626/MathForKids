package com.welovekids.states;

import com.welovekids.util.Controller;
import com.welovekids.util.Question;
import com.welovekids.util.QuestionImpl;

/**
 * Created by dean on 30/04/16.
 */
public class AddSubMultDIv implements State {

    private int correct;
    private int incorrect;

    private String question;
    public Question getQuestion(){
        int digit1 = (int) generateRandomNumber();
        int digit2 = (int) generateRandomNumber();
        char operator = getOperator();
        int answer = Controller.getAnswer(digit1, digit2, operator);
        return new QuestionImpl(""+digit1+operator+digit2,String.valueOf(answer),String.valueOf(operator));


    }
    public int getCorrectAnswered(){return correct++;}

    @Override
    public char getOperator() {
        int val=(int)Math.random()*4;
        switch (val) {
            case 0:
                return '+';
            case 1:
                return'-';
            case 2:
                return'x';
            case 3:
                return '/';


        }
        return ' ';
    }

    public int getIncorrectlyAnswered(){return incorrect--;}

    public String getAnswer(Question g){return g.getAnswer();}
    public void setCorrectAnswered(int correct){this.correct=correct;}
    public void setIncorrectlyAnswered(int incorrect){this.incorrect=incorrect;}
    public double generateRandomNumber(){
        return (1* Controller.range)+Math.random()*((Math.random()*Controller.max)*Controller.range);}
}
