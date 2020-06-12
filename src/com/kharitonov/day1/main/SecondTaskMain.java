package com.kharitonov.day1.main;

import com.kharitonov.day1.console.DateTimeConsole;
import com.kharitonov.day1.exception.TaskException;
import com.kharitonov.day1.service.DateTimeService;

public class SecondTaskMain {
    /*Demonstration of task 2*/
    public static void main(String[] args) {
        int month = 2;
        int year = 2020;
        DateTimeService dateTimeService = new DateTimeService();
        try {
            int days = dateTimeService.getDays(month, year);
            boolean isLeap = dateTimeService.isLeapYear(year);
            DateTimeConsole dateTimeConsole = new DateTimeConsole();
            dateTimeConsole.printNumberOfDays(month, year, days);
            dateTimeConsole.printLeapYear(year, isLeap);
        } catch (TaskException e) {
            System.out.println(e);
        }
    }
}
