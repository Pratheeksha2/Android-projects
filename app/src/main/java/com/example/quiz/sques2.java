package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sques2 extends AppCompatActivity {
    public boolean isPaused = false;
    public int counter;
    private Button on2,r21,r22,r23;
    //int f;
    private TextView textView;
    boolean clicked=false;
    private long tmrem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sques2);
        getSupportActionBar().hide();


        Intent i=getIntent();
        on2 = findViewById(R.id.start2);
        r21 = findViewById(R.id.w1);
        r22 = findViewById(R.id.w2);
        r23 = findViewById(R.id.pause);

        textView = findViewById(R.id.tv2);

        r23.setEnabled(false);

        on2.setOnClickListener(new View.OnClickListener() {
                                   @Override


                                   public void onClick(View v) {
                                       TextView vt2=findViewById(R.id.tq2);
                                       vt2.setVisibility(View.VISIBLE);
                                       vt2.setText("What is the symbol of Carbondioxide?");


                                       clicked=true;
                                       isPaused = false;
                                       // f=1;
                                       on2.setEnabled(false);
                                       r23.setEnabled(true);
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
                                               on2.setEnabled(true);
                                               r23.setEnabled(false);
                                               Intent m = new Intent(sques2.this, sc1.class);
                                               startActivity(m);
                                               finish();

                                           }



                                       }.start();

                                   }

                               }
        );

        r23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPaused = true;
                on2.setEnabled(false);
                r23.setEnabled(false);
            }
        });



        r21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    on2.setEnabled(false);
                    r23.setEnabled(false);

                    Intent j = new Intent(sques2.this,sc1.class);
                    startActivity(j);
                    finish();
                }
            }
        });

        r22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    on2.setEnabled(false);
                    r23.setEnabled(false);

                    Intent k = new Intent(sques2.this, sques3.class);
                    startActivity(k);
                    finish();
                }
            }
        });


    }
}
