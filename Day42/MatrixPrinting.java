package com.Pranjal.Day42;
import java.util.Scanner;

public class MatrixPrinting {
    public static void main(String[] args )
    {
      Scanner sc=new Scanner(System.in);

      int row,col,i,j;
      System.out.println("Enter the number of rows: ");
      row=sc.nextInt();
      System.out.println("Enter the number of columns: ");
      col=sc.nextInt();

      int[][] mat=new int[row][col];

      for(i=0; i< row; i++)
      {
          for(j=0;j<col;j++)
          {
              mat[i][j]=sc.nextInt();
          }
      }

      for(i=0; i< row; i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(mat[i][j]);
            }
      System.out.println();
        }


    }
}
