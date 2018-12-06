package com.bando.helpliz.eisenhower;

import com.bando.helpliz.eisenhower.Models.TodoQuarter;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        TodoQuarter list = new TodoQuarter();
        list.addItem("wefihewfuiewe", LocalDate.now());
        list.addItem("wefwfewfwfewfwewef", LocalDate.now().minusDays(2));
        list.addItem("ewgfewwe", LocalDate.now().plusDays(2));
        System.out.println(list);
    }

}
