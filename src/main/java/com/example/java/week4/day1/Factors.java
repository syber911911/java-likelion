package com.example.java.week4.day1;

public class Factors {
    public int sumOfFactors(int num) {
        int answer = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) answer += i;
        }
        return answer;
    }

    public void printResult(int num) {
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num , this.sumOfFactors(num));
    }

    public static void main(String[] args) {
        Factors factor = new Factors();
        factor.printResult(12);
        factor.printResult(36);
        factor.printResult(48);
        factor.printResult(29);
    }
}
