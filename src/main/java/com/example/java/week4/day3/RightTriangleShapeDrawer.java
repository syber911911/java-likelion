package com.example.java.week4.day3;

import java.io.IOException;

public class RightTriangleShapeDrawer extends ShapeDrawer{
    public RightTriangleShapeDrawer(Printer2 printer) {
        super(printer);
    }

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s\n", "*".repeat(i + 1));
    }

    public static void main(String[] args) throws IOException {
        ShapeDrawer rightTriangle = new RightTriangleShapeDrawer(new ConsolePrinter2());
        rightTriangle.printShape(5);
    }
}
