package com.bridgelabs.basics.java_basic_problems;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner Factor = new Scanner(System.in);
        System.out.println("Enter Number");
        int A = Factor.nextInt();
        for (int i = 2; i * i <= A; ++i) {
            while (A % i == 0) {
                A /= i;
                System.out.print(String.valueOf(i) + " ");
            }
        }
        if (A != 1) {
            System.out.print(A);
        }
    }
}