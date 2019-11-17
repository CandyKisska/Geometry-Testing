package com.samsung.models;

import com.samsung.models.Point;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PointTestGetX {
    static double delta = 0.0001;

    @Parameters()
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Point(1, 2), 1d},
                {new Point(-1, 2), -1d},
                {new Point(0, 2), 0d},
        });

    }

    private Point point;
    private double ans;

    public PointTestGetX(Point point, double ans) {
        this.point = point;
        this.ans = ans;
    }

    @Test
    public void getX() {
        assertEquals(ans, point.getX(), delta);
    }

}
