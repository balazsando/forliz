package com.bando.helpliz.eisenhower;

import com.bando.helpliz.eisenhower.model.TaskCalendar;
import com.bando.helpliz.eisenhower.model.TaskEntry;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        //New calendar
        TaskCalendar calendar = new TaskCalendar();

        //Verbose addition
        LocalDate date = LocalDate.of(2019, 6, 3);
        String task = "Do the laundry";
        TaskEntry entry1 = new TaskEntry(date, task);
        calendar.add(entry1);

        //Shortcut addition
        TaskEntry entry2 = new TaskEntry(LocalDate.of(2018, 11, 22), "Do the dishes");
        calendar.add(entry2);

        //One liner
        calendar.add(LocalDate.of(2019, 2, 18), "Take out trash");

        //Sorted result
        System.out.println(calendar);
    }
}
