package com.samsung.models;

import java.awt.geom.Point2D;

public interface PointInterface {
    double getX();

    double getY();

    String toString();

    int compareX(Point a, Point b);

    int compareY(Point a, Point b);

    double distanceSq(Point2D pt);

    double distance(double px, double py);
}
