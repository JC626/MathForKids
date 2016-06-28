package com.welovekids.util;


public interface Question{
    /** retrieves the question as a string */
    String getQuestion();
    /** retrieves the answer as a string */
    String getAnswer();
    /** retrieves the a random operator */
    String getOperator();
    /** sets the question */
    void setQuestion(String question);
    /** sets the answer */
    void setAnswer(String answer);
    /** sets the operator */
    void setOperator(String operator);
    /** prints the question -> answer pair */
    String printQuestion();
}
