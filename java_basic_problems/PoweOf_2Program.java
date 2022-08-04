package com.bridgelabs.basics.java_basic_problems;
import java.util.Scanner;

public class PoweOf_2Program {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter The number");
        for (int a = num.nextInt(); a <= 31; ++a) {
            for (int i = 1; i <= a; ++i) {
                System.out.println("Power Of 2 is " + i + "=" + 2 * i);
            }
        }
    }
}