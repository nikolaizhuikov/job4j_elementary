package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchDayOfWeekTest {
    @Test
    public void whenDayIs1() {
        int day = 1;
        String actual = SwitchDayOfWeek.nameOfDay(day);
        String expected = "Monday";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIs2() {
        int day = 2;
        String actual = SwitchDayOfWeek.nameOfDay(day);
        String expected = "Tuesday";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIs3() {
        int day = 3;
        String actual = SwitchDayOfWeek.nameOfDay(day);
        String expected = "Wednesday";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIs4() {
        int day = 4;
        String actual = SwitchDayOfWeek.nameOfDay(day);
        String expected = "Thursday";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIs5() {
        int day = 5;
        String actual = SwitchDayOfWeek.nameOfDay(day);
        String expected = "Friday";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIs6() {
        int day = 6;
        String actual = SwitchDayOfWeek.nameOfDay(day);
        String expected = "Saturday";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIs7() {
        int day = 7;
        String actual = SwitchDayOfWeek.nameOfDay(day);
        String expected = "Sunday";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIs0() {
        int day = 0;
        String actual = SwitchDayOfWeek.nameOfDay(day);
        String expected = "Error";
        Assert.assertEquals(expected, actual);
    }
}