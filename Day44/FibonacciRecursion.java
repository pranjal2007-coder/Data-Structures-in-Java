package com.Pranjal.Day44;

import java.util.Scanner;

public class FibonacciRecursion {
    static int fib(int num)
    {
        if (num==0)
            return 0;
        if (num==1)
            return 1;
    return fib(num-1)+fib(num-2);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int num,result;
        num=sc.nextInt();
        result=FibonacciRecursion .fib(num);
        System.out.print("Series of FIbonacci "+result);
    }
}
