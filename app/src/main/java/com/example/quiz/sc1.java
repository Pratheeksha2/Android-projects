package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sc1 extends AppCompatActivity {

   private Button x1,n1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc1);
        getSupportActionBar().hide();

        n1=findViewById(R.id.bh1);
        x1=findViewById(R.id.idx2);
        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(1);
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(sc1.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
