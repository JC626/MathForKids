package com.welovekids.util;


public interface Question{
    /** retrieves the question as a string */
    public String getQuestion();
    /** retrieves the answer as a string */
    public String getAnswer();
    /** retrieves the a random operator */
    public String getOperator();
    /** sets the question */
    public void setQuestion(String question);
    /** sets the answer */
    public void setAnswer(String answer);
    /** sets the operator */
    public void setOperator(String operator);
    /** prints the question -> answer pair */
    public String printQuestion();
}
