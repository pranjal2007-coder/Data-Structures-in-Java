package com.Pranjal.Day47;

public class CountInsertionSort {
    static int insertionSort(int[] arr) {
        int comparisons = 0;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++; // counting comparison
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }
        return comparisons;
    }

    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4, 5};
        int[] r = {5, 4, 3, 2, 1};

        int sortedcom = insertionSort(s.clone());
        int reversedCom = insertionSort(r.clone());

        System.out.println("s array: " + sortedcom);
        System.out.println("r array: " + reversedCom);
    }
}
