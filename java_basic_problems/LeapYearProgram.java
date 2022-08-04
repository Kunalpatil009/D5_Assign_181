package com.bridgelabs.basics.java_basic_problems;
import java.util.Scanner;

public class LeapYearProgram {
    public static void main(String[] args) {

        Scanner year = new Scanner(System.in);
        System.out.println("Enter the Year");
        int YEAR = year.nextInt();

//        if( YEAR< 999 && YEAR >9999) {
//            System.out.println("Not A Valid Year, Please Enter The Valid Input");
//            YEAR = year.nextInt();
//        }
        if (((YEAR % 4 == 0) && (YEAR % 100 != 0)) || (YEAR % 400 == 0)) {
                System.out.println(YEAR + " Year is leap year");
            } else {
                System.out.println(YEAR + " Year is not a leap year");
            }

    }
}
