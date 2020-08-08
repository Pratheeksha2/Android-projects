package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fques2 extends AppCompatActivity {
    public boolean isPaused = false;
    public int counter;
   private Button buton, bb1, bb2, bb3;
   // int f;
    TextView textView;
    boolean clicked=false;
    private long tmrem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fques2);
        getSupportActionBar().hide();


        buton = (Button) findViewById(R.id.idstart);
        bb1 = findViewById(R.id.b1);
        bb2 = findViewById(R.id.b2);
        bb3 = findViewById(R.id.pause);

        textView = (TextView) findViewById(R.id.tt2);

        bb3.setEnabled(false);

        buton.setOnClickListener(new View.OnClickListener() {
                                      @Override


                                      public void onClick(View v) {

                                          TextView tv2=findViewById(R.id.textview2);
                                          tv2.setVisibility(View.VISIBLE);
                                          tv2.setText("which of the following is the capital of karnataka?");

                                          clicked=true;
                                          isPaused = false;
                                         // f=1;
                                          buton.setEnabled(false);
                                          bb3.setEnabled(true);
                                          CountDownTimer timer;
                                          long ms = 6000;
                                          long cdi = 1000;

                                          timer = new CountDownTimer(ms, cdi) {
                                              @Override
                                              public void onTick(long muf) {
                                                  if (isPaused) {

                                                      cancel();
                                                  } else {
                                           //           f=1;
                                                      textView.setText("" + muf / 1000);
                                                      tmrem = muf;
                                                  }
                                              }

                                              @Override
                                              public void onFinish() {
                                                  textView.setText("Done");
                                                  buton.setEnabled(true);
                                                  bb3.setEnabled(false);
                                                  Intent c = new Intent(fques2.this, sc1.class);
                                                  startActivity(c);
                                                  finish();

                                              }



                                          }.start();

                                      }

                                  }
        );

        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPaused = true;
                buton.setEnabled(false);
                bb3.setEnabled(false);
            }
        });



        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    buton.setEnabled(false);
                    bb3.setEnabled(false);
                    Intent d = new Intent(fques2.this,sc1.class);
                    startActivity(d);
                    finish();
                }
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    buton.setEnabled(false);
                    bb3.setEnabled(false);
                    Intent e = new Intent(fques2.this, fques3.class);
                    startActivity(e);
                    finish();
                }
            }
        });




    }
}
