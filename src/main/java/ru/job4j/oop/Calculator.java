package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public double divide(double y) {
        return y / x;
    }

    public double sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + Calculator.sum(4));
        System.out.println("Minus: " + Calculator.minus(4));

        Calculator calculator = new Calculator();
        System.out.println("Multiply: " + calculator.multiply(4));
        System.out.println("Divide: " + calculator.divide(4));
        System.out.println("All operations: " + calculator.sumAllOperation(4));
    }
}