package com.example.java.week4.day2;

public abstract class ShapeDrawer {
    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public abstract String makeALine(int height, int i);
}
