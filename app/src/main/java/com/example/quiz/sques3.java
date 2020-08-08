package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sques3 extends AppCompatActivity {
    public boolean isPaused = false;
    public int counter;
    private Button on3,r31,r32,r33;
    //int f;
    private TextView textView;
    boolean clicked=false;
    private long tmrem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sques3);
        getSupportActionBar().hide();


        Intent i=getIntent();
        on3 = findViewById(R.id.start3);
        r31 = findViewById(R.id.x11);
        r32 = findViewById(R.id.x22);
        r33 = findViewById(R.id.pause);

        textView = findViewById(R.id.tv3);

        r33.setEnabled(false);

        on3.setOnClickListener(new View.OnClickListener() {
                                   @Override


                                   public void onClick(View v) {
                                       TextView vt3=findViewById(R.id.tq3);
                                       vt3.setVisibility(View.VISIBLE);
                                       vt3.setText("What is the symbol of Lithium?");


                                       clicked=true;
                                       isPaused = false;
                                       // f=1;
                                       on3.setEnabled(false);
                                       r33.setEnabled(true);
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
                                               on3.setEnabled(true);
                                               r33.setEnabled(false);
                                               Intent m = new Intent(sques3.this, sc2.class);
                                               startActivity(m);
                                               finish();

                                           }



                                       }.start();

                                   }

                               }
        );

        r33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPaused = true;
                on3.setEnabled(false);
                r33.setEnabled(false);
            }
        });



        r31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    on3.setEnabled(false);
                    r33.setEnabled(false);

                    Intent j = new Intent(sques3.this,sques4.class);
                    startActivity(j);
                    finish();
                }
            }
        });

        r32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    on3.setEnabled(false);
                    r33.setEnabled(false);

                    Intent k = new Intent(sques3.this, sc2.class);
                    startActivity(k);
                    finish();
                }
            }
        });



    }
}
