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
        float in = 140;
        float expectedEuro = 2;
        float expectedDollar = 2.3333333F;
        float expectedEuroToRuble = 9800;
        float expectedDollarToRuble = 8400;
        float out = Converter.rubleToEuro(in);
        boolean passed = expectedEuro == out;
        System.out.println("140 rubles are 2.0 euros. Test result : " + passed);
        out = Converter.rubleToDollar(in);
        passed = expectedDollar == out;
        System.out.println("140 rubles are 2.3333333 dollars. Test result : " + passed);
        out = Converter.euroToRuble(in);
        passed = expectedEuroToRuble == out;
        System.out.println("140 euros are 9800.0 rubles. Test result : " + passed);
        out = Converter.dollarToRuble(in);
        passed = expectedDollarToRuble == out;
        System.out.println("140 dollars are 8400.0 rubles. Test result : " + passed);
    }
}
