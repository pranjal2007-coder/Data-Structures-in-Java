package com.Pranjal.Day51;
import java.util.StringTokenizer;

public class NewLine {
        public static void main(String[] args) {
            String fruits = "apple,banana,mango,kiwi";
            StringTokenizer st = new StringTokenizer(fruits, ",");

            System.out.println("Fruits:");
            while (st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }
        }
    }


