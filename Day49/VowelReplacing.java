package com.Pranjal.Day49;

public class VowelReplacing {

        public static void main(String[] args) {
            String str = "Java was developed by James Gosling";
            String result = replaceVowels(str);

            System.out.println("Original String: " + str);
            System.out.println("Modified String: " + result);
        }

        static String replaceVowels(String s) {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if ("AEIOUaeiou".indexOf(ch) != -1)  // if vowel
                    result += '*';
                else
                    result += ch;
            }
            return result;
        }
    }


