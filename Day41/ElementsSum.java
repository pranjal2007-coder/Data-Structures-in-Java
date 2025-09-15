package com.Pranjal.Day41;
import java.util.Scanner;

public class ElementsSum {
    public static void main(String[] args)

    {
        int n, i;
        System.out.println("Enter the No of array items:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        int sum=0;

        System.out.println("Enter elements:");
        for (i = 0; i < n; i++)
            arr[i]=sc.nextInt();

        for (i = 0; i < n; i++)
            sum=sum+arr[i];


        System.out.println("Sum= "+sum);


    }
}
