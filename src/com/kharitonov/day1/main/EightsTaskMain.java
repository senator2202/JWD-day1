package com.kharitonov.day1.main;

import com.kharitonov.day1.console.FunctionConsole;
import com.kharitonov.day1.entity.TaskFunction;
import com.kharitonov.day1.exception.TaskException;
import com.kharitonov.day1.service.FunctionService;

public class EightsTaskMain {
    public static void main(String[] args) {
        TaskFunction taskFunction = new TaskFunction();
        double x = -2.2;
        try {
            FunctionService functionService = new FunctionService();
            double result = functionService.getTaskFunctionValue(taskFunction,
                    x);
            String functionSign = functionService.
                    getTaskFunctionSignature(taskFunction, x);
            new FunctionConsole().
                    printFunctionValue(functionSign, x, result);
        } catch (TaskException ex) {
            System.out.println(ex);
        }
    }
}
