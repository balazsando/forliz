package com.bando.helpliz.eisenhower;

import com.bando.helpliz.eisenhower.Models.TodoItem;
import com.bando.helpliz.eisenhower.Models.TodoQuarter;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        TodoQuarter quarter = new TodoQuarter();
        quarter.addItem("something", LocalDate.now());
        quarter.addItem("something2", LocalDate.now());
        TodoItem item = quarter.getItem(0);
        quarter.archiveItems();
        item = quarter.getItem(0);
        System.out.println(item.getIsDone());
        item.mark();
        System.out.println(item.getIsDone());
        quarter.archiveItems();
        try
        {
            quarter.getItem(0);
        }
        catch (Exception e)
        {
            System.out.println("item is deleted");
        }
    }

}
