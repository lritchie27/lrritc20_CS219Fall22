package Utility;

import java.util.Scanner;

public class Weather {

    /*
     Create a function that takes two parameters, temperature (t) and wind velocity (v)
     in MPH, and returns the adjusted temperature for windchill
     */
    public static double windchill(double t, double v) {
        return 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
    }

    public static void main(String [] args) {

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        // Get temperature from user
        System.out.print("Enter temperature in degrees F: ");
        double temperature;

        if (kbd.hasNextDouble()) {
            temperature = kbd.nextDouble();
        }
        else {
            System.out.printf("Error: Please enter a decimal number. You entered \"%s\"",
                               kbd.next());
            return; // exit main
        }

        // Get wind velocity from user
        System.out.print("Enter wind velocity in MPH: ");
        double velocity;

        if (kbd.hasNextDouble()) {
            velocity = kbd.nextDouble();
        }
        else {
            System.out.printf("Error: Please enter a decimal number. You entered \"%s\"",
                    kbd.next());
            return; // exit main
        }

        // Call the windchill function
        System.out.printf("The windchill for %.1f degrees F with a wind velocity of %.1f MPH is %.2f degrees F.\n",
                temperature, velocity, windchill(temperature, velocity));

        // Example of escape sequences using \
        System.out.println("They said \"Don't do it\"");

    }

}
