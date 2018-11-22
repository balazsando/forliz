package com.bando.helpliz.eisenhower;

import com.bando.helpliz.eisenhower.model.TaskCalendar;
import com.bando.helpliz.eisenhower.model.TaskEntry;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        TaskCalendar calendar = new TaskCalendar();
        LocalDate date = LocalDate.of(2019, 6, 3);
        String task = "Do the laundry";
        TaskEntry entry1 = new TaskEntry(date, task);
        calendar.add(entry1);
        TaskEntry entry2 = new TaskEntry(LocalDate.of(2018, 11, 22), "Do the dishes");
        calendar.add(entry2);
        calendar.add(LocalDate.of(2019, 2, 18), "Take out trash");
        System.out.println(calendar);
    }
}
