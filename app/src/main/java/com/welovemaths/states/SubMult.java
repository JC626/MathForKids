package com.welovemaths.states;

import com.welovemaths.util.Controller;
import com.welovemaths.util.Question;
import com.welovemaths.util.QuestionImpl;

/**
 * Created by dean on 30/04/16.
 */
public class SubMult extends AbstractState {

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
        int answer = (int) Controller.getAnswer(digit1, digit2, operator);
        return new QuestionImpl("" + digit1 + operator + digit2, String.valueOf(answer), String.valueOf(operator));


    }

    @Override
    public char getOperator() {
        double val = Math.random();
        if (val < 0.5) {
            return '-';
        } else {
            return 'x';
        }
    }
}
