package com.Pranjal.Day48;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nBefore Sorting:");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter Sorting (Ascending Order):");
        printArray(numbers);
    }

    private static void quicksort(int[] array, int li, int hi) {
        if (li >= hi) return;

        int pivot = array[hi]; // choose last element as pivot
        int leftPointer = partition(array, li, hi, pivot);

        quicksort(array, li, leftPointer - 1);
        quicksort(array, leftPointer + 1, hi);
    }

    // Partition logic for ascending order
    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int lp = lowIndex;
        int rp = highIndex - 1;

        while (lp < rp) {
            // Move left pointer while elements are smaller than pivot
            while (array[lp] <= pivot && lp < rp) {
                lp++;
            }

            // Move right pointer while elements are greater than pivot
            while (array[rp] >= pivot && lp < rp) {
                rp--;
            }

            swap(array, lp, rp);
        }

        // Swap pivot into correct position
        if (array[lp] > array[highIndex]) {
            swap(array, lp, highIndex);
        } else {
            lp = highIndex;
        }

        return lp;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

