package com.welovekids.mathforkids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QuestionActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        final EditText answer=(EditText)findViewById(R.id.user_answer);
        Button backspace=getSpace();
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        Button dot=getDot();
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c = '.';
                answer.append(c);
            }
        });

        Button clear=getClear();
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               answer.setText("");

            }
        });


        Button enter=getEnter();
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        Button b0=getButton0();
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c = '0';
                answer.append(c);
            }
        });


    Button b1=getButton1();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c = '1';
                answer.append(c);
            }
        });
        Button b2=getButton2();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c = '2';
                answer.append(c);
            }
        });
        Button b3=getButton3();
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c = '3';
                answer.append(c);
            }
        });
        Button b4=getButton4();
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c = '4';
                answer.append(c);
            }
        });
        Button b5=getButton5();
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c = '5';
                answer.append(c);
            }
        });
        Button b6=getButton6();
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c = '6';
                answer.append(c);
            }
        });
        Button b7=getButton7();
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c = '7';
                answer.append(c);
            }
        });
        Button b8=getButton8();
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c = '8';
                answer.append(c);
            }
        });
    }

    public Button getButton0(){
        return (Button)findViewById(R.id.Button0);

    }

    public Button getButton1(){
        return (Button)findViewById(R.id.Button1);

    }
    public Button getButton2(){
        return (Button)findViewById(R.id.Button2);

    }
    public Button getButton3(){
        return (Button)findViewById(R.id.Button3);

    } public Button getButton4(){
        return (Button)findViewById(R.id.Button4);

    }
    public Button getButton5(){
        return (Button)findViewById(R.id.Button5);

    }
    public Button getButton6(){
        return (Button)findViewById(R.id.Button6);

    }
    public Button getButton7(){
        return (Button)findViewById(R.id.Button7);

    }
    public Button getButton8(){
        return (Button)findViewById(R.id.Button8);

    }
    public Button getSpace(){
        return (Button)findViewById(R.id.ButtonBackSpace);


    }
    public Button getClear(){

        return (Button)findViewById(R.id.ButtonClear);
    }
    public Button getDot(){
        return (Button)findViewById(R.id.ButtonDot);


    }
    public Button getEnter(){

        return (Button)findViewById(R.id.ButtonEnter);
    }





}
