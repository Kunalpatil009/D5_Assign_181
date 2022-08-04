package com.bridgelabs.basics.java_basic_problems;
import java.util.Scanner;



public class FlipCoinProgram {
    public static void main(String[] args) {
        Scanner coin = new Scanner(System.in);
        int HEAD = 0;
        int TAIL = 0;
        System.out.println("Enter The No Of Coin Filps");
        double NO_OF_FLIPS = coin.nextInt();
            for (int i = 0; i <= NO_OF_FLIPS; ++i) {
                double RANDOM = Math.random();
                    if (RANDOM < 0.5) {
                        ++HEAD;
                    }
                    else {
                        ++TAIL;
                    }
                }
                System.out.println("Head_Count :" +HEAD);
                System.out.println("Tail_Count :" +TAIL);

                double H_PERCENTAGE = HEAD / NO_OF_FLIPS;
                double HEAD_COUNT = H_PERCENTAGE * 100.0;
                System.out.println(" Head Probability is :" + HEAD_COUNT);

                double T_PERCENTAGE = HEAD / NO_OF_FLIPS;
                double TAIL_COUNT = T_PERCENTAGE * 100.0;
                System.out.println("Tails Probability is: " + TAIL_COUNT);
    }
}