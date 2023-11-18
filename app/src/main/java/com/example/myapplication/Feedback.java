package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
        RatingBar RBFeedback = findViewById(R.id.ratingBar);
        EditText TVFeedback = findViewById(R.id.editTextTextMultiLine);
        // get radio button value
        RadioGroup RGFeedback = findViewById(R.id.radioGroup);
        Button BtnSubmit = findViewById(R.id.button3);

        BtnSubmit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String message = "Thank you for your feedback!";
                if (!TVFeedback.getText().toString().isEmpty()){
                    message += "\nPlease enjoy 2 weeks GitHub Pro.";
                }
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });

        RBFeedback.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser){
                TextView TVRating = findViewById(R.id.textView4);
                TVRating.setText("Rating: " + rating);
            }
        });

    }
}
