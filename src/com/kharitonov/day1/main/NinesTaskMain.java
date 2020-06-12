package com.kharitonov.day1.main;

import com.kharitonov.day1.console.ShapeConsole;
import com.kharitonov.day1.entity.Circle;
import com.kharitonov.day1.exception.TaskException;
import com.kharitonov.day1.service.ShapeService;

public class NinesTaskMain {
    public static void main(String[] args) {
        double radius = 55.2;
        ShapeService shapeService = new ShapeService();
        Circle circle = new Circle(radius);
        try {
            double area = shapeService.getCircleArea(circle);
            double circumference = shapeService.getCircumference(circle);
            ShapeConsole shapeConsole = new ShapeConsole();
            shapeConsole.printCircleArea(radius, area);
            shapeConsole.printCircumference(radius, circumference);
        } catch (TaskException ex) {
            System.out.println(ex);
        }
    }
}
