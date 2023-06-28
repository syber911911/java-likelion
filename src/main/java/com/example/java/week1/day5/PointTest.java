package com.example.java.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.x = 10;
        point.staticY = 20;

        System.out.printf("x좌표: %d, y좌표: %d\n", point.x, point.staticY);

        Point point1 = new Point();
        System.out.printf("x좌표: %d, y좌표: %d\n", point1.x, point1.staticY);
        //static 변수는 값을 유지, JVM의 종료 시점까지 메모리에 상주하기 때문.
        //non-static 변수는 heap 영역에 적재되기 때문에 인스턴스의 종료와 맴버 변수 또한 메모리에서 사라짐.
    }
}
