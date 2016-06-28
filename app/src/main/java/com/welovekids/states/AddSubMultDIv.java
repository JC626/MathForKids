package com.welovekids.states;

import com.welovekids.util.Controller;
import com.welovekids.util.Question;
import com.welovekids.util.QuestionImpl;

import java.util.Locale;

/**
 * Created by dean on 30/04/16.
 */
public class AddSubMultDiv implements State {

    private int correct;
    private int incorrect;

    public Question getQuestion() {
        int digit1 = (int) generateRandomNumber();
        int digit2 = (int) generateRandomNumber();
        char operator = getOperator();
        //Switch digits around so don't get integers when subtracting
        if(digit1 < digit2 && (operator == '-' || operator == '/')){
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
        return new QuestionImpl("" + digit1 + operator + digit2, String.format(Locale.getDefault(),"%.2f", answer), String.valueOf(operator));


    }

    public int getCorrectAnswered() {
        return correct++;
    }

    @Override
    public char getOperator() {
        int val = (int) Math.random() * 4;
        switch (val) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return 'x';
            case 3:
                return '/';
        }
        return ' ';
    }

    public int getIncorrectlyAnswered() {
        return incorrect--;
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
        return ((10 * (Controller.range - 1)) + Math.random() * (10*Controller.range));
    }
}
