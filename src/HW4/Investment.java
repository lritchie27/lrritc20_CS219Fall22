/*
Assignment 4
9/18/2022
Logan Ritchie
 */

package HW4;

import java.util.Scanner;

public class Investment {


    public static double getInitialInvestment(Scanner s) {
        boolean valid = false;
        double c = 0;
        while (!valid) {
            System.out.print("Enter an initial investment amount: ");

            // check to see if user entered a number
            if (s.hasNextDouble()) {
                c = s.nextDouble();

                if (c > 0) {
                    // switch valid to exit loop
                    valid = true;
                }
                else {
                    // user entered an invalid result
                    System.out.print("Error: You entered " + c + ". Please enter " +
                            "a positive number. \n");
                }
            }
            else {
                // user entered an invalid result
                System.out.printf("Error: Please enter a positive number." +
                        " You entered \"%s\". \n", s.next());
            }
        }
        return c;
    }


    public static double getInterestRate(Scanner s) {
        boolean valid = false;
        double r = 0;
        while (!valid) {
            System.out.print("Enter in an interest rate in decimal form: ");

            // check to see if the user entered a double
            if (s.hasNextDouble()) {
                r = s.nextDouble();

                // check conditions on r
                if (0 < r && r < 1) {
                    valid = true;
                }
                else {
                    System.out.print("Error: Please enter a decimal number between 0 and 1. " +
                            "You entered " + r + ". \n");
                }
            }
            else {
                System.out.printf("Error: Please enter a decimal number between 0 and 1. " +
                        "You entered \"%s\". \n", s.next());
            }
        }
        return r;
    }

    public static int getTime(Scanner s) {
        boolean valid = false;
        int t = 0;
        while (!valid) {
            System.out.print("Enter in a time (in years) to compound: ");

            // check to see if the user entered an integer
            if (s.hasNextInt()) {
                t = s.nextInt();

                // check conditions on t
                if (t > 0) {
                    valid = true;
                }
                else {
                    System.out.print("Error: Please enter an integer greater than 0." +
                            " You entered " + t + ". \n");
                }
            }
            else {
                System.out.printf("Error: Please enter an integer greater than 0. " +
                        "You entered \"%s\". \n", s.next());
            }
        }
        return t;
    }

    public static int getCompound(Scanner s) {
        boolean valid = false;
        int n = 0;
        while (!valid) {
            System.out.print("Enter the number of times to be compounded: ");

            // check to see if the user entered an integer
            if (s.hasNextInt()) {
                n = s.nextInt();

                // check conditions on n
                if (n > 0) {
                    valid = true;
                }
                else {
                    System.out.print("Error: Please enter an integer greater than 0." +
                            " You entered " + n + ". \n");
                }
            }
            else {
                System.out.printf("Error: Please enter an integer greater than 0. " +
                        "You entered \"%s\". \n", s.next());
            }
        }
        return n;
    }

    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r/n, t * n);
    }

    public static void main(String [] args) {

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        // Ask user for initial investment
        double c = getInitialInvestment(kbd);

        // Ask user for the interest rate
        double r = getInterestRate(kbd);

        // Ask user for time
        int t = getTime(kbd);

        // Ask user for amount of times to be compounded
        int n = getCompound(kbd);

        // calculate their investment
        System.out.printf("Your initial investment is now worth $%.2f.", investment(c, r, t, n));

    }

}
