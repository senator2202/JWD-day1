package com.kharitonov.day1.main;

import com.kharitonov.day1.console.ShapeConsole;
import com.kharitonov.day1.entity.Circle;
import com.kharitonov.day1.entity.Square;
import com.kharitonov.day1.exception.TaskException;
import com.kharitonov.day1.service.ShapeService;


public class ThirdTaskMain {
    /*Demonstration of task3*/
    public static void main(String[] args) {
        double area = 122.56;
        try {
            ShapeService shapeService = new ShapeService();
            ShapeConsole shapeConsole = new ShapeConsole();
            double side = shapeService.getSquareSide(area);
            Square describedSquare = new Square(side);
            Circle circle = shapeService.
                    getInscribedCircle(describedSquare);
            Square inscribedSquare = shapeService.
                    getInscribedSquare(circle);
            shapeConsole.printSquareArea(inscribedSquare.area());
            shapeConsole.printSquareScale(shapeService.
                    getSquareScale(describedSquare, inscribedSquare));
        } catch (TaskException ex) {
            System.out.println(ex);
        }
    }
}
