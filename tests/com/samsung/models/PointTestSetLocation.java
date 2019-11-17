package com.samsung.models;

import com.samsung.models.Point;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PointTestSetLocation {
    static double delta = 0.0001;

    @Parameters(name = "{index}: type is {0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Point(1, 2), -1, -2,
                        -1d, -2d},
                {new Point(3, 4), 3, 4,
                        3d, 4d},
                {new Point(5, 6), -1, 0,
                        -1d, 0d},
                {new Point(0, 1), 0, 1,
                        0d, 1d},
                {new Point(9, 0), 0, 0,
                        0d, 0d},
        });

    }

    private Point point;
    private double locX;
    private double locY;
    private double ansX;
    private double ansY;

    public PointTestSetLocation(Point point, double locX, double locY, double ansX, double ansY) {
        this.point = point;
        this.locX = locX;
        this.locY = locY;
        this.ansX = ansX;
        this.ansY = ansY;
    }

    @Test
    public void setLocation() {
        point.setLocation(locX, locY);

        assertEquals(ansX, point.getX(), delta);
        assertEquals(ansY, point.getY(), delta);
    }


}
