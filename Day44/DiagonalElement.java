package com.Pranjal.Day44;

import java.util.Scanner;
import java.util.Arrays;

public class DiagonalElement {
    public static void main(String[] args )
    {
        Scanner sc=new Scanner(System.in);

        int row,col,i,j;
        System.out.println("Enter the number of rows: ");
        row=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        col=sc.nextInt();

        System.out.println("Enter the elements: ");
        int[][] mat=new int[row][col];

        for(i=0; i< row; i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }


        int product = 1;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i == j) {
                    product *= mat[i][j];
                }
            }
        }


        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i == j) {
                    mat[i][j] = product;
                }
            }
        }


        System.out.println("Modified Matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}





