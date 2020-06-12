package com.kharitonov.day1.main;

import com.kharitonov.day1.console.NumberConsole;
import com.kharitonov.day1.exception.TaskException;
import com.kharitonov.day1.service.NumberService;

public class FirstTaskMain {
    /*Demonstration of task 1*/
    public static void main(String[] args) {
        int number = 44;
        try {
            int digit = new NumberService().getLastDigitOfSquare(number);
            new NumberConsole().printLastDigitOfSquare(number, digit);
        } catch (TaskException ex) {
            System.out.println(ex);
        }
    }
}
