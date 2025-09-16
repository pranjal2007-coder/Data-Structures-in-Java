package com.Pranjal.Day42;

public class LargestElement2dArray {
    public static void main(String[] args)
    {
        int[][] arr={{2,3,4},{9,4,5}};

        int i,j,mx;

        for(i=0;i<arr.length;i++)
        {
            mx=arr[i][0];
            for (j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j]>mx)
                   mx=arr[i][j];
            }
            System.out.println(mx);
        }
    }
}
