package com.example.java.week4.day3;

public class PyramidDrawer {
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
    }

    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public static void main(String[] args) {
        PyramidDrawer rtd = new PyramidDrawer();
        rtd.printShape(5);
    }
}
