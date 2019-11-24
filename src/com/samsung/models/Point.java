package com.samsung.models;

public class Point {
     double x;
     double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "Point[" + x + "," + y + "]";
    }

    public static int compareX(Point a, Point b) {
        return Double.compare(a.x, b.x);

    }

    public static int compareY(Point a, Point b) {
        return Double.compare(a.y, b.y);
    }

    public static double distanceSq(Point a, Point b){
        return Math.pow((b.x - a.x),2) + Math.pow((b.y - a.y),2);
    }

    public  double distanceSq(Point pt){
        return Math.pow((pt.x - this.x),2) + Math.pow((pt.y - this.y),2);
    }

    public static double distance(Point a, Point b){
        return  Math.sqrt(distanceSq(a, b));
    }

    public  double distance(Point pt) {
        return Math.sqrt(distanceSq(pt));
    }

    public void setLocation(double x, double y){
        this.x = x;
        this.y = y;
    }

}
