package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sfinal extends AppCompatActivity {
private Button x7,x77;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sfinal);
        getSupportActionBar().hide();

        x7=findViewById(R.id.idx7);
        x77=findViewById(R.id.bh6);
        x7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        x77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(sfinal.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        });


    }
}
