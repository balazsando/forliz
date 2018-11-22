package com.bando.helpliz.eisenhower.model;

import java.time.LocalDate;

public class TaskEntry implements Comparable<TaskEntry>
{
    private LocalDate date;
    private String task;

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
        return date.compareTo(taskEntry.date);
    }

    @Override public String toString()
    {
        return String.format("%02d %02d \"%s\"", date.getDayOfMonth(), date.getMonthValue(), task);
    }
}
