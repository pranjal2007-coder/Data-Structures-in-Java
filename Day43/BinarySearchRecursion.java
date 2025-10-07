package com.Pranjal.Day44;

import java.util.Scanner;

public class BinarySearchRecursion {
    static int BinarySearch(int[] arr, int begin, int end, int target) {
        if (begin > end)
            return -1;

        int mid = (begin + end) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return BinarySearch(arr, begin, mid - 1, target);
        else
            return BinarySearch(arr, mid + 1, end, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of array elements: ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println("Array elements: ");
        for (int i = 0; i < num; i++)
            arr[i] = sc.nextInt();

        System.out.println("Item u want to search: ");
        int target = sc.nextInt();

        int result = BinarySearchRecursion.BinarySearch(arr, 0, num - 1, target);

        if (result != -1)
            System.out.print("found at " + result);
        else
            System.out.print("not found");
    }
}
