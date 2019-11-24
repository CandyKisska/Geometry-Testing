package com.samsung.models;

public class Line {
    Point a;
    Point b;


    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Line(double x1, double y1, double x2, double y2) {
        a.x = x1;
        a.y = y1;
        b.x = x2;
        b.y = y2;
    }

    public Line(Line l) {
        this.a = l.a;
        this.b = l.b;

    }




}
