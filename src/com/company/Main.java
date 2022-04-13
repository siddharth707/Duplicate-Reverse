package com.company;

public class Main {

    public static void main(String[] args) {
        {

            int[] arr = {2, 6, 15, 1, 24, 14, 8};

            int n = 7;

            for (int i = 1; i <= (n-1); i++) {

                for (int j = 0; j < (n - 1); j++) {
                    int k = j + 1;
                    int a = arr[j];
                    int b = arr[k];

                    if (b < a)
                    {
                        int temp1 = a;
                        int temp2 = b;
                        arr[j] = b;
                        arr[k] = a;
                    }
                }
            }
            for (int d = 0; d < n; d++)
                System.out.print(arr[d] + " ");

        }

    }}



