package com.ignitech.fitbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Under_Weight extends AppCompatActivity {

    ImageView veg,nonveg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_weight);

        veg=findViewById(R.id.veg);
        nonveg=findViewById(R.id.nonveg);
        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Under_Weight.this,Under_Weight.class);
                startActivity(i);
                finish();
            }
        });
        nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Under_Weight.this,undernonveg.class);
                startActivity(i);
                finish();
            }
        });
    }
}