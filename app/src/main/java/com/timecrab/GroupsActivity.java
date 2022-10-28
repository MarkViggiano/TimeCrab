package com.timecrab;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.timecrab.groups.AddFriendFragment;

public class GroupsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        //add friend button that opens the fragment
        Button addFriendButton = findViewById(R.id.addfriend);
        addFriendButton.setOnClickListener(view -> {
            FragmentManager fm = getSupportFragmentManager();
            AddFriendFragment openFragment = (AddFriendFragment) fm.findFragmentById(R.id.fragplaceholder);

            if (openFragment != null && openFragment.isVisible()) return;

            AddFriendFragment addFriend = new AddFriendFragment();
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.fragplaceholder, addFriend);
            ft.commit();

        });

        //bottom navbar
        ImageButton homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener((View v) -> startActivity(new Intent(GroupsActivity.this, DashboardActivity.class)));

        ImageButton calendarButton = findViewById(R.id.calendarButton);
        calendarButton.setOnClickListener((View v) -> startActivity(new Intent(GroupsActivity.this, CalendarActivity.class)));

        ImageButton profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener((View v) -> startActivity(new Intent(GroupsActivity.this, ProfileActivity.class)));

    }

}
