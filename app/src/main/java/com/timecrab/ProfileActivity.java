package com.timecrab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageButton groupsButton = findViewById(R.id.groups);
        groupsButton.setOnClickListener((View v) -> startActivity(new Intent(this, GroupsActivity.class)));

        ImageButton homeButton = findViewById(R.id.home);
        homeButton.setOnClickListener((View v) -> startActivity(new Intent(this, DashboardActivity.class)));

        ImageButton calendarButton = findViewById(R.id.calendar);
        calendarButton.setOnClickListener((View v) -> startActivity(new Intent(this, CalendarActivity.class)));

    }

}
