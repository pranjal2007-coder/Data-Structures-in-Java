package com.Pranjal.Day41;
import java.util.Arrays;

public class InsertingElement {
    public static void main(String[] args) {

        int[] arr = new int[6];

        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 6;
        arr[4] = 7;
        

        int l = arr.length;
        int posi = 2;
        int item = 3;

        for (int i = l - 1; i > posi; i--) {
            arr[i] = arr[i - 1];
        }

        arr[posi] = item;

        System.out.println(Arrays.toString(arr));
    }
}
