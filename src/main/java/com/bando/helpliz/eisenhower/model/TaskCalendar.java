package com.bando.helpliz.eisenhower.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TaskCalendar extends ArrayList<TaskEntry>
{
    public void add(LocalDate date, String task)
    {
        //Addition shortcut
        this.add(new TaskEntry(date, task));
    }

    @Override public boolean add(TaskEntry taskEntry)
    {
        boolean ret = super.add(taskEntry);
        //Sorting the list after each addition
        if(ret) this.sort(TaskEntry::compareTo);
        return ret;
    }

    @Override public String toString()
    {
        //Pretty printing for easier digestion
        return Arrays.toString(this.toArray());
    }
}
