package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertThat(out, closeTo(2, 0.001));
    }

    @Test
    public void when35to93then6() {
        Point a = new Point(3, 5);
        Point b = new Point(9, 3);
        double out = a.distance(b);
        assertThat(out, closeTo(6.3246, 0.001));
    }

    @Test
    public void when803to937then10() {
        Point a = new Point(8, 0, 3);
        Point b = new Point(9, 3, 7);
        double out = a.distance(b);
        assertThat(out, closeTo(3.1622, 0.001));
    }

    @Test
    public void when803to069then3() {
        Point a = new Point(8, 0, 3);
        Point b = new Point(0, 6, 9);
        double out = a.distance(b);
        assertThat(out, closeTo(10, 0.001));
    }


}