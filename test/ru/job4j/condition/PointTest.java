package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when00To34Then5() {
        double expected = 5;
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 4;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when68To00Then10() {
        double expected = 10;
        int x1 = 6;
        int y1 = 8;
        int x2 = 0;
        int y2 = 0;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when108To74Then5() {
        double expected = 5;
        int x1 = 10;
        int y1 = 8;
        int x2 = 7;
        int y2 = 4;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }
}