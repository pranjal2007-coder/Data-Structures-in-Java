package com.Pranjal.Day51;

public class LowercaseReverse {

        public static void main(String[] args) {
            String str = "HELLO WORLD";

            String lower = str.toLowerCase();
            StringBuilder sb = new StringBuilder(lower);
            sb.reverse();

            System.out.println("Lowercase: " + lower);
            System.out.println("Reversed: " + sb);
        }
    }


