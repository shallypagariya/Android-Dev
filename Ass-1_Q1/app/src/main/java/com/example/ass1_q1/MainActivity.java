package com.example.ass1_q1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextFeet;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        editTextFeet = findViewById(R.id.editTextFeet);
        Button btnConvert = findViewById(R.id.btnConvert);
        textViewResult = findViewById(R.id.textViewResult);

        // Set button click listener
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertFeetToCm();
            }
        });
    }

    private void convertFeetToCm() {
        String feetText = editTextFeet.getText().toString();

        if (!feetText.isEmpty()) {
            double feet = Double.parseDouble(feetText);
            double centimeters = feet * 30.48; // Conversion factor
            textViewResult.setText(feet + " feet = " + centimeters + " cm");
        } else {
            textViewResult.setText("Please enter a valid number");
        }
    }
}