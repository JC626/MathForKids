/* File: State.java
 * Date         Author          Changes
 * 30 Mar 16    Chris Rabe      added javadoc comments
 */

package com.welovekids.states;

import com.welovekids.util.Question;

/**
 * Created by chris on 30/04/2016.
 */
public interface State {
    /**
     *  @return number of times the state has been answered correctly
     */
    public int getCorrectAnswered();

    /**
     * @return number of times the state has been answered incorrectly
     */
    public int getIncorrectlyAnswered();

    /**
     * @return retrieves a random question
     */
    public Question getQuestion();

    /**
     * @param q
     *              a question
     * @return      the answer to the given question
     */
    public String getAnswer(Question q);

    /**
     * Generates a random number which is dependent on the range/difficulty
     * selected by the user.
     *
     * @return random number
     */
    public double generateRandomNumber();

    /**
     * Sets the number of correct answers made
     * @param correct
     */
    public void setCorrectAnswered(int correct);

    /**
     * Sets the number of incorrect answers made
     * @param incorrect
     */
    public void setIncorrectlyAnswered(int incorrect);

    /** This returns the operator related to the state */
    public char getOperator();
}
