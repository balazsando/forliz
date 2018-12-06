package com.bando.helpliz.eisenhower.Models;

import java.time.LocalDate;
import java.time.Period;

public class TodoItem implements Comparable<TodoItem>
{
    private String title;
    private LocalDate deadline;
    private boolean isDone;

    public TodoItem(String title, LocalDate deadline)
    {
        this.title = title;
        this.deadline = deadline;
        this.isDone = false;
    }

    public String getTitle()
    {
        return title;
    }

    public LocalDate getDeadline()
    {
        return deadline;
    }

    public void mark()
    {
        isDone = true;
    }

    public void unmark()
    {
        isDone = false;
    }

    public boolean getIsDone()
    {
        return isDone;
    }

    public boolean isUrgent()
    {
        return Period.between(LocalDate.now(), deadline).getDays() <= 3;
    }

    @Override public String toString()
    {
        String isDoneSign = this.isDone ? "[x]" : "[ ]";

        return String.format("%s %02d-%02d %s", isDoneSign, deadline.getDayOfMonth(), deadline.getMonthValue(), title);
    }

    @Override public int compareTo(TodoItem other)
    {
        return deadline.compareTo(other.deadline);
    }

}
