package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sc3 extends AppCompatActivity {
    private Button x4,n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc3);
        getSupportActionBar().hide();

        x4=findViewById(R.id.idx4);
        n3=findViewById(R.id.bh3);

        x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(1);
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(sc3.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
