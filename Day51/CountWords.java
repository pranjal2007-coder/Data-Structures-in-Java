package com.Pranjal.Day51;
import java.util.StringTokenizer;

public class CountWords {

        public static void main(String[] args) {
            String sentence = "Java is fun to learn!";

            StringTokenizer st = new StringTokenizer(sentence);
            int count = st.countTokens();

            System.out.println("Sentence: " + sentence);
            System.out.println("Number of words: " + count);
        }
    }


