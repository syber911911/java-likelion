package com.example.java.week4.day3;

import java.io.IOException;

public class DiamondShapeDrawer extends ShapeDrawer {
    public DiamondShapeDrawer(Printer2 printer) {
        super(printer);
    }

    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) throws IOException {
        DiamondShapeDrawer diamondSD = new DiamondShapeDrawer(new ConsolePrinter2());
        diamondSD.printShape(7);
    }
}
