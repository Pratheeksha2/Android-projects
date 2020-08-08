package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sques1 extends AppCompatActivity {

    private boolean isPaused = false;
    public int counter;
    private Button on1,r1,r2,r3;
    //int f;
    private TextView textView;
    boolean clicked=false;
    private long tmrem = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sques1);
        getSupportActionBar().hide();


        Intent i=getIntent();
        on1 = findViewById(R.id.start1);
        r1 = findViewById(R.id.v1);
        r2 = findViewById(R.id.v2);
        r3 = findViewById(R.id.pause);

        textView = findViewById(R.id.tv1);

        r3.setEnabled(false);

        on1.setOnClickListener(new View.OnClickListener() {
                                      @Override


                                      public void onClick(View v) {
                                          TextView vt1=findViewById(R.id.tq1);
                                          vt1.setVisibility(View.VISIBLE);
                                          vt1.setText("What is the symbol of Oxygen?");


                                          clicked=true;
                                          isPaused = false;

                                          on1.setEnabled(false);
                                          r3.setEnabled(true);
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
                                                 // textView.setText("Done");
                                                  on1.setEnabled(true);
                                                  r3.setEnabled(false);
                                                  Intent m = new Intent(sques1.this, sc0.class);
                                                  startActivity(m);
                                                  finish();

                                              }



                                          }.start();                         }

                                  }
        );

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPaused = true;
                on1.setEnabled(false);
                r3.setEnabled(false);
            }
        });



        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {

                    isPaused = true;
                    on1.setEnabled(false);
                    r3.setEnabled(false);

                    Intent j = new Intent(sques1.this,sques2.class);
                    startActivity(j);
                    finish();
                }
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    on1.setEnabled(false);
                    r3.setEnabled(false);

                    Intent k = new Intent(sques1.this, sc0.class);
                    startActivity(k);
                    finish();
                }
            }
        });




    }
}
