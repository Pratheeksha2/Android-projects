package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sc4 extends AppCompatActivity {
    private Button x5,n4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc4);
        getSupportActionBar().hide();


        x5=findViewById(R.id.idx5);
        n4=findViewById(R.id.bh4);

        x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(1);
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(sc4.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        });


    }
}
