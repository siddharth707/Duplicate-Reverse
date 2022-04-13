package com.company;

public class Reverse {

    public static void main(String arg[]) {

        int n = 9;
        int i, j, k = 2 * n - 2;

        for (i = 0; i < n; i++) {
            for (j = 0; j < k; j++) {

                System.out.print(" ");
            }
            k = k - 2;

            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
