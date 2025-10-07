package com.Pranjal.Day46;

import java.util.Scanner;

public class SumArrayElements {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter the No of array items:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] x = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            x[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            sum+=x[i];

        System.out.println(sum);
    }
}
