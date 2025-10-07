package com.Pranjal.Day45;

import java.util.Scanner;

public class BinarySearch {
        public static void main(String[] args) {
            int mid, end, begin, n, num, i;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements of array: ");
            n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter array elements4:");
            for (i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            for (i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }


            System.out.print("Enter the element you want to search: ");
            num = sc.nextInt();


            begin = 0;
            end = n - 1;

            while (begin <= end) {
                mid = (begin + end) / 2;

                if (arr[mid] == num) {
                    System.out.println("Item found at index " + mid);
                    break;
                }
                else if (arr[mid] < num)
                    begin = mid + 1;

                else if (arr[mid] > num)
                    end = mid - 1;


            }
            if(begin>end)
                System.out.println("Item not Found");


        }
    }

