package com.kharitonov.day1.console;

import com.kharitonov.day1.entity.Point;

public class PointConsole {
    private static final String CLOSER = " is closer to origin than ";
    private static final String SAME = " has the same distance " +
            "to origin as ";

    public void printClosestPoint(Point point1, Point point2, int flag) {
        StringBuilder sb = new StringBuilder();
        switch (flag) {
            case 0:
                sb.append(point1).append(SAME).append(point2);
                break;

            case 1:
                sb.append(point1).append(CLOSER).append(point2);
                break;

            case 2:
                sb.append(point2).append(CLOSER).append(point1);
                break;

            default:
                break;
        }
        System.out.println(sb.toString());
    }
}
