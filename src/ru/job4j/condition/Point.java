package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rs1;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) = " + result);
        System.out.println("result (0, 0) to (3, 4) = " + Point.distance(0, 0, 3, 4));
        System.out.println("result (6, 8) to (0, 0) = " + Point.distance(6, 8, 0, 0));
        System.out.println("result (10, 0) to (7, 5) = " + Point.distance(10, 0, 7, 5));
    }
}
