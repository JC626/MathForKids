package com.welovekids.util;


public interface Question{
    /** retrieves the question as a string */
    public String getQuestion();
    /** retrieves the answer as a string */
    public String getAnswer();
    /** sets the question */
    public void setQuestion(String question);
    /** sets the answer */
    public void setAnswer(String answer);
    /** prints the question -> answer pair */
    public void printQuestion();
}
