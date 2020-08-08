package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fques5 extends AppCompatActivity {
    public boolean isPaused = false;
    public int counter;
    Button button5, b51, b52, b53;
    int f;
    TextView textView;
    boolean clicked=false;
    private long tmrem = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fques5);
        getSupportActionBar().hide();


        button5 = (Button) findViewById(R.id.idstart5);
        b51 = findViewById(R.id.e1);
        b52 = findViewById(R.id.e2);
        b53 = findViewById(R.id.pause);

        textView = (TextView) findViewById(R.id.tt5);

        b53.setEnabled(false);

        button5.setOnClickListener(new View.OnClickListener() {
                                       @Override


                                       public void onClick(View v) {

                                           TextView tv5=findViewById(R.id.textview5);
                                           tv5.setVisibility(View.VISIBLE);
                                           tv5.setText("What is the national language of India?");

                                           clicked=true;
                                           isPaused = false;
                                           f=1;
                                           button5.setEnabled(false);
                                           b53.setEnabled(true);
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
                                                   button5.setEnabled(true);
                                                   b53.setEnabled(false);
                                                   Intent q = new Intent(fques5.this, sc4.class);
                                                   startActivity(q);
                                                   finish();

                                               }



                                           }.start();

                                       }

                                   }
        );

        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPaused = true;
                button5.setEnabled(false);
                b53.setEnabled(false);
            }
        });



        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    button5.setEnabled(false);
                    b53.setEnabled(false);

                    Intent r = new Intent(fques5.this,sc4.class);
                    startActivity(r);
                    finish();
                }
            }
        });

        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    button5.setEnabled(false);
                    b53.setEnabled(false);

                    Intent s = new Intent(fques5.this, ffinal.class);
                    startActivity(s);
                    finish();
                }
            }
        });





    }
}
