package ru.job4j.oop;


import org.junit.Assert;
import org.junit.Test;


public class PointTest {

    @Test
    public void testPoint() {
        Point x = new Point(0, 0);
        Point y = new Point(0, 2);
        double rsl = x.distance(y);
        ;
        double expected = 2.0;
        Assert.assertEquals(expected, rsl, 4);

    }

    @Test
    public void testPoint2() {
        Point x = new Point(1, 2);
        Point y = new Point(3, 4);
        double rsl = x.distance(y);
        ;
        double expected = 2.8284271247461903;
        Assert.assertEquals(expected, rsl, 4);

    }

}
