package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double addAndMultiply(double first, double second) {
        return add(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumAddMultSubtDiv(double first, double second) {
        return add(first, second) + multiply(first, second)
                + subtract(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + addAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumAddMultSubtDiv(10, 20));
    }
}