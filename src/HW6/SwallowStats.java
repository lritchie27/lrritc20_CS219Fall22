package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {

    public static void swallow_stats() {

        // connect to the web page of speeds
        URL url = null;    // null is the nothing value
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path);  // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // What is true at this point?
        // I was able to connect to the website

        // create a sum and counter variable
        double sum = 0.0;
        int cnt = 0;

        // loop variable
        boolean valid = false;

        // set max and min values
        double max = 0.0;
        double min = Double.POSITIVE_INFINITY; // this is so the min can be set on
                                               // the first line that is recorded

        // read each line of the web file
        while (!valid) {
            if (!s.hasNextLine()) {
                valid = true;
            }
            else {
                String line = s.nextLine(); // read a line of the website
                if (!line.contains("#") && line.length() > 0) { // modify condition
                    sum = sum + Double.parseDouble(line);
                    cnt++;

                    // check if the double on this line is a max
                    if (Double.parseDouble(line) > max) {
                        max = Double.parseDouble(line);
                    }

                    // check if the double on this line is a min
                    if (Double.parseDouble(line) < min) {
                        min = Double.parseDouble(line);
                    }
                }
            }

        }
        double avg = sum / cnt;
        System.out.printf("The average swallow speed recorded was %.2f m/s.\n", avg);
        System.out.printf("The minimum swallow speed recorded was %.2f m/s.\n", min);
        System.out.printf("The maximum swallow speed recorded was %.2f m/s.\n", max);

    }


    public static void  main(String [] args) {

        // call the method
        swallow_stats();

    }

}
