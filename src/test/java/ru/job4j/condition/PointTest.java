package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when04to24then2() {
        int expected = 2;
        Point a = new Point(0, 4);
        Point b = new Point(2, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to08then8() {
        int expected = 8;
        Point a = new Point(0, 0);
        Point b = new Point(0, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to52then4() {
        int expected = 4;
        Point a = new Point(1, 2);
        Point b = new Point(5, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}