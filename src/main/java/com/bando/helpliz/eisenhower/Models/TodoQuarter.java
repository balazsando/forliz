package com.bando.helpliz.eisenhower.Models;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class TodoQuarter
{

    private List<TodoItem> todoItems;

    public TodoQuarter()
    {
        todoItems = new ArrayList<>();
    }

    public void addItem(String title, LocalDate deadline)
    {
        boolean canAdd = todoItems.add(new TodoItem(title, deadline));
        if (canAdd)
        {
            todoItems.sort(TodoItem::compareTo);
        }
    }

    public void removeItem(int index)
    {
        todoItems.remove(index);
    }

    public void archiveItems()
    {
        todoItems = todoItems.stream().filter(TodoItem::active).collect(Collectors.toList());
    }

    public TodoItem getItem(int index)
    {
        return todoItems.get(index);
    }

    public List<TodoItem> getItems()
    {
        return todoItems;
    }

    public String toString()
    {
        StringJoiner joiner = new StringJoiner("\n");
        int padding = String.valueOf(todoItems.size()).length();

        for (int i = 1; i <= todoItems.size(); i++)
        {
            joiner.add(String.format("%" + padding + "d %s", i, todoItems.get(i - 1)));
        }

        return joiner.toString();
    }

}
