package com.bridgelabs.basics.java_basic_problems;

import java.util.Scanner;

public class QuotientRemainderProgram {
    public static void main(String[] args) {
        int NUMERATOR ,DENOMITOR;
        double REMAINDER ,QUOTIENT;

        Scanner Num = new Scanner(System.in);
        System.out.print("Enter the Numerator ");
         NUMERATOR =Num.nextInt();
        System.out.print("Enter the  Denominator ");
         DENOMITOR = Num.nextInt();
         REMAINDER = NUMERATOR % DENOMITOR;
        System.out.println("Remainder is :" + REMAINDER);
         QUOTIENT = NUMERATOR / DENOMITOR;
        System.out.println(" Quotient is :" + QUOTIENT);
    }
}
