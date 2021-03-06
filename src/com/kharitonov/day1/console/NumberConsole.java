package com.kharitonov.day1.console;

public class NumberConsole {
    public void printLastDigitOfSquare(int number, int digit) {
        System.out.printf("Last digit of the square" +
                " of the number %d is %d", number, digit);
    }

    public void printResultForTwoEven(boolean flag, int... numbers) {
        System.out.print(new StringBuilder().append("It is ").append(flag).
                append(" that there are two even numbers among "));
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public void printPerfect(int number, boolean flag) {
        StringBuilder sb = new StringBuilder();
        sb.append("The number ").append(number).append(" is perfect: ");
        sb.append(flag);
        System.out.println(sb);
    }
}
