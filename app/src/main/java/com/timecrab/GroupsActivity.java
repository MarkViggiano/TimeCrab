package com.timecrab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class GroupsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        ImageButton groupsButton = findViewById(R.id.groupsButton);
        groupsButton.setOnClickListener((View v) -> startActivity(new Intent(this, GroupsActivity.class)));

        ImageButton homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener((View v) -> startActivity(new Intent(GroupsActivity.this, DashboardActivity.class)));

        ImageButton calendarButton = findViewById(R.id.calendarButton);
        calendarButton.setOnClickListener((View v) -> startActivity(new Intent(GroupsActivity.this, CalendarActivity.class)));

        ImageButton profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener((View v) -> startActivity(new Intent(GroupsActivity.this, ProfileActivity.class)));

    }

}
