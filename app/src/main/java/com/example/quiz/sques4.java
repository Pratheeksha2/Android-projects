package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sques4 extends AppCompatActivity {

    public boolean isPaused = false;
    public int counter;
    private Button on4,r41,r42,r43;
    //int f;
    private TextView textView;
    boolean clicked=false;
    private long tmrem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sques4);
        getSupportActionBar().hide();


        Intent i=getIntent();
        on4 = findViewById(R.id.start4);
        r41 = findViewById(R.id.y1);
        r42 = findViewById(R.id.y2);
        r43 = findViewById(R.id.pause);

        textView = findViewById(R.id.tv4);

        r43.setEnabled(false);

        on4.setOnClickListener(new View.OnClickListener() {
                                   @Override


                                   public void onClick(View v) {
                                       TextView vt4=findViewById(R.id.tq4);
                                       vt4.setVisibility(View.VISIBLE);
                                       vt4.setText("What is the symbol of Hydrogen?");


                                       clicked=true;
                                       isPaused = false;
                                       // f=1;
                                       on4.setEnabled(false);
                                       r43.setEnabled(true);
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
                                               on4.setEnabled(true);
                                               r43.setEnabled(false);
                                               Intent m = new Intent(sques4.this, sc3.class);
                                               startActivity(m);
                                               finish();

                                           }



                                       }.start();

                                   }

                               }
        );

        r43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPaused = true;
                on4.setEnabled(false);
                r43.setEnabled(false);
            }
        });



        r41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    on4.setEnabled(false);
                    r43.setEnabled(false);

                    Intent j = new Intent(sques4.this,sc3.class);
                    startActivity(j);
                    finish();
                }
            }
        });

        r42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    on4.setEnabled(false);
                    r43.setEnabled(false);

                    Intent k = new Intent(sques4.this, sques5.class);
                    startActivity(k);
                    finish();
                }
            }
        });


    }
}
