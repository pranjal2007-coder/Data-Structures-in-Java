package com.Pranjal.Day41;

import java.util.Scanner;

public class RemoveOccurences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of array items:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.println("Enter the digit you want to remove:");
        int item = sc.nextInt();

        int newLength = 0; 

        
        for (int i = 0; i < n; i++) {
            if (arr[i] != item) {
                arr[newLength] = arr[i];
                newLength++;
            }
        }

       
        System.out.println("Array after removing all occurrences: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
