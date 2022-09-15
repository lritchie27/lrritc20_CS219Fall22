package Utility;

import java.util.Scanner;

public class Weather {

    /*
     Create a function that takes two parameters, temperature (t) and wind velocity (v)
     in MPH, and returns the adjusted temperature for windchill
     */
    public static double windchill(double t, double v) {
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }

    public static double getVelocity(Scanner s) {
        boolean valid = false;
        double velocity = 0;
        while (!valid) {
            System.out.print("Enter wind velocity in MPH: ");

            // check to see if user entered a double
            if (s.hasNextDouble()) {
                velocity = s.nextDouble();

                // check if double is negative
                if (velocity < 0) {
                    System.out.printf("Error: Velocity can not be negative. You entered %.2f. \n",
                            velocity);
                } else {
                    // double was positive. Exit loop
                    valid = true;
                }
            } else {
                // user entered something other than a number
                System.out.printf("Error: Please enter a decimal number. You entered \"%s\". \n",
                        s.next());
            }
        }
        return velocity;
    }


    public static double getTemperature(Scanner s) {
        boolean valid = false;
        double temperature = 0;
        while (!valid) {
            System.out.print("Enter temperature in degrees F: ");

            // check to see if user entered a number
            if (s.hasNextDouble()) {
                temperature = s.nextDouble();

                // switch valid to exit loop
                valid = true;
            }
            else {
                // user did not enter a number
                System.out.printf("Error: Please enter a number. You entered \"%s\". \n",
                        s.next());
            }
        }
        return temperature;
    }
    public static void main (String[]args) {

                // Used for getting input from the keyboard
                Scanner kbd = new Scanner(System.in);

                // Get temperature from user
                double temperature = getTemperature(kbd);

                // Get wind velocity from user
                double velocity = getVelocity(kbd);


                // Call the windchill function
                System.out.printf("The windchill for %.1f degrees F with a wind velocity of %.1f MPH is %.2f degrees F.\n",
                        temperature, velocity, windchill(temperature, velocity));

                // Example of escape sequences using \
                System.out.println("They said \"Don't do it\"");

    }
}
