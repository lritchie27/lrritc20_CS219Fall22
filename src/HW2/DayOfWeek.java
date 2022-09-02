package HW2;


import java.util.Scanner;

public class DayOfWeek {

    /*
    Create a function that takes three parameters -- month, day, and year -- and returns
    the integer that represents the day of the week that the date fell on.
    0 = Sunday
    6 = Saturday
     */
    public static int dayofweek(int m, int d, int y) {
        int y_o = y - (14 - m) / 12;
        int x = y_o + y_o / 4 - y_o / 100 + y_o / 400;
        int m_o = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + 31 * m_o / 12) % 7;
    }

    public static void main(String [] args) {

        // Get input from keyboard
        Scanner kbd = new Scanner(System.in);

        // Ask user for a month
        System.out.print("Enter the number associated with a month (Ex: January = 1): ");
        int month = kbd.nextInt();

        // Ask user for a date
        System.out.print("Enter a number date (1-31): ");
        int day = kbd.nextInt();

        // Ask user for a year
        System.out.print("Enter a 4-digit year (Ex: 2022): ");
        int year = kbd.nextInt();

        // Call dayofweek function to print the day
        System.out.println(dayofweek(month, day, year));


    }

}
