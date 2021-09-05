package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchDayOfWeekTest {
    @Test
    public void whenDayIsMonday() {
        String name = "Monday";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsRuMonday() {
        String name = "Понедельник";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsTuesday() {
        String name = "Tuesday";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsRuTuesday() {
        String name = "Вторник";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsWednesday() {
        String name = "Wednesday";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsRuWednesday() {
        String name = "Среда";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsThursday() {
        String name = "Thursday";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsRuThursday() {
        String name = "Четверг";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsFriday() {
        String name = "Friday";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsRuFriday() {
        String name = "Пятница";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsSaturday() {
        String name = "Saturday";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsRuSaturday() {
        String name = "Суббота";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsSunday() {
        String name = "Sunday";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 7;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenDayIsRuSunday() {
        String name = "Воскресенье";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = 7;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenNameIsNotDayOfWeek() {
        String name = "Error";
        int actual = MultipleSwitchDayOfWeek.numberOfDay(name);
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }
}