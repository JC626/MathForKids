package com.welovekids.util;

import java.util.List;
import java.util.ArrayList;

/** contains methods which retrieves digits and operators */
public class Parser {

    public static List<Double> parseDigits(String line){
        List<Double> digits = new ArrayList<Double>();
        String value = "";
        for(int i = 0; i < line.length(); i++){
            char character = line.charAt(i);
            if(isDigit(character)){
                value += character;
            }else{
                double digit = Double.parseDouble(value);
                digits.add(digit);
                value = "";
            }
        }
        return digits;
    }

    public static List<String> parseOperators(String line){
        List<String> operators = new ArrayList<String>();
        for(int i = 0; i < line.length(); i++){
            char character = line.charAt(i);
            if(isOperator(character)){
                operators.add(String.valueOf(character));
            }
        }
        return operators;
    }

    private static boolean isOperator(char c){
        switch(c){
            case '+':
                return true;
            case '-':
                return true;
            case '/':
                return true;
            case 'x':
                return true;
        }
        return false;
    }

    private static boolean isDigit(char c){
        return Character.isDigit(c) || c == '.';
    }
}
