package com.example.java.week4.day2;

public class PyramidShapeDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", " ".repeat(height - i - 1), "*".repeat(2 * i + 1));
    }
}
