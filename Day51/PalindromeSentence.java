package com.Pranjal.Day51;
    public class PalindromeSentence {


                public static boolean isPalindrome(String sentence) {
                    String clean = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();


                    String reversed = new StringBuilder(clean).reverse().toString();

                    return clean.equals(reversed);
                }

                public static void main(String[] args) {
                    String text = "A man, a plan, a canal: Panama";
                    System.out.println("Sentence: " + text);
                    System.out.println("Is Palindrome? " + isPalindrome(text));
                }
            }




