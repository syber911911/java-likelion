package com.example.java.week4.day2;

public class ParallelogramShapeDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", " ".repeat(i), "*".repeat(height));
    }
}
