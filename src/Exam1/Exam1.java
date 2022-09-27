/*
 * Logan Ritchie
 * Exam 1
 * 9/27/2022
 */

package Exam1;

import java.util.Scanner;

public class Exam1 {

    /*
     * Create a function that validates the user's
     * input for a positive integer and returns
     * that integer
     */
    public static int getInteger(Scanner s) {
        boolean valid = false;
        int n = 0;
        while (!valid) {
            // ask user for integer
            System.out.print("Enter in an integer: ");

            if (s.hasNextInt()) {
                // user entered an integer
                n = s.nextInt();
                if (n > 0) {
                    // user entered a positive integer
                    valid = true;
                }
                else {
                    System.out.print("Error: Please enter an integer greater than 0." +
                            " You entered " + n + ". \n");
                }
            }
            else {
                // user did not enter an integer
                System.out.printf("Error: Please enter an integer greater than 0. " +
                        "You entered \"%s\". \n", s.next());
            }
        }

        return n;
    }

    /*
     * Write a function that takes an integer
     * and then counts the number of digits in that integer
     * that are between 2 and 7 exclusive
     * Ex: 9682345 should return 4
     */
    public static int numBetween2And7(int n) {
        int cnt = 0;
        int i = 0;
        while (n > 0) {
            // get the last digit
            i = n % 10;

            // check if digit is between 2 and 7
            if (2 < i && i < 7) {
                // increase count
                cnt++;
            }
            // take that last digit off the integer
            n = n / 10;
        }
        return cnt;
    }

    public static void main(String [] args) {

        // initialize Scanner
        Scanner kbd = new Scanner(System.in);

        // get an integer number from the user
        int n = getInteger(kbd);

        // print the number of digits between 2 and 7 exclusive
        System.out.println(numBetween2And7(n));

    }

}
