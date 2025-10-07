package com.Pranjal.Day50;
import java.util.Scanner;

public class ReverseString {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String s = sc.nextLine();

            StringBuilder sb = new StringBuilder(s);
            sb.reverse();

            System.out.println("Reversed String: " + sb);
        }
    }

