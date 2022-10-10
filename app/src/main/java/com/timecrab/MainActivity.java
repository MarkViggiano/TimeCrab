package com.timecrab;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Signup page
 *
 * this is the first page of the app for now, until we get the login system working
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login);
        loginButton.setOnClickListener((View v) -> {
            Intent i = new Intent(MainActivity.this, DashboardActivity.class);
            startActivity(i);
        });

        Button signupButton = findViewById(R.id.signup);
        signupButton.setOnClickListener((View v) -> {
            Intent i = new Intent(MainActivity.this, SignupActivity.class);
            startActivity(i);
        });

        //TODO: Check if the user is authenticated, if so send them to the dashboard

    }

}