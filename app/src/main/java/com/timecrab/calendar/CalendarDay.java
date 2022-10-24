package com.timecrab.calendar;

public class CalendarDay {

    private final String dayName;
    private final int dayNumber;

    public CalendarDay(String dayName, int dayNumber) {
        this.dayName = dayName;
        this.dayNumber = dayNumber;
    }

    public String getDayName() {
        return dayName;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    @Override
    public String toString() {
        return String.format("%s the %s", getDayName(), getDayNumber());
    }

}
