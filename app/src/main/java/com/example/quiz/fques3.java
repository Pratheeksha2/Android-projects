package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fques3 extends AppCompatActivity {
    public boolean isPaused = false;
    public int counter;
    Button uton, b11, b22, b33;
    int f;
    TextView textView;
    boolean clicked=false;
    private long tmrem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fques3);
        getSupportActionBar().hide();


        uton = (Button) findViewById(R.id.idstart3);
        b11 = findViewById(R.id.cc1);
        b22 = findViewById(R.id.cc2);
        b33 = findViewById(R.id.pause);

        textView = (TextView) findViewById(R.id.tt3);

        b33.setEnabled(false);

        uton.setOnClickListener(new View.OnClickListener() {
                                     @Override


                                     public void onClick(View v) {

                                         TextView tv3=findViewById(R.id.textview3);
                                         tv3.setVisibility(View.VISIBLE);
                                         tv3.setText("What is the national animal of India?");

                                         clicked=true;
                                         isPaused = false;
                                         f=1;
                                         uton.setEnabled(false);
                                         b33.setEnabled(true);
                                         CountDownTimer timer;
                                         long ms = 6000;
                                         long cdi = 1000;

                                         timer = new CountDownTimer(ms, cdi) {
                                             @Override
                                             public void onTick(long muf) {
                                                 if (isPaused) {

                                                     cancel();
                                                 } else {
                                                     f=1;
                                                     textView.setText("" + muf / 1000);
                                                     tmrem = muf;
                                                 }
                                             }

                                             @Override
                                             public void onFinish() {
                                                 textView.setText("Done");
                                                 uton.setEnabled(true);
                                                 b33.setEnabled(false);
                                                 Intent g = new Intent(fques3.this, sc2.class);
                                                 startActivity(g);
                                                 finish();

                                             }



                                         }.start();

                                     }

                                 }
        );

        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPaused = true;
                uton.setEnabled(false);
                b33.setEnabled(false);
            }
        });



        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    uton.setEnabled(false);
                    b33.setEnabled(false);

                    Intent h = new Intent(fques3.this,sc2.class);
                    startActivity(h);
                    finish();
                }
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    uton.setEnabled(false);
                    b33.setEnabled(false);

                    Intent i = new Intent(fques3.this, fques4.class);
                    startActivity(i);
                    finish();
                }
            }
        });





    }
}
