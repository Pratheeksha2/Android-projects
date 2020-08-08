package com.example.quiz;

import android.content.Intent;
import android.os.CountDownTimer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class fques1 extends AppCompatActivity {
    public boolean isPaused = false;
    public int counter;
    private Button button, c1, c2, c3;
    //int f;
    private TextView textView;
    boolean clicked=false;
    private long tmrem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fques1);
        getSupportActionBar().hide();

        Intent i=getIntent();
        button = findViewById(R.id.button);
        c1 = findViewById(R.id.a1);
        c2 = findViewById(R.id.a2);
        c3 = findViewById(R.id.pause);

        textView = findViewById(R.id.tt1);

        c3.setEnabled(false);

        button.setOnClickListener(new View.OnClickListener() {
                                      @Override


                                      public void onClick(View v) {
                                          TextView tv=findViewById(R.id.textview1);
                                          tv.setVisibility(View.VISIBLE);
                                          tv.setText("Which of the following is the capital of India?");


                                          clicked=true;
                                          isPaused = false;
                                         // f=1;
                                          button.setEnabled(false);
                                          c3.setEnabled(true);
                                          CountDownTimer timer;
                                          long ms = 6000;
                                          long cdi = 1000;

                                          timer = new CountDownTimer(ms, cdi) {
                                              @Override
                                              public void onTick(long muf) {
                                                  if (isPaused) {

                                                      cancel();
                                                  } else {
                                                      //f=1;
                                                      textView.setText("" + muf / 1000);
                                                      tmrem = muf;
                                                  }
                                              }

                                              @Override
                                              public void onFinish() {
                                                  textView.setText("Done");
                                                  button.setEnabled(true);
                                                  c3.setEnabled(false);
                                                  Intent m = new Intent(fques1.this, sc0.class);
                                                  startActivity(m);
                                                  finish();

                                              }



                                          }.start();

                                      }

                                  }
        );

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPaused = true;
                button.setEnabled(false);
                c3.setEnabled(false);
            }
        });



        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    button.setEnabled(false);
                    c3.setEnabled(false);

                    Intent j = new Intent(fques1.this,fques2.class);
                    startActivity(j);
                    finish();
                }
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    button.setEnabled(false);
                    c3.setEnabled(false);

                    Intent k = new Intent(fques1.this, sc0.class);
                    startActivity(k);
                    finish();
                }
            }
        });


    }

}

