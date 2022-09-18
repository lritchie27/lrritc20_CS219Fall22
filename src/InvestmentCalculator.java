import HW4.Investment;

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main(String [] args) {

        // prompt the user for c, r, t, and n
        // and call the function with the inputted values

        // set up scanner
        Scanner s = new Scanner(System.in);

        // ask user for c
        System.out.print("Enter an initial investment amount: ");
        double c = s.nextDouble();

        // ask user for r
        System.out.print("Enter in an interest rate in decimal form: ");
        double r = s.nextDouble();

        // ask user for t
        System.out.print("Enter in the number of years to compound: ");
        int t = s.nextInt();

        // ask user for n
        System.out.print("Enter the number of times to be compounded in a year: ");
        int n = s.nextInt();

        // print out the amount
        System.out.printf("Your investment would be worth $%.2f 💰", Investment.investment(c, r, t, n));

    }

}
