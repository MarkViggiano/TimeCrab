package com.timecrab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ImageButton groupsButton = findViewById(R.id.groupsButton);
        groupsButton.setOnClickListener((View v) -> startActivity(new Intent(this, GroupsActivity.class)));

        /*
        ImageButton addFriendButton = findViewById(R.id.addfriendButton);
        addFriendButton.setOnClickListener((View v) -> startActivity(new Intent(this, AddFriendActivity.class)));
         */

        ImageButton homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener((View v) -> startActivity(new Intent(this, DashboardActivity.class)));

        ImageButton calendarButton = findViewById(R.id.calendarButton);
        calendarButton.setOnClickListener((View v) -> startActivity(new Intent(this, CalendarActivity.class)));

        ImageButton profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener((View v) -> startActivity(new Intent(this, ProfileActivity.class)));

    }

}
