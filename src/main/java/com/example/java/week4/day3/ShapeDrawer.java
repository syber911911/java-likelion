package com.example.java.week4.day3;

import java.io.IOException;

public abstract class ShapeDrawer {
    Printer2 printer;

    public ShapeDrawer(Printer2 printer) {
        this.printer = printer;
    }

    public abstract String makeALine(int h, int i);
//    {
//        return String.format("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i - 1));
//    }
    public void printShape(int height) throws IOException {
        for (int i = 0; i < height; i++) {
            printer.print(makeALine(height, i));
            //System.out.print(makeALine(height, i));
        }
    }
}
