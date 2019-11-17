package com.samsung.models;

import com.samsung.models.Point;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class PointTestToString {
    static double delta = 0.0001;

    @Parameters()
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Point(1, 2)},
                {new Point(-1, 2)},
                {new Point(0, 2)},
        });

    }

    private Point point;

    public PointTestToString(Point point) {
        this.point = point;
    }

    @Test
    public void toStringTest() {
        assertTrue(point.toString().length() > 0);
    }

}
