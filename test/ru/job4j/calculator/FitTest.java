package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double actual = Fit.manWeight(in);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double actual = Fit.womanWeight(in);
        Assert.assertEquals(expected, actual, 0.01);
    }
}