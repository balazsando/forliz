package com.bando.helpliz.eisenhower.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TaskCalendar extends ArrayList<TaskEntry>
{
    public void add(LocalDate date, String task)
    {
        this.add(new TaskEntry(date, task));
    }

    @Override public String toString()
    {
        return Arrays.toString(this.stream().sorted().toArray());
    }
}
