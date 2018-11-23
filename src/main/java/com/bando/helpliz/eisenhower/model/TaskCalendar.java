package com.bando.helpliz.eisenhower.model;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskCalendar extends ArrayList<TaskEntry>
{
    public void add(String year, String month, String day, String task)
    {
        try
        {
            TaskEntry entry = new TaskEntry(year, month, day, task);
            //Addition shortcut
            this.add(new TaskEntry(year, month, day, task));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid input: " + e);
        }
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
