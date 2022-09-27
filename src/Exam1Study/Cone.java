package Exam1Study;

import java.util.Scanner;

public class Cone {

    public static double volume(double r, double h) {
        return (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
    }

    public static double getRadius(Scanner s) {
        boolean valid = false;
        double r = 0;
        while (!valid) {
            System.out.print("Enter in the radius (in meters): ");

            // check to see if user entered a double
            if (s.hasNextDouble()) {
                r = s.nextDouble();

                if (r > 0) {
                    valid = true;
                }
                else {
                    System.out.print("Error: Please enter a value greater than 0." +
                            " You entered " + r + ". \n");
                }
            }
            else {
                System.out.printf("Error: Please enter a value greater than 0. " +
                        "You entered \"%s\". \n", s.next());
            }
        }
        return r;
    }

    public static double getHeight(Scanner s) {
        boolean valid = false;
        double h = 0;
        while (!valid) {
            System.out.print("Enter in the height (in meters): ");

            // check to see if user entered a double
            if (s.hasNextDouble()) {
                h = s.nextDouble();

                if (h > 0) {
                    valid = true;
                }
                else {
                    System.out.print("Error: Please enter a value greater than 0." +
                            " You entered " + h + ". \n");
                }
            }
            else {
                System.out.printf("Error: Please enter a value greater than 0. " +
                        "You entered \"%s\". \n", s.next());
            }
        }
        return h;
    }

    public static void main(String [] args) {

        Scanner kbd = new Scanner(System.in);

        // get radius
        double r = getRadius(kbd);

        // get height
        double h = getHeight(kbd);

        // print the volume of the cone
        System.out.printf("The volume of the cone is %.2f cubic meters.", volume(r, h));
    }

}
