package com.kharitonov.day1.main;

import com.kharitonov.day1.console.DateTimeConsole;
import com.kharitonov.day1.entity.Time;
import com.kharitonov.day1.exception.TaskException;
import com.kharitonov.day1.service.DateTimeService;

public class SixthTaskMain {
    public static void main(String[] args) {
        int totalSeconds = 55555;
        try {
            Time time = new DateTimeService().splitSeconds(totalSeconds);
            new DateTimeConsole().printSplitSeconds(totalSeconds, time);

        } catch (TaskException ex) {
            System.out.println(ex);
        }
    }
}
