package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int a) {
        return x + a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int num = 1;
        int sum = sum(num);
        int minus = minus(num);
        Calculator casio = new Calculator();
        int multiply = casio.multiply(num);
        int divide = casio.divide(num);
        int sumAllOperation = casio.sumAllOperation(num);
        System.out.println(sum + minus + multiply + divide + sumAllOperation);
    }
}
