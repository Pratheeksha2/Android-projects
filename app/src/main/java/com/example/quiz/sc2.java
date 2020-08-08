package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sc2 extends AppCompatActivity {
    private Button x3,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc2);
        getSupportActionBar().hide();

        x3=findViewById(R.id.idx3);
        n2=findViewById(R.id.bh2);
        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(1);
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(sc2.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
