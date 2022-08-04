package com.bridgelabs.basics.Functional_Programs;

        class Num {
            static void findTriplets(int[] Int, int n) {
                boolean B = false;
                for (int i = 0; i < n - 2; i++) {
                    for (int j = i + 1; j < n - 1; j++) {
                        for (int k = j + 1; k < n; k++) {
                            if (Int[i] + Int[j] + Int[k] == 0) {
                                System.out.println(Int[i] + " " + Int[j] + " " + Int[k]);
                                B = true;
                            }
                        }
                    }
                }

                if (B == false)
                    System.out.println(" not exist ");
            }
            public class SumOf3IntegerAddsZero {
                public static void main(String[] args) {

                    int Int[] = {0, -1, 2, -3, 1};
                    int n = Int.length;
                    findTriplets(Int, n);
                }
            }
}