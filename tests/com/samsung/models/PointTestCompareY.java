package com.samsung.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PointTestCompareY {
    @Parameters()
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Point(2, 2), new Point(2, 4), -1},
                {new Point(0, 0), new Point(1, 2), -1},
                {new Point(3, 0), new Point(0, 0), 0},
                {new Point(-2, -2), new Point(2, 2), -1},
                {new Point(2, 2), new Point(-2, -2), 1},
        });

    }

    private Point a;
    private Point b;
    private int ans;

    public PointTestCompareY(Point a, Point b, int ans) {
        this.a = a;
        this.b = b;
        this.ans = ans;
    }

    @Test
    public void distance() {
        int sq = Point.compareY(a, b);

        assertEquals(ans, sq);
    }


}
