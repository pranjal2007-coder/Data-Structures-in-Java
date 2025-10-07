package com.Pranjal.Day47;

import java.util.Scanner;

    public class SelectionSort {
        public static void sort(int[] a) {

            int n, i, j, min, index;
            n=a.length;

            for (i = 0; i < n - 1; i++) {
                min = a[i];
                index = i;

                for (j = i + 1; j < n; j++) {
                    if (min > a[j]) {
                        min = a[j];
                        index = j;
                    }

                }
                swap(a, i, index);
            }
        }

        public static void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n;
            System.out.print("Enter the No of elements in array:");
            n = sc.nextInt();

            int[] arr = new int[n];
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("Before sorting: " + java.util.Arrays.toString(arr));
            sort(arr);  // call our new method
            System.out.println("After sorting:  " + java.util.Arrays.toString(arr));
        }
    }

