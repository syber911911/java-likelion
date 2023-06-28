package com.example.java.week1.day5;

public class DistanceTwoPoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();

        point1.x = 5;
        point1.y = 10;
        point2.x = 1;
        point2.y = 4;

        System.out.printf("두 점 사이의 거리: %.2f", point1.getDistance(point2));
    }
}
