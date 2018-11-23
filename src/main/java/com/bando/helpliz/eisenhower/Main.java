package com.bando.helpliz.eisenhower;

import com.bando.helpliz.eisenhower.model.TaskCalendar;
import com.bando.helpliz.eisenhower.model.TaskEntry;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        //New calendar
        TaskCalendar calendar = new TaskCalendar();

        //Object addition
        LocalDate date = LocalDate.of(2019, 6, 3);
        String task = "Do the laundry";
        TaskEntry entry1 = new TaskEntry(date, task);
        calendar.add(entry1);

        //CSV addition
        TaskEntry entry2 = new TaskEntry("2018", "11", "22", "Do the dishes");
        calendar.add(entry2);

        //One liner
        calendar.add("2019", "02", "18", "Take out trash");

        //Sorted result
        System.out.println(calendar);

        //Invalid inputs
        calendar.add("aa", "05", "6", "Wrong year");
        calendar.add("2019", "34", "06", "Wrong month");
        calendar.add("2019", "05", "-5", "Wrong day");
        System.out.println(calendar);
    }
}
