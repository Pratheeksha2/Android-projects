package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sques5 extends AppCompatActivity {
    public boolean isPaused = false;
    public int counter;
    private Button on5,r51,r52,r53;
    //int f;
    private TextView textView;
    boolean clicked=false;
    private long tmrem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sques5);
        getSupportActionBar().hide();

        Intent i=getIntent();
        on5 = findViewById(R.id.start5);
        r51 = findViewById(R.id.z1);
        r52 = findViewById(R.id.z2);
        r53 = findViewById(R.id.pause);

        textView = findViewById(R.id.tv5);

        r53.setEnabled(false);

        on5.setOnClickListener(new View.OnClickListener() {
                                   @Override


                                   public void onClick(View v) {
                                       TextView vt5=findViewById(R.id.tq5);
                                       vt5.setVisibility(View.VISIBLE);
                                       vt5.setText("What is the symbol of Zinc");


                                       clicked=true;
                                       isPaused = false;
                                       // f=1;
                                       on5.setEnabled(false);
                                       r53.setEnabled(true);
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
                                               on5.setEnabled(true);
                                               r53.setEnabled(false);
                                               Intent m = new Intent(sques5.this, sc4.class);
                                               startActivity(m);
                                               finish();

                                           }



                                       }.start();

                                   }

                               }
        );

        r53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPaused = true;
                on5.setEnabled(false);
                r53.setEnabled(false);
            }
        });



        r51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    on5.setEnabled(false);
                    r53.setEnabled(false);

                    Intent j = new Intent(sques5.this,sc4.class);
                    startActivity(j);
                    finish();
                }
            }
        });

        r52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    on5.setEnabled(false);
                    r53.setEnabled(false);

                    Intent k = new Intent(sques5.this, sfinal.class);
                    startActivity(k);
                    finish();
                }
            }
        });


    }
}
