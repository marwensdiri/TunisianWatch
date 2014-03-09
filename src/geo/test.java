/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.Geoloc;
import com.test.Results;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Farouk
 */
public class test {
    public static void main(String[] args) throws MalformedURLException, IOException {
        Geoloc gLoc = null;
        URL url = new URL("https://maps.googleapis.com/maps/api/geocode/json?latlng=30.558223,9.601010&sensor=false");
        ObjectMapper mapper = new ObjectMapper();
        gLoc = mapper.readValue(url, Geoloc.class);
        System.out.println(gLoc.getResults());
        for (Results ac : gLoc.getResults()){
            System.out.println(ac.getFormatted_address());
        }
    }
}
