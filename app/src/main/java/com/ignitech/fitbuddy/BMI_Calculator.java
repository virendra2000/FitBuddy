package com.ignitech.fitbuddy;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class BMI_Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);
        final EditText e1 = findViewById(R.id.et1);
        final EditText e2 = findViewById(R.id.et2);
        final TextView tv4 = findViewById(R.id.tv4);

        findViewById(R.id.ib1).setOnClickListener(new View.OnClickListener() {

            // Logic for validation, input can't be empty
            @Override
            public void onClick(View v) {

                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();

                if (TextUtils.isEmpty(str1)) {
                    e1.setError("Please enter your weight");
                    e1.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(str2)) {
                    e2.setError("Please enter your height");
                    e2.requestFocus();
                    return;
                }

//Get the user values from the widget reference
                float weight = Float.parseFloat(str1);
                float height = Float.parseFloat(str2) / 100;

//Calculate BMI value
                float bmiValue = calculateBMI(weight, height);

//Define the meaning of the bmi value
                String bmiInterpretation = interpretBMI(bmiValue);

                tv4.setText(bmiValue + "-" + bmiInterpretation);

            }
        });
    }

    //Calculate BMI
    private float calculateBMI(float weight, float height) {
        return weight / (height * height);
    }

    // Interpret what BMI means
    private String interpretBMI(float bmiValue) {

        if (bmiValue < 16) {
            return "Severely Underweight Go And Eat Something!!!";
        } else if (bmiValue >16 && bmiValue < 18.5) {
            Intent abc = new Intent(BMI_Calculator.this, Under_Weight.class);
            startActivity(abc);
            return "Underweight";
        } else if (bmiValue > 18.5 && bmiValue < 25.0) {
            Intent abc = new Intent(BMI_Calculator.this, Normal_Weight.class);
            startActivity(abc);
            return "Normalweight";
        } else if (bmiValue > 25.0) {
            Intent abc = new Intent(BMI_Calculator.this,Over_Weight.class);
            startActivity(abc);
            return "Overweight";
        }
        return null;
    }
}

