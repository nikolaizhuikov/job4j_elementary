package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double actual = SqArea.square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        double expected = 1;
        double p = 4;
        double k = 1;
        double actual = SqArea.square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP30K4Square36() {
        double expected = 36;
        double p = 30;
        double k = 4;
        double actual = SqArea.square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }
}