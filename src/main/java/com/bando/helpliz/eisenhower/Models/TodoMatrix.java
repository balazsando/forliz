package com.bando.helpliz.eisenhower.Models;

import com.bando.helpliz.eisenhower.Quarter;

import java.time.LocalDate;

import java.util.HashMap;
import java.util.Map;

public class TodoMatrix
{

    private Map<Quarter, TodoQuarter> todoQuarters;

    public TodoMatrix()
    {
        todoQuarters = new HashMap<>();
        todoQuarters.put(Quarter.IU, new TodoQuarter());
        todoQuarters.put(Quarter.IN, new TodoQuarter());
        todoQuarters.put(Quarter.NU, new TodoQuarter());
        todoQuarters.put(Quarter.NN, new TodoQuarter());
    }

    public Map<Quarter, TodoQuarter> getQuarters()
    {
        return todoQuarters;
    }

    public TodoQuarter getQuarter(Quarter quarter)
    {
        return todoQuarters.get(quarter);
    }

    public void addItem(String title, LocalDate deadline, boolean isImportant)
    {
    }

    public void addItemsFromFile(String fileName)
    {
    }

    public void saveItemsToFile(String fileName)
    {
    }

    public void archiveItems()
    {
    }

    public String toString()
    {
        return null;
    }

}
