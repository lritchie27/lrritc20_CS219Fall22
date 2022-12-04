package ZipCodeDB;

/*
 *  Hold data about one zipcode
 */

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Zipcode implements Comparable<Zipcode>, Distance {

    private String code;
    private String state;  // two character code abbreviation
    private String city;
    private double lng;    // longitude value
    private double lat;    // latitude value
    private int pop;       // population


    public Zipcode(String code, String state, String city, double lng, double lat, int pop) {
        this.code = code;
        this.state = state;
        this.city = city;
        this.lng = lng;
        this.lat = lat;
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "Zipcode{" +
                "code='" + code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                ", pop=" + pop +
                '}';
    }

    public String getCode() {
        return code;
    }


    // The natural ordering for zipcode
    @Override
    public int compareTo(Zipcode zc) {
        return this.code.compareTo(zc.code);
    }

    @Override
    public double distance(Zipcode zip) {
        return 0;  // fancy great circle distance
    }

    public WeatherObservation getWeatherData() {
        // http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=44&lng=-74&username=edharcourt

        // connect to the web page of weather data
        URL url = null;    // null is the nothing value
        Scanner s = null;

        String path = "http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=" + this.lat + "&lng="
                            + this.lng +"&username=edharcourt\n";

        try {
            url = new URL("http://10.60.15.25/~ehar/cs219/zips.txt");  // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double humidity = 0, temp = 0, speed = 0;
        String clouds = "";

        while (s.hasNextLine()) {
            String line = s.nextLine();
            if (line.indexOf("humidity") >0 ) {
                humidity = Double.parseDouble(
                        line.substring(line.indexOf(':')+1,
                                line.indexOf(',')));
            }

        }

        WeatherObservation ob = new WeatherObservation(humidity, speed, temp, clouds);

        return ob;

    }

}
