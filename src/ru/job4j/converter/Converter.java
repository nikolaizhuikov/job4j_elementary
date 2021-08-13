package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToRuble(float value) {
        return value * 70;
    }

    public static float dollarToRuble(float value) {
        return value * 60;
    }

    public static void main(String[] args) {
        float value = 150;
        System.out.println(value + " rubles equal " + rubleToEuro(value) + " euros");
        System.out.println(value + " rubles equal " + rubleToDollar(value) + " dollars");
        System.out.println(value + " euros equal " + euroToRuble(value) + " rubles");
        System.out.println(value + " dollars equal " + dollarToRuble(value) + " rubles");
    }
}
