public class TwoArguments {

        public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Give me 2 numbers, please.");
                return;
            }

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;

            System.out.println("First number: " + num1);
            System.out.println("Second number: " + num2);
            System.out.println("Sum: " + sum);
        }
    }

