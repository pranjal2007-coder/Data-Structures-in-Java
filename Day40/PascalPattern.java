package com.Pranjal.Day40;

public class PascalPattern {
    public static void main(String[] args) {
            int rows = 5;
            for (int i = 0; i < rows; i++)
            {
                int num = 1;

                for (int j = 0; j < rows - i; j++)
                {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++)
                {
                    System.out.print(num + " ");
                    num = num * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    }
