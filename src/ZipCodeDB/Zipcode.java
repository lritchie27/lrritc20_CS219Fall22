package ZipCodeDB;

/*
 *  Hold data about one zipcode
 */

public class Zipcode {
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
}
