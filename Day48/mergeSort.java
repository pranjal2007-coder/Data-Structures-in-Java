package com.Pranjal.Day48;

import java.util.Scanner;

public class mergeSort {

    // recursive mergesort function
    public static void mergeSort(int[] a) {
        int n = a.length;

        // base case: agar array me sirf ek element ya empty hai toh return
        if (n < 2) {
            return;
        }

        int mid = n / 2;

        // left aur right arrays
        int[] lf = new int[mid];
        int[] rf = new int[n - mid];

        // left array copy
        for (int i = 0; i < mid; i++) {
            lf[i] = a[i];
        }
        // right array copy
        for (int i = mid; i < n; i++) {
            rf[i - mid] = a[i];
        }

        // recursive call
        mergeSort(lf);
        mergeSort(rf);

        // merge dono parts
        merge(a, lf, rf);
    }

    // merge two sorted arrays into one
    private static void merge(int[] a, int[] lf, int[] rf) {
        int ls = lf.length;
        int rs = rf.length;

        int i = 0, j = 0, k = 0;

        while (i < ls && j < rs) {
            if (lf[i] <= rf[j]) {
                a[k] = lf[i];
                i++;
            } else {
                a[k] = rf[j];
                j++;
            }
            k++;
        }

        // agar left me element bache hain
        while (i < ls) {
            a[k] = lf[i];
            i++;
            k++;
        }

        // agar right me element bache hain
        while (j < rs) {
            a[k] = rf[j];
            j++;
            k++;
        }
    }

    // utility function to print array
    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Before:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
    }
}
