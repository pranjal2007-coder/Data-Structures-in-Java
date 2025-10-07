package com.Pranjal.Day47;

public class CountSelectionSort {

        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};
            int swapCount = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap if needed
                if (minIndex != i) {
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                    swapCount++;
                }
            }

            System.out.println("Sorted Array:");
            for (int num : arr)
                System.out.print(num + " ");

            System.out.println("\nTotal swaps: " + swapCount);
        }
    }


