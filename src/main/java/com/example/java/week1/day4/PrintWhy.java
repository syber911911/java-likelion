package com.example.java.week1.day4;

public class PrintWhy {
    public void printWhy() {
        System.out.println("Why");
    }

    public static void printWhat(){
        System.out.println("What");
    }
    public static void main(String[] args) {
        /**
         * printWhy() method는 인스턴스 생성 없이 사용 불가.
         * printWhat() method는 인스턴스 생성 없이 사용 가능.
         *
         * Static(정적) 객체는 JVM이 실행됨과 동시에 컴파일 되어 Static 영역에 적재.
         * Non-Static 객체는 new를 통해 인스턴스화가 되면 Heap 영역에 적재.
         *
         * Java Application 실행 ->  Static Object 컴파일 및 Static 영역(메모리)에 적재 -> Non-Static object는 new 연산자를 통한 인스턴스화가 진행 되는 경우에만 Heap 영역(메모리)
         *
         * Static method인 main과 printWhat()가 컴파일 되는 시점에 printWhy()는 컴파일이 되지 않는다.
         * 그렇기에 main method가 실행되는 시점에 같은 Static method인 printWhat()은 사용이 가능하지만
         * printWhy()는 printWhy 객체를 인스턴스화 해 Heap 영역에 적재하지 않으면 printWhy()는 사용이 불가하다.
         */
        printWhat();
        //printWhy();
        PrintWhy pw = new PrintWhy();
        pw.printWhy();
    }
}
