package Exam1Study;

import java.util.Scanner;

public class Exam1StudyC2F {

    public static double c2f(double c) {
        return (9.0 / 5.0) * c + 32;
    }

    public static double getTemp(Scanner s) {
        boolean valid = false;
        double c = 0;
        while (!valid) {
            System.out.print("Enter in a temperature (degrees Celsius): ");

            if (s.hasNextDouble()) {
                c = s.nextDouble();
                valid = true;
            }
            else {
                System.out.printf("Please enter a number. You entered" +
                        " \"%s\". \n", s.next());
            }
        }
        return c;
    }

    public static void main(String [] args) {
        Scanner kbd = new Scanner(System.in);

        // ask user for a temperature in celsius
        double c = getTemp(kbd);

        // print out temperature conversion
        System.out.printf("The new temperature in degrees fahrenheit is %.2f.", c2f(c));
    }

}
