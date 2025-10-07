package com.Pranjal.Day43;
import java.util.Scanner;
import java.util.Arrays;

public class CircularCaching {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of array items: ");
            int n = sc.nextInt();
            sc.nextLine();

            String[] cache = new String[n];

            System.out.println("Enter " + n + " array elements:");
            for (int i = 0; i < n; i++) {
                cache[i] = sc.nextLine();
            }

            System.out.print("Enter how many Pages to insert: ");
            int m = sc.nextInt();

            int next = 0;
            for (int i = 0; i < m; i++) {
                cache[next] = "Page" + (i + 1);
                System.out.println("Inserted " + cache[next] + " at index " + next);

                next = (next + 1) % cache.length;  // circular index
            }

            System.out.println("Final Cache State:");
            for (int i = 0; i < cache.length; i++) {
                System.out.println("Index " + i + ": " + cache[i]);
            }
            sc.close();
        }
    }

