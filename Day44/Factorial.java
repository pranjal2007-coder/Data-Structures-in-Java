package com.Pranjal.Day44;
import java.util.Scanner;

public class Factorial {
    static  int fact(int num){


        if(num<2)
            return 1;

    return num * fact(num-1);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
     int num,result;
     num=sc.nextInt();
     result=Factorial.fact(num);
     System.out.print("Factorial is: "+result);
    }
}
