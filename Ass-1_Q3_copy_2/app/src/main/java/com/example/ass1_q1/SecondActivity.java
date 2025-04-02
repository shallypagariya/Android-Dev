
package com.example.ass1_q1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtMessage = findViewById(R.id.txtMessage);

        // Get the message from Intent
        String message = getIntent().getStringExtra("message");

        // Set the message in TextView
        txtMessage.setText(message);
    }
}
