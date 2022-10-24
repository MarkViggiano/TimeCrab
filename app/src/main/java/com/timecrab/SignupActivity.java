package com.timecrab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentActivity;

import com.timecrab.signup.PersonalizationFragment;

public class SignupActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button personalizeButton = findViewById(R.id.personalization);
        personalizeButton.setOnClickListener(view -> {
            PersonalizationFragment personalizationFragment = new PersonalizationFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.fragplaceholder, personalizationFragment);
            ft.commit();
        });

        Button signupButton = findViewById(R.id.signup);
        signupButton.setOnClickListener((View v) -> startActivity(new Intent(SignupActivity.this, DashboardActivity.class)));

        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener((View v) -> startActivity(new Intent(SignupActivity.this, MainActivity.class)));


        //TODO: Check if the user is authenticated, if so send them to the dashboard

    }

}