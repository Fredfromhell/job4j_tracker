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
        Assert.assertEquals(expected, rsl, 0.1);

    }

    @Test
    public void testPoint2() {
        Point x = new Point(1, 2);
        Point y = new Point(3, 4);
        double rsl = x.distance(y);
        ;
        double expected = 2.83;
        Assert.assertEquals(expected, rsl, 0.01);

    }

    @Test
    public void testPoint3d() {
        Point x = new Point(1, 2, 3);
        Point y = new Point(3, 4, 5);
        double rsl = x.distance3d(y);
        ;
        double expected = 3.46;
        Assert.assertEquals(expected, rsl, 0.01);


    }
}
