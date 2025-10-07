package com.Pranjal.Day49;

public class StringToChar {
    public class Easy2 {
        public static void main(String[] args) {
            String str = "Pranjal";
            char[] arr = str.toCharArray();

            arr[0] = 'B';

            System.out.println("Modified array as characters:");
            System.out.println(arr);

            System.out.println("Original string:");
            System.out.println(str);
        }
    }

}
