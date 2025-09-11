package Pranjal.day38;

public class ConditionalStatement {

        public static void main(String[] args) {

            int marks =95;

            if (marks >= 90) {
                System.out.println("Excellent");
            }
            else if (marks >= 75) {
                System.out.println("Good");
            }
            else if (marks >= 50) {
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }


            switch (marks / 10) {
                case 10:
                case 9:
                    System.out.println("Excellent");
                    break;
                case 8:
                case 7:
                    System.out.println("Good");
                    break;
                case 6:
                case 5:
                    System.out.println("Pass");
                    break;
                default:
                    System.out.println("Fail");
                    break;
            }


        }
    }

