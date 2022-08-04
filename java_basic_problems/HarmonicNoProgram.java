package com.bridgelabs.basics.java_basic_problems;
import java.util.Scanner;

public class HarmonicNoProgram {
    public static void main(String[] args) {

        Scanner Num = new Scanner(System.in);
        System.out.println("Enter the Number");
        int NUMBER = Num.nextInt();
        double nthHarmonicNo = 0.0;
        if (NUMBER != 0) {
            for (int i = 1; i <= NUMBER; ++i) {
                System.out.print("1/" +  i +" " ) ;
                nthHarmonicNo += 1.0 / i;
            }
        }
        else {
            System.out.println("Invalid Input Enter the Non-Zero Input");
        }
        System.out.print("=" + nthHarmonicNo);
    }
}
