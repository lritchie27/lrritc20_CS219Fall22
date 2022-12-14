/*
    Logan Ritchie
    Final Exam
    12/13/2022
 */

package ZipCodeDB;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 *  Store data about all the zipcodes.
 */

public class Database implements LatLngInterface {

    private ArrayList<Zipcode> codes;

    public Database() {
        // allocate the array list
        this.codes = new ArrayList<>();
        this.load_zips();
    } // Database

    // fill the zipcode array list with real data
    private void load_zips() {
        // connect to the web page of zipcodes
        URL url = null;    // null is the nothing value
        Scanner s = null;

        try {
            url = new URL("http://10.60.15.25/~ehar/cs219/zips.txt");  // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // read zipcode file line by line
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String [] parts = line.split(",");
            Zipcode z = new Zipcode(parts[1].substring(1, parts[1].length() - 1), parts[2].substring(1, parts[2].length() - 1),
                    parts[3].substring(1, parts[3].length() - 1), Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5]), Integer.parseInt(parts[6]));

            codes.add(z);  // put z at the end of the array list
        }  // while loop

        // sort by the zipcode
        Collections.sort(this.codes);

    }  // load_sips


    // write a function to search for zipcode data by a zipcode
    // Return the reference to the object if found, null if not found
    public Zipcode findByZip(String code) {
        for (Zipcode zipcode : this.codes) {
            if (code.equals(zipcode.getCode())) {
                return zipcode;
            }
        }
        return null;  // zipcode not found in the database
    } // findByZip

    public Zipcode findByZip1(String code) {
        for (int i = 0; i < this.codes.size(); i++) {
            if (code.equals(this.codes.get(i).getCode())) {
                return this.codes.get(i);
            }
        }
        return null;  // zipcode not found in the database
    } // findByZip1

    /*
        Return the zipcode info of the northernmost latitude
     */
    public Zipcode getNorthern() {
        Zipcode maxLat = new Zipcode("", "", "", 0.0, Double.MIN_VALUE, 0);
        for(int i = 0; i < this.codes.size(); i++) {
            if (this.codes.get(i).getLat() > maxLat.getLat()) {
                maxLat = this.codes.get(i);
            }
        }
        return maxLat;
    }

    private Zipcode bsearch(String target, int low, int high) {
        // check to see if word has been found
        if (low > high) {
            return null;
        }

        int mid = (low + high) / 2;

        if (this.codes.get(mid).getCode().equals(target)) {
            return this.codes.get(mid);
        }
        // target is greater than mid
        else if (this.codes.get(mid).getCode().compareTo(target) < 0) {
            return bsearch(target, mid + 1, high);
        }
        // target is less than mid
        else {
            return bsearch(target, low, mid - 1);
        }
    }  // bsearch


    // Provides a simpler interface to the bsearch function
    public Zipcode search(String code) {
       // return bsearch(code, 0, codes.size() - 1);
        int pos = Collections.binarySearch(this.codes, new Zipcode(code, "", "", 0, 0, 0));

        if (pos != -1) {
            return this.codes.get(pos);
        }
        else {
            return null;
        }

    } // search

} // Database
