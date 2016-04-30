package com.welovekids.mathforkids;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.welovekids.util.Controller;
import com.welovekids.util.Question;

public class QuestionActivity extends AppCompatActivity {
    Question question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        if(question == null){
            final TextView questionText = (TextView)findViewById(R.id.question);
           String questionInput=Controller.askQuestion();  //Get question
            questionText.setText(questionInput);
        }

        final EditText answer=(EditText)findViewById(R.id.user_answer);
        answer.setKeyListener(null);
        Button backspace=getSpace();
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Editable text = answer.getText();
                if(text.length()== 0){
                    return;
                }

               CharSequence backspaced = text.subSequence(0,text.length()-1);
                answer.setText(backspaced);
            }
        });


        Button dot=getDot();
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = ".";
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
                boolean ans=Controller.solve(answer.getText().toString());
                final ImageView solved = (ImageView) findViewById(R.id.solved);

                if(ans== true){
                  solved.setImageResource(R.drawable.right);
                }
                else{
                   solved.setImageResource(R.drawable.wrong);
                }
                solved.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        solved.setVisibility(View.GONE);
                    }
                }, 750);
                final TextView questionText = (TextView) findViewById(R.id.question);
                String questionInput = Controller.askQuestion();  //Get question
                questionText.setText(questionInput);
                answer.setText("");

            }
        });

        Button negative=getNegative();
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.append("-");
            }
        });

        Button b0=getButton0();
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "0";
                answer.append(c);
            }
        });


    Button b1=getButton1();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "1";
                answer.append(c);
            }
        });
        Button b2=getButton2();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "2";
                answer.append(c);
            }
        });
        Button b3=getButton3();
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "3";
                answer.append(c);
            }
        });
        Button b4=getButton4();
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "4";
                answer.append(c);
            }
        });
        Button b5=getButton5();
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "5";
                answer.append(c);
            }
        });
        Button b6=getButton6();
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "6";
                answer.append(c);
            }
        });
        Button b7=getButton7();
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "7";
                answer.append(c);
            }
        });
        Button b8=getButton8();
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "8";
                answer.append(c);
            }
        });
        Button b9=getButton9();
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "9";
                answer.append(c);
            }
        });

        final TextView timer = getTimer();

        new CountDownTimer(60000, 1000) {

            public void onTick(long millisUntilFinished) {
               timer.setText("Seconds Left: " + millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                timer.setText("Done!");
            }

        }.start();
    }

    public TextView getTimer(){
        return (TextView) findViewById(R.id.timer);
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
    public Button getButton9(){
        return (Button)findViewById(R.id.Button9);
    }

    public Button getNegative(){
        return (Button)findViewById(R.id.ButtonNegative);
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
