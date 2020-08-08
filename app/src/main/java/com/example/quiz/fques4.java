package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fques4 extends AppCompatActivity {
    public boolean isPaused = false;
    public int counter;
    private Button button4, b41, b42, b43;
    int f;
    TextView textView;
    boolean clicked=false;
    private long tmrem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fques4);
        getSupportActionBar().hide();


        button4 = (Button) findViewById(R.id.idstart4);
        b41 = findViewById(R.id.d1);
        b42 = findViewById(R.id.d2);
        b43 = findViewById(R.id.pause);

        textView = (TextView) findViewById(R.id.tt4);

        b43.setEnabled(false);

        button4.setOnClickListener(new View.OnClickListener() {
                                    @Override


                                    public void onClick(View v) {

                                        TextView tv4=findViewById(R.id.textview4);
                                        tv4.setVisibility(View.VISIBLE);
                                        tv4.setText("What is the national flower of India?");

                                        clicked=true;
                                        isPaused = false;
                                        f=1;
                                        button4.setEnabled(false);
                                        b43.setEnabled(true);
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
                                                button4.setEnabled(true);
                                                b43.setEnabled(false);
                                                Intent n = new Intent(fques4.this, sc3.class);
                                                startActivity(n);
                                                finish();

                                            }



                                        }.start();

                                    }

                                }
        );

        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPaused = true;
                button4.setEnabled(false);
                b43.setEnabled(false);
            }
        });



        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    button4.setEnabled(false);
                    b43.setEnabled(false);

                    Intent o = new Intent(fques4.this,fques5.class);
                    startActivity(o);
                    finish();
                }
            }
        });

        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked) {
                    isPaused = true;
                    button4.setEnabled(false);
                    b43.setEnabled(false);

                    Intent p = new Intent(fques4.this, sc3.class);
                    startActivity(p);
                    finish();
                }
            }
        });




    }
}
