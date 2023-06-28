package com.example.java.week1.day5;

public class Point {
    int x;
    int y;
    static int staticY;

    boolean isSameXy(){
        return x == y;
    }

    double getDistance(Point p2) {
        int xLength = Math.abs(p2.x - this.x);
        int yLength = Math.abs(p2.y - this.y);

        double sumOfPow = Math.pow(xLength, 2) + Math.pow(yLength, 2);
        double result = Math.sqrt(sumOfPow);

        return result;
    }
}
