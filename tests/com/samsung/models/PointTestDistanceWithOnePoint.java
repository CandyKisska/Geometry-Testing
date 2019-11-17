package com.samsung.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static com.samsung.models.PointTestGetX.delta;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PointTestDistanceWithOnePoint {
    @Parameters()
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Point(2, 2), new Point(2, 4),
                        Math.sqrt(4d), new Point(2, 2), new Point(2, 4)},

                {new Point(0, 0), new Point(1, 2),
                        Math.sqrt(5d), new Point(0, 0), new Point(1, 2)},

                {new Point(3, 4), new Point(0, 0),
                        Math.sqrt(25d), new Point(3, 4), new Point(0, 0)},

                {new Point(-2, -2), new Point(2, 2),
                        Math.sqrt(32d), new Point(-2, -2), new Point(2, 2)},

                {new Point(2, 2), new Point(-2, -2),
                        Math.sqrt(32d), new Point(2, 2), new Point(-2, -2)},
        });

    }

    private Point a;
    private Point b;
    private double ans;
    private Point ansA;
    private Point ansB;

    public PointTestDistanceWithOnePoint(Point a, Point b, double ans, Point ansA, Point ansB) {
        this.a = a;
        this.b = b;
        this.ans = ans;
        this.ansA = ansA;
        this.ansB = ansB;
    }

    @Test
    public void distance() {
        double sq = a.distance(b);

        assertEquals(ans, sq, delta);

        assertEquals(ansA.getX(), a.getX(), delta);
        assertEquals(ansA.getY(), a.getY(), delta);

        assertEquals(ansB.getX(), b.getX(), delta);
        assertEquals(ansB.getY(), b.getY(), delta);
    }


}
