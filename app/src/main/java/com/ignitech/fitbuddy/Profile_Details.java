package com.ignitech.fitbuddy;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Profile_Details extends AppCompatActivity {

    RadioGroup radioSexGroup;
    RadioButton radioSexButton;
    Button ib1;
    CardView card2,card3, card4, card5;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details);
        ib1 = findViewById(R.id.ib1);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profile_Details.this,BMI_Calculator.class);
                startActivity(i);
                finish();
            }
        });

        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner1);
//create a list of items for the spinner.
        String[] items = new String[]{"18-24", "25-40", "41-60"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);
    }
//    public void addListenerOnButton() {
//        radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
//
//
//        btnDisplay.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//// get selected radio button from radioGroup
//                int selectedId = radioSexGroup.getCheckedRadioButtonId();
//// find the radiobutton by returned id
//                radioSexButton = (RadioButton) findViewById(selectedId);
//
//                Toast.makeText(Profile_Details.this, radioSexButton.getText(), Toast.LENGTH_SHORT).show();
//            }
//        });
}





