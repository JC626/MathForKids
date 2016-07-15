package com.welovekids.mathforkids;


import android.content.Intent;
import android.os.CountDownTimer;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.preference.PreferenceManager;
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

public class QuestionActivity extends AppCompatActivity {
    private CountDownTimer timer;
    private long remainingTime = 60000; //Start at 60 seconds
    private MediaPlayer mp;

    @Override
    protected void onPause() {
        super.onPause();
        timer.cancel();
        if(mp != null){
            mp.pause();
        }
        timer = null;
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(mp != null){
            mp.start();
        }
        final TextView timerText = getTimer();
        //Resume gameplay after a popup has disappeared (i.e. screen is still partially visible)
        timer = new CountDownTimer(remainingTime,1000) {
            public void onTick(long millisUntilFinished) {
                remainingTime = millisUntilFinished;
                String time = "Seconds Left: " + millisUntilFinished / 1000;
                timerText.setText(time);
            }
            public void onFinish() {
                //Change to game over screen
                timer.cancel();
                Intent intent = new Intent(QuestionActivity.this, GameOverActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mp != null) {
            mp.stop();
            mp = null;
        }
        /*
         *If user exits the question screen while app is still running
         * go back to the main menu
         */
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Controller.resetFields();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final TextView questionText = (TextView) findViewById(R.id.question);
        String questionInput = Controller.askQuestion();  //Get question
        questionText.setText(questionInput);

        final EditText answer = (EditText) findViewById(R.id.user_answer);
        answer.setKeyListener(null);
        Button backspace = getSpace();
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable text = answer.getText();
                if (text.length() == 0) {
                    return;
                }

                CharSequence backspaced = text.subSequence(0, text.length() - 1);
                answer.setText(backspaced);
            }
        });

        Button clear = getClear();
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText("");

            }
        });

        Button enter = getEnter();
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do nothing if user does not input anything
                if (answer.getText().toString().equals("")) {
                    return;
                }
                boolean isCorrect = Controller.solve(answer.getText().toString());
                final ImageView solved = (ImageView) findViewById(R.id.solved);

                if (isCorrect) {
                    solved.setImageResource(R.drawable.right);
                } else {
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
        //Remove these buttons until decimals and/or integers are implemented
        /*Button dot = getDot();
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = ".";
                answer.append(c);
            }
        });

        Button negative = getNegative();
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.append("-");
            }
        });*/

        Button b0 = getButton0();
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "0";
                answer.append(c);
            }
        });


        Button b1 = getButton1();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "1";
                answer.append(c);
            }
        });
        Button b2 = getButton2();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "2";
                answer.append(c);
            }
        });
        Button b3 = getButton3();
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "3";
                answer.append(c);
            }
        });
        Button b4 = getButton4();
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "4";
                answer.append(c);
            }
        });
        Button b5 = getButton5();
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "5";
                answer.append(c);
            }
        });
        Button b6 = getButton6();
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "6";
                answer.append(c);
            }
        });
        Button b7 = getButton7();
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "7";
                answer.append(c);
            }
        });
        Button b8 = getButton8();
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "8";
                answer.append(c);
            }
        });
        Button b9 = getButton9();
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = "9";
                answer.append(c);
            }
        });

        if (!isMuted()) {
            mp = MediaPlayer.create(this, R.raw.schooldays);
            if (mp != null) {
                mp.setLooping(true);
                mp.start();
            }
        }
    }

    private boolean isMuted() {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        return sp.getBoolean("mute", false);
    }


    //Getters
    private TextView getTimer() {
        return (TextView) findViewById(R.id.timer);
    }

    private Button getButton0() {
        return (Button) findViewById(R.id.Button0);
    }

    private Button getButton1() {
        return (Button) findViewById(R.id.Button1);
    }

    private Button getButton2() {
        return (Button) findViewById(R.id.Button2);
    }

    private Button getButton3() {
        return (Button) findViewById(R.id.Button3);
    }

    private Button getButton4() {
        return (Button) findViewById(R.id.Button4);
    }

    private Button getButton5() {
        return (Button) findViewById(R.id.Button5);
    }

    private Button getButton6() {
        return (Button) findViewById(R.id.Button6);
    }

    private Button getButton7() {
        return (Button) findViewById(R.id.Button7);
    }

    private Button getButton8() {
        return (Button) findViewById(R.id.Button8);
    }

    private Button getButton9() {
        return (Button) findViewById(R.id.Button9);
    }

    //Remove until integers are added
    /*private Button getNegative() {
        return (Button) findViewById(R.id.ButtonNegative);
    }*/

    private Button getSpace() {
        return (Button) findViewById(R.id.ButtonBackSpace);
    }

    private Button getClear() {
        return (Button) findViewById(R.id.ButtonClear);
    }

    //Remove until decimals are implemented
    /*private Button getDot() {
        return (Button) findViewById(R.id.ButtonDot);
    }*/

    private Button getEnter() {
        return (Button) findViewById(R.id.ButtonEnter);
    }

}
