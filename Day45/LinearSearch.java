package com.Pranjal.Day45;

import java.util.Scanner;

public class LinearSearch {
        public static void main(String[] args) {
            int n;
            System.out.println("Enter the No of array items:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            int[] x = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                x[i] = sc.nextInt();

            System.out.println("Enter the item you want to search:");
            int item = sc.nextInt();


            for (int i = 0; i < n; i++) {
                if (x[i] == item) {
                    System.out.println("Item found at index " + i);
                    break;
                }

            }


        }
    }


