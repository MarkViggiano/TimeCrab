package com.timecrab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button personalizeButton = findViewById(R.id.personalization);
        personalizeButton.setOnClickListener((View v) -> startActivity(new Intent(SignupActivity.this, ProfileActivity.class)));

        Button signupButton = findViewById(R.id.signup);
        signupButton.setOnClickListener((View v) -> startActivity(new Intent(SignupActivity.this, DashboardActivity.class)));

        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener((View v) -> startActivity(new Intent(SignupActivity.this, MainActivity.class)));


        //TODO: Check if the user is authenticated, if so send them to the dashboard

    }

}
