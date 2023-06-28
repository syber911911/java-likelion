package com.example.java.week2.Day2;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD"); //GOLD의 메모리 주소 비교

        String s1 = "GOLD".substring(0, 1);
        String s2 = "G";

        String s3 = "GOLD";
        String s4 = new String("GOLD");

        System.out.println(s3 == s4);
        System.out.println("s3 hash: " + s3.hashCode());
        System.out.println("s4 hash: " + s4.hashCode());
        //hashCode()는 각 객체 내용을 기반으로 만들어진 hash값 != 메모리 주소
        //JAVA는 GC의 영향으로 객체가 저장된 메모리 주소가 변화하기 때문에 주소 값 자체를 반환받거나 하는 경우는 거의 없다
        // 또한 JAVA 자체에서도 시스템 적으로 메모리 주소공간에 접근하는 것을 막고 있다.
        // System.identityHashCode(Object obj)를 사용하면 객체의 내용이 아닌 객체의 메모리 주소를 기반으로 한 hashCode를 생성한다.
        // new로 생성한 String 객체는 Heap에 문자열 literal(String s3 = " ")로 생성된 String 객체는 Heap 내부에 String Constant Pool에 저장.
        System.out.println(s1.equals(s2));
    }
}
