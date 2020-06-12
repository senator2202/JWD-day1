package com.kharitonov.day1.main;

import com.kharitonov.day1.console.NumberConsole;
import com.kharitonov.day1.exception.TaskException;
import com.kharitonov.day1.service.NumberService;

public class FifthTaskMain {
    public static void main(String[] args) {
        int number = 6;
        try {
            boolean flag = new NumberService().isPerfect(number);
            new NumberConsole().printPerfect(number, flag);
        } catch (TaskException ex) {
            System.out.println(ex);
        }
    }
}
