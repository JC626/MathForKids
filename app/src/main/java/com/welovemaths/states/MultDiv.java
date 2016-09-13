package com.welovemaths.states;

import com.welovemaths.util.Controller;
import com.welovemaths.util.Question;
import com.welovemaths.util.QuestionImpl;

import java.util.Locale;

/**
 * Created by chris on 30/04/2016.
 */
public class MultDiv extends AbstractState {
    @Override
    public Question getQuestion() {
        int digit1 = (int) generateRandomNumber();
        int digit2 = (int) generateRandomNumber();
        char operator = getOperator();
        if(digit1 < digit2 && operator == '/'){
            int temp = digit1;
            digit1 = digit2;
            digit2 = temp;
        }
        if(operator == '/'){
            //Don't divide by zero
            if(digit2 == 0) digit2++;
            //Ensure always get a whole number answer
            digit1 = digit1 * digit2;
        }
        double answer = Controller.getAnswer(digit1, digit2, operator);
        int check = (int)answer;
        double checkAnswer = answer - check;
        if(checkAnswer == 0){
            return new QuestionImpl("" + digit1 + operator + digit2,
                    String.valueOf((int)answer), String.valueOf(operator));
        }
        return new QuestionImpl("" + digit1 + operator + digit2,
                String.format(Locale.getDefault(),"%.2f", answer), String.valueOf(operator));
    }

    @Override
    public char getOperator() {
        double val = Math.random();
        if (val < 0.5) {
            return 'x';
        } else {
            return '/';
        }
    }
}
