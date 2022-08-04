package com.bridgelabs.basics.Functional_Programs;
import java.util.Scanner;


//a. Desc
// -> A library for reading in 2D arrays of integers, doubles, or booleans from
//        standard input and printing them out to standard output.
//    b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
//    c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
//    d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
//        OutputStreamWriter to print the output to the screen.
public class ArrayProblem1 {
    public static void main(String[] args) {
     Scanner arr = new Scanner(System.in);
        System.out.println("Enter The Values for both Array :");
        int [][] Array = new int[arr.nextInt()][arr.nextInt()];                          // [M] = 5Rows & [N] // = 4Columns


       for (int i=1; i< Array.length; i++){
            for ( int j = 1; j < Array[i].length; j++)
            {
                System.out.print("(Column" + j +" Row" + i +")"); // this line code for printing indices of both arrays
                System.out.print(" ");
//                System.out.print(Array[i][j]);
//                System.out.print(" ");
            }
            System.out.println(" ");
       }

    }
    }
