package com.example.java.week2.Day2;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "GOLD";
        String s2 = "GOLD";
        System.out.printf("s1 == s2 ? %b\n", s1 == s2);
        System.out.printf("s1.equals(s2) ? %b\n\n", s1.equals(s2));

        String s3 = new String("GOLD");
        String s4 = new String("GOLD");
        System.out.printf("s3 == s4 ? %b\n", s3 == s4);
        System.out.printf("s3.equals(s4) ? %b\n\n", s3.equals(s4));

        System.out.printf("s1 == s3 ? %b\n", s1 == s3);
        System.out.printf("s1.equals(s3) ? %b\n\n", s3.equals(s4));

        System.out.printf("s1.hashCode(): %d, s3.hashCode(): %d\n\n", s1.hashCode(), s3.hashCode());
        System.out.printf("System.identityHashCode(s1): %d, System.identityHashCode(s3): %d\n",
                System.identityHashCode(s1), System.identityHashCode(s3));
    }
}
