package Pranjal.day37;

public class JavaOperators {

        public static void main(String[] args) {
            int a = 10, b = 3;

            a += 5;
            b *= 2;
            System.out.println("Changed value of a = " + a + ", Changed value of b = " + b);

            System.out.println("a > b? " + (a > b));
            System.out.println("a < b? " + (a < b));
            System.out.println("a == b? " + (a == b));
            System.out.println("a != b? " + (a != b));

            System.out.println("(a > 5 && b > 5) = " + (a > 5 && b > 5));
            System.out.println("(a > 5 || b > 5) = " + (a > 5 || b > 5));
            System.out.println("!(a > b) = " + !(a > b));

            System.out.println("a & b = " + (a & b));
            System.out.println("a | b = " + (a | b));
            System.out.println("a ^ b = " + (a ^ b));
            System.out.println("a << 1 = " + (a << 1));
            System.out.println("a >> 1 = " + (a >> 1));

         }

}
