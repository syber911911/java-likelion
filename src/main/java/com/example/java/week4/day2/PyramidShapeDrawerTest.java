package com.example.java.week4.day2;

public class PyramidShapeDrawerTest {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new PyramidShapeDrawer();
        ParallelogramShapeDrawer parallelogramSD = new ParallelogramShapeDrawer();
        shapeDrawer.printShape(4);
        parallelogramSD.printShape(4);
    }
}
