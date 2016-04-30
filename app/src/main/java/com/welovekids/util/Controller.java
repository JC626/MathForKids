package com.welovekids.util;

/**
 * Created by chris on 30/04/2016.
 */
public class Controller {
    private static final char[] OPERATORS = "+-/x".toCharArray();

    private static double max = 9;
    private static int range = 1;
    // Spaced Repetition Implementation
    private static int correctlyAnswered = 0;
    private static int incorrectlyAnswered = 0;
    private static int prevOperator = 1;
    private static int curOperator = 1;

    public static void increaseDifficulty(){
        range++;
    }

    public static QuestionImpl generateRandomQuestion(){
        int digit1 = (int) generateRandomNumber();
        int digit2 = (int) generateRandomNumber();
        char operator = getOperator();
        int answer = getAnswer(digit1, digit2, operator);
        return new QuestionImpl(""+digit1+operator+digit2,String.valueOf(answer),String.valueOf(operator));
    }

    /** Executes the arithmetic operation on the two digits passed */
    private static int getAnswer(int digit1, int digit2, char operator){
        switch (operator) {
            case '+':
                return digit1 + digit2;
            case '-':
                return digit1 - digit2;
            case '/':
                return digit1 / digit2;
            case 'x':
                return digit1 * digit2;
        }
        return 1+1; //dummy return value to compile...
    }

    private static char getOperator(){
        return ' ';
    }


    /**
     * returns a random number between n with m digits.
     * The number of digits are determined by the "progress" field.
     *
     * e.g If progress is 1, it returns a random number with only 1 digit.
     * If progress is 2, it returns a random number which is 2 digits long
     *
     * @return a random number
     */
    private static double generateRandomNumber(){
        return (1*range)+Math.random()*((Math.random()*max)*range);
    }
}
