/* File: Controller.java
 * Date             Author          Changes
 * 30 Mar 16        Chris Rabe      added documentation
 */
package com.welovekids.util;

import com.welovekids.states.*;

/**
 * Created by chris on 30/04/2016.
 */
public class Controller {
    private static State[] QUESTIONS = new State[]
            {new Add(), new Sub(), new AddSub(), new Multiply(),
                    new SubMult(), new Division(), new MultDiv(), new AddSubMult(),
                    new SubMultDiv(), new AddSubMultDiv()};

    private static int progress = 0;
    private static int totalCorrect = 0;
    private static int totalIncorrect = 0;
    private static int totalQuestions = 0;
    private static int highScore = 0;

    public static double max = 9;
    public static int range = 1;

    private static State currentState = QUESTIONS[progress];
    private static Question currentQuestion = currentState.getQuestion();

    public static void resetFields(){
        progress = 0;
        totalCorrect = 0;
        totalIncorrect = 0;
        totalQuestions = 0;
    }

    public static int getHighScore(){
        return highScore;
    }

    public static void setHighScore(int h){
        highScore = h;
    }

    public static void setRange(int range) {
        Controller.range = range;
    }

    public static int getTotalQuestions() {
        return totalQuestions;
    }

    public static String askQuestion() {
        currentQuestion = currentState.getQuestion();
        return currentQuestion.getQuestion();
    }

    public static String getCorrect() {
        return String.valueOf(totalCorrect);
    }

    public static String getTotalIncorrect() {
        return String.valueOf(totalIncorrect);
    }

    /**
     * Solves the current question being asked.
     * Algorithm implements "spaced repetition" algorithm.
     * This means that it would repeatedly ask the same questions n number of times.
     * Once the user answers the type of question n number of times, it will move on
     * to new set of questions.
     * <p/>
     * If the user answers incorrectly, the number of correctly answered decreases.
     *
     * @param solution User input
     * @return true if the user entered correct
     */
    public static boolean solve(String solution) {
        totalQuestions++;
        String answer = currentQuestion.getAnswer();
        double theAnswer = Double.parseDouble(answer);
        double theSolution = Double.parseDouble(solution);
        /*if (solution.equals(currentQuestion.getAnswer())) {*/
        if(theAnswer == theSolution){
            totalCorrect++;
            currentState.setCorrectAnswered(currentState.getCorrectAnswered() + 1);
            // If user answered 5 correct answers, go to the next state
            if (currentState.getCorrectAnswered() == 5) {
                currentState.setCorrectAnswered(0);
                currentState.setIncorrectlyAnswered(0);
                progress++;
                if (progress == QUESTIONS.length) {
                    progress = QUESTIONS.length - 1;
                }
                currentState = QUESTIONS[progress];
                currentQuestion = currentState.getQuestion();
            } else {
                // Just generate a new question
                currentState.setIncorrectlyAnswered(currentState.getIncorrectlyAnswered() - 1);
                currentQuestion = currentState.getQuestion();
            }
            return true;
        } else {
            totalIncorrect++;
            currentState.setIncorrectlyAnswered(currentState.getIncorrectlyAnswered() + 1);
            if (currentState.getIncorrectlyAnswered() == 5) {
                currentState.setCorrectAnswered(0);
                currentState.setIncorrectlyAnswered(0);
                progress--;
                if (progress < 0) {
                    progress = 0;
                }
                currentState = QUESTIONS[progress];
                currentQuestion = currentState.getQuestion();
            } else {
                currentState.setCorrectAnswered(currentState.getCorrectAnswered() - 1);
                currentQuestion = currentState.getQuestion();
            }
            return false;
        }
    }

    /**
     * Executes the arithmetic operation on the two digits passed
     */
    public static double getAnswer(double digit1, double digit2, char operator) {
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
        return 1 + 1; //dummy return value to compile...
    }

}
