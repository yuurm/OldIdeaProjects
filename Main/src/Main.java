import com.skillbox.airport.Airport;
import transport.*;

import java.util.TreeMap;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        String name= "";
        TreeMap<String, String> map;
        Car car = new Car();
        Car car1 = new Car();

        Airport airport = Airport.getInstance();
        System.out.println(airport.generateAircraft());
    }
}
