package com.welovekids.util;

/**
 * Created by chris on 30/04/2016.
 */
public class Controller {
    private static final char[] OPERATORS = "+-/x".toCharArray();

    public static double max = 9;
    public static int range = 1;

    public static void increaseDifficulty(){
        range++;
    }

    /** Executes the arithmetic operation on the two digits passed */
    public static int getAnswer(int digit1, int digit2, char operator){
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

}
