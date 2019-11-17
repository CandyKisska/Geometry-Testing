package com.samsung.models;

public interface PointInterface {
    double getX();

    double getY();

    String toString();


    double distanceSq(Point pt);

    double distance(double px, double py);

}
