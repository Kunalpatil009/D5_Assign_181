package com.bridgelabs.basics.java_basic_problems;
import java.util.Random;
import java.util.Scanner;

public class LargestNumberProgram {
    public static void main(String[] args) {

    int FIRST_NUM , SECOND_NUM , THIRD_NUM;

        Random Number = new Random();
        FIRST_NUM = Number.nextInt(100)+1;
        SECOND_NUM = Number.nextInt(100)+1;
        THIRD_NUM = Number.nextInt(100)+1;
        System.out.println(FIRST_NUM + " " + SECOND_NUM+ " " +THIRD_NUM);

        if (FIRST_NUM> SECOND_NUM && FIRST_NUM > THIRD_NUM) {
            System.out.print(String.valueOf(FIRST_NUM) + " " + " Is Largest Number Between 3 Random Number");
        }
        else if (SECOND_NUM > FIRST_NUM && SECOND_NUM > THIRD_NUM) {
            System.out.print(String.valueOf(SECOND_NUM) + " " + "Is Largest Number Between 3 Random Number");
        }
        else {
            System.out.print(String.valueOf(THIRD_NUM) + " " + "Is Largest Number Between 3 Random Number");
        }
    }
}
