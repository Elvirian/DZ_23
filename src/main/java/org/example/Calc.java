package org.example;

public class Calc {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static int divInt(int a, int b) {
        return a / b;
    }

    public static int divRem(int a, int b) {
        return a % b;
    }

    public static double sqr(double x) {
        return x * x;
    }

    public static double sqrt(double x) {
        return Math.sqrt(x);
    }

    public static double abs(double x) {
        return Math.abs(x);
    }

    public static double round(double x) {
        return Math.round(x);
    }


}