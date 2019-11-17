package com.samsung.models;

public interface PointInterface {
    double getX();

    double getY();

    String toString();

    int compareX(Point a, Point b);

    int compareY(Point a, Point b);

    double distanceSq(Point pt);

    double distance(double px, double py);

}
