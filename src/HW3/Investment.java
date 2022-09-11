package HW3;

import java.util.Scanner;

public class Investment {

    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r/n, t * n);
    }

    public static void main(String [] args) {

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        // Ask user for initial investment
        System.out.print("Enter in an initial investment amount: ");
        double c;

        // validate initial investment
        if (kbd.hasNextDouble()) {
            c = kbd.nextDouble();

            // check to see if initial deposit is greater than 0
            if (c < 0) {
                System.out.print("Error: Please enter a number greater than 0. " +
                        "You entered " + c);
                return; // exit main
            }
        }
        // a string was entered
        else {
            System.out.printf("Error: Please enter a number. You entered \"%s\"", kbd.next());
            return; // exit main
        }


        // Ask user for the interest rate
        System.out.print("Enter an interest rate: ");
        double r;

        // validate interest rate
        if (kbd.hasNextDouble()) {
            r = kbd.nextDouble();

            // check to see if a decimal number was entered between 0 and 1
            if (!(0 < r && r < 1)) {
                System.out.print("Error: Please enter a decimal number between 0 and 1. " +
                        "You entered " + r + ". Example: 8 percent = 0.08.");
                return; // exit main
            }
        }
        // a string was entered
        else {
            System.out.printf("Error: Please enter a decimal number between 0 and 1. " +
                    "You entered \"%s\". Example: 8 percent = 0.08", kbd.next());
            return; // exit main
        }

        // Ask user for time
        System.out.print("Enter in a time (in years) to compound: ");
        int t;

        // validate time
        if (kbd.hasNextInt()) {
            t = kbd.nextInt();

            // check to see if time is greater than 0
            if (t < 0) {
                System.out.print("Error: Please enter a number greater than 0. " +
                        "You entered " + t);
                return; // exit main
            }
        }
        // a string was entered
        else {
            System.out.printf("Error: Please enter a number. You entered \"%s\"", kbd.next());
            return; // exit main
        }

        // Ask user for amount of times to be compounded
        System.out.print("Enter in the amount of times the investment should be compounded: ");
        int n;

        // validate n
        if (kbd.hasNextInt()) {
            n = kbd.nextInt();

            // check to see if n is greater than 0
            if (n < 0) {
                System.out.print("Error: Please enter a number greater than 0. " +
                        "You entered " + n);
                return; // exit main
            }
        }
        // a string was entered
        else {
            System.out.printf("Error: Please enter a number. You entered \"%s\"", kbd.next());
            return; // exit main
        }

        // calculate their investment
        System.out.printf("Your initial investment is now worth $%.2f.", investment(c, r, t, n));

    }

}
