package com.Pranjal.Day46;

import java.util.Scanner;

public class DiagonalElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col, i, j;
        System.out.println("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        col = sc.nextInt();

        int[][] mat = new int[row][col];

        System.out.println("Enter the Elements of Matrix: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
            if(i==j)
                sum+=mat[i][j];
            }
        }
        System.out.println(sum);
    }
}