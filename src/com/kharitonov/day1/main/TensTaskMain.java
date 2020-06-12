package com.kharitonov.day1.main;

import com.kharitonov.day1.console.FunctionConsole;
import com.kharitonov.day1.entity.TangentFunction;
import com.kharitonov.day1.exception.TaskException;
import com.kharitonov.day1.service.FunctionService;

import java.util.HashMap;

public class TensTaskMain {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 3.0;
        double h = 1.0;
        try {
            TangentFunction tg = new TangentFunction();
            FunctionService functionService = new FunctionService();
            HashMap<Double, Double> result =
                    (HashMap<Double, Double>) functionService.
                            getTangentValues(tg, a, b, h);
            FunctionConsole functionConsole = new FunctionConsole();
            functionConsole.printFunctionValues(tg.getSignature(),
                    result);
        } catch (TaskException ex) {
            System.out.println(ex);
        }
    }
}
