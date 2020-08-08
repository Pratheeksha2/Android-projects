package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sc0 extends AppCompatActivity {

   private Button x1;
   private Button n0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc0);
        getSupportActionBar().hide();

        n0=findViewById(R.id.bh0);
        x1=findViewById(R.id.idx1);

        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(1);
            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(sc0.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        });



    }
}
