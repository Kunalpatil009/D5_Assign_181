package com.bridgelabs.basics.java_basic_problems;

import java.util.Scanner;

public class EvenOddNoProgram {
    public static void main(String[] args) {

        Scanner Num = new Scanner(System.in);
        System.out.println("Please Enter The Number:");
        int NUMBER = Num.nextInt();
        if (NUMBER % 2 == 0) {
            System.out.println(NUMBER + " is Even Number.");
        }
        else {
            System.out.println(NUMBER + " is Odd Number.");
        }
    }
}