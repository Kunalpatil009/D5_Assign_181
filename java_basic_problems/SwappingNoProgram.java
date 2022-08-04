package com.bridgelabs.basics.java_basic_problems;

import java.util.Scanner;

public class SwappingNoProgram {
    public static void main(String[] args) {

        int NUM = 0, A ,B;
        Scanner swap = new Scanner(System.in);
        System.out.println("Enter First Number:");
         A = swap.nextInt();
        System.out.println("Enter Second Number");
         B = swap.nextInt();
        System.out.println("Original Number is :" +"A = "+ A +  " & B = " + B);
        NUM = A;
        A = B;
        B = NUM;
        System.out.println("Number After Swaping :" +"A = "+ A + " & B = " + B);
    }
    }

