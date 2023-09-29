package com.ignitech.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Normal_Weight extends AppCompatActivity {

    ImageView veg,nonveg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_weight);
        veg=findViewById(R.id.veg);
        nonveg=findViewById(R.id.nonveg);
        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Normal_Weight.this,Normal_Weight.class);
                startActivity(i);
                finish();
            }
        });
        nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Normal_Weight.this,veg_weightgain.class);
                startActivity(i);
                finish();
            }
        });
    }
    }


