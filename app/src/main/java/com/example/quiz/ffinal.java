package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ffinal extends AppCompatActivity {
private Button x6,xx6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ffinal);
        getSupportActionBar().hide();
        x6=findViewById(R.id.idx6);
        xx6=findViewById(R.id.bh5);

        x6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        xx6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ffinal.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        });


    }
}
