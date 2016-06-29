package com.welovekids.states;

import com.welovekids.util.Controller;
import com.welovekids.util.Question;
import com.welovekids.util.QuestionImpl;

/**
 * Created by dean on 30/04/16.
 */
public class Sub extends AbstractState {
    public Question getQuestion() {
        int digit1 = (int) generateRandomNumber();
        int digit2 = (int) generateRandomNumber();
        char operator = getOperator();
        //Switch digits around so don't get integers
        if(digit1 < digit2){
            int temp = digit1;
            digit1 = digit2;
            digit2 = temp;
        }
        int answer = (int)Controller.getAnswer(digit1, digit2, operator);
        return new QuestionImpl("" + digit1 + operator + digit2, String.valueOf(answer), String.valueOf(operator));
    }

    @Override
    public char getOperator() {
        return '-';
    }
}
