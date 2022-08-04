package com.bridgelabs.basics.java_basic_problems;

import java.util.Scanner;

public class VowelConsonantProgram {
    public static void main(String[] args) {

        Scanner vc = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        char ch = vc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println((ch) + " is a Vowels");
        }
        else {
            System.out.println((ch) + " is a Consonants");
        }
    }
}
