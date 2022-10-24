package com.timecrab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.timecrab.calendar.CalendarAdapter;
import com.timecrab.calendar.CalendarDay;
import java.util.ArrayList;
import java.util.List;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        //Scroll through Calendar Days
        RecyclerView rvCalendar = findViewById(R.id.calendarDay);
        List<CalendarDay> days = new ArrayList<>();

        //TODO: LOAD DAY DATA FROM DB
        for (int i = 1; i < 30; i++) days.add(new CalendarDay("Monday", i));

        CalendarAdapter adapter = new CalendarAdapter(days);
        rvCalendar.setAdapter(adapter);
        rvCalendar.setLayoutManager(new LinearLayoutManager(this));

        //Buttons for bottom navbar
        ImageButton groupsButton = findViewById(R.id.groupsButton);
        groupsButton.setOnClickListener((View v) -> startActivity(new Intent(this, GroupsActivity.class)));

        ImageButton homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener((View v) -> startActivity(new Intent(this, DashboardActivity.class)));

        ImageButton profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener((View v) -> startActivity(new Intent(this, ProfileActivity.class)));

    }

}
