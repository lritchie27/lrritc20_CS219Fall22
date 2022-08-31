public class Time {

    public static void main(String [] args) {

        // Create variables for hour, minutes, and seconds
        int hour = 21;
        int minute = 14;
        int second = 27;

        // Print the time
        System.out.println("The time is " + hour + ":" + minute + "." + second);

        /*
         Create time variable in seconds.
         This will be the variable that displays the amount of time
         in seconds that has passed since midnight.
         */
        double time_in_seconds = (hour * 60 * 60) + (minute * 60) + second;

        // Print new line with the amount of time in seconds since midnight
        System.out.print("The amount of seconds that have passed since midnight is ");
        System.out.println((int) time_in_seconds + ".");

        // Create variable for number of seconds in a day
        final double SECONDS_IN_A_DAY = 60 * 60 * 24;

        // Display the number of seconds remaining in the day
        System.out.print("The number of seconds remaining in the day is ");
        System.out.println((int) (SECONDS_IN_A_DAY - time_in_seconds) + ".");

        /*
         Display the percentage of the day that has passed.
         Use printf and %.2f to round the percentage to 2 decimal places.
         */
        double percentage = time_in_seconds / SECONDS_IN_A_DAY * 100;
        System.out.printf("The percentage of the day that has passed is %.2f", percentage);
        System.out.println("%.");

        // Change the time to current time
        hour = 21;
        minute = 30;
        second = 30;

        // Create time variable in seconds for new time
        double new_time = (hour * 60 * 60) + (minute * 60) + second;

        /*
         Take new_time and subtract time_in_seconds from it.
         This gives the elapsed time since working on this exercise
         in seconds. Convert seconds into minutes using division and
         modulo.
         */
        int minutes = (int) (new_time - time_in_seconds) / 60;
        double seconds = (new_time - time_in_seconds) % 60;
        System.out.print("The amount of time, in seconds, that has elapsed since working on this exercise is ");
        System.out.println((int) (new_time - time_in_seconds) + ".");
        System.out.println("This is equivalent to " + minutes + " minutes and " + (int) seconds + " seconds.");

}

}
