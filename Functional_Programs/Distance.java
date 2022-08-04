package com.bridgelabs.basics.Functional_Programs;


import java.util.Scanner;

public class Distance {
        public static void main(String[] args) {


            System.out.println("Enter the Co-ordinates");
            Scanner Dist = new Scanner(System.in);
//            int x = Dist.nextInt();
//            int y = Dist.nextInt();
            int x =Integer.parseInt(args[5]);
            int y =Integer.parseInt(args[8]);
            double dist = Math.sqrt(x*x + y*y);

            System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
        }
    }


