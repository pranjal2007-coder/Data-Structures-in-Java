package com.Pranjal.Day51;

public class LongestWord {

        public static void main(String[] args) {
            String paragraph = "Java is a programming language.";

            String[] words = paragraph.split(" ");

            String longest = "";
            for (String word : words) {

                word = word.replaceAll("[^a-zA-Z]", "");
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }

            System.out.println("Paragraph: " + paragraph);
            System.out.println("Longest word: " + longest);
        }
    }


