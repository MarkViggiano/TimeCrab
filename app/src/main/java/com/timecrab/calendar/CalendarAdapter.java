package com.timecrab.calendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.timecrab.R;
import java.util.List;

/**
 * Class that allows Android to paginate the calendar data
 */
public class CalendarAdapter extends RecyclerView.Adapter<CalendarAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView dayName;
        private final TextView dayNumber;

        public ViewHolder(View itemView) {
            super(itemView);

            dayName = itemView.findViewById(R.id.dayName);
            dayNumber = itemView.findViewById(R.id.dayNumber);
        }

        public TextView getDayNameView() {
            return dayName;
        }

        public TextView getDayNumberView() {
            return dayNumber;
        }


    }

    private final List<CalendarDay> days;

    public CalendarAdapter(List<CalendarDay> days) {
        this.days = days;
    }

    @Override
    public CalendarAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View calendarView = inflater.inflate(R.layout.calendar_day_template, parent, false);

        // Return a new holder instance
        return new ViewHolder(calendarView);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(CalendarAdapter.ViewHolder holder, int position) {
        // Get the data model based on position
        CalendarDay day = this.days.get(position);

        // Set item views based on your views and data model
        TextView dayName = holder.getDayNameView();
        dayName.setText(day.getDayName());
        TextView dayNumber = holder.getDayNumberView();
        dayNumber.setText(String.format("%s", day.getDayNumber()));
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return days.size();
    }

}
