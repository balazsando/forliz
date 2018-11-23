package com.bando.helpliz.eisenhower.model;

import java.time.LocalDate;

public class TaskEntry implements Comparable<TaskEntry>
{
    private LocalDate date;
    private String task;

    public TaskEntry(String year, String month, String day, String task)
    {
        this.date = LocalDate.of(getInt(year), getMonth(month), getDay(day));
        this.task = task;
    }

    public TaskEntry(LocalDate date, String task)
    {
        this.date = date;
        this.task = task;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public String getTask()
    {
        return task;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public void setTask(String task)
    {
        this.task = task;
    }

    @Override public int compareTo(TaskEntry taskEntry)
    {
        //Using built in LocalDate comparator
        return date.compareTo(taskEntry.date);
    }

    @Override public String toString()
    {
        //Printing in desired format
        return String.format("%02d %02d \"%s\"", date.getDayOfMonth(), date.getMonthValue(), task);
    }

    private static int getDay(String day)
    {
        int ret = getInt(day);
        if(ret < 1 || ret > 31) throw new IllegalArgumentException("Day must be between 1 and 31");
        return ret;
    }

    private static int getMonth(String day)
    {
        int ret = getInt(day);
        if(ret < 1 || ret > 12) throw new IllegalArgumentException("Month must be between 1 and 12");
        return ret;
    }

    private static int getInt(String num)
    {
        try
        {
            return Integer.parseInt(num);
        }
        catch (NumberFormatException e)
        {
            throw new IllegalArgumentException("Not a number");
        }
    }
}
