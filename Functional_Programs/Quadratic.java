package com.bridgelabs.basics.Functional_Programs;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {


//        find the roots of the equation a*x*x + b*x + c.
//                Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
//        can be found using a formula (Note: Take a, b and c as input values)
//        delta = b*b - 4*a*c
//        Root 1 of x = (-b + sqrt(delta))/(2*a)
//        Root 2 of x = (-b - sqrt(delta))/(2*a)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input values");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int delta = b*b - 4*a*c;
        System.out.println(delta);
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("The Root of x1 is :" + x1);
        System.out.println("The Root of x2 is :" + x2);
    }
}
