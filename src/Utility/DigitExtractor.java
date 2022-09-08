package Utility;

public class DigitExtractor {

    public static int last(int n) {
        if (n < 0) {
            n = -n;
        }
        return n % 10;
    }

    /*
    Can use an if statement to check for number being negative
    or can just use Math.abs(variable)
     */

    public static int secondToLast(int k) {
        k = Math.abs(k);
        return (k / 10) % 10;

    }

    public static void main(String [] args) {

        System.out.println(last(2753) == 3);
        System.out.println(last(-749) == 9);

        System.out.println(secondToLast(1234) == 3);
        System.out.println(secondToLast(-4321) == 2);

        System.out.println(23 % -5);
        System.out.println(-23 % 5);

    }

}
