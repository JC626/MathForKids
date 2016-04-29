package com.welovekids.util;

/**
 * Question implementation
 */
public abstract class QuestionImpl implements Question{
    private String question;
    private String answer;
    private String operator;

    public QuestionImpl(){
        this.question = null;
        this.answer = null;
        operator = null;
    }

    /** retrieves the question as a string *
     * @return
     */
    public String getQuestion(){
        if(this.question == null){
            return "Error: No question found";
        }
        return question;
    }

    /** retrieves the answer as a string */
    public String getAnswer(){
        if(answer == null){
            return "Error: no answer found";
        }
        return answer;
    }

    public String getOperator(){
        if(operator == null){
            return "Error: no operator found";
        }
        return operator;
    }

    /** sets the question */
    public void setQuestion(String question){
        this.question = question;
    }
    /** sets the answer */
    public void setAnswer(String answer){
        this.answer = answer;
    }
    /** prints the question -> answer pair */
    public String printQuestion(){
        return question + " = " + answer;
    }
}
