public class Weather {

    /*
     Create a function that takes two parameters, temperature (t) and wind velocity (v)
     in MPH, and returns the adjusted temperature for windchill
     */
    public static double windchill(double t, double v) {
        return 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
    }

    public static void main(String [] args) {
        // Call the windchill function
        System.out.println(windchill(32, 10));
    }

}
