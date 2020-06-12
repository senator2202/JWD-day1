package com.kharitonov.day1.main;

import com.kharitonov.day1.console.NumberConsole;
import com.kharitonov.day1.exception.TaskException;
import com.kharitonov.day1.service.NumberService;

public class FoursTaskMain {
    public static void main(String[] args) {
        int a = -22;
        int b = 11;
        int c = 7;
        int d = 9;
        try {
            boolean flag = new NumberService().checkForTwoEven(a, b, c, d);
            new NumberConsole().printResultForTwoEven(flag, a, b, c, d);
        } catch (TaskException ex) {
            System.out.println(ex);
        }
    }
}
