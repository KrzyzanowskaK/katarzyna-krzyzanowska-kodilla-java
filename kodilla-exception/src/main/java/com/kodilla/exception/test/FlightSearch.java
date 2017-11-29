package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearch {
    public Boolean findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String,Boolean> openAirport = new HashMap<>();

        openAirport.put("Tokyo", true);
        openAirport.put("Warsaw", true);
        openAirport.put("Pekin", false);
        openAirport.put("Praga", false);

        Boolean possible = openAirport.getOrDefault(flight.getArrivalAirport(), false);

        if (possible == false && !openAirport.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Sorry, this flight is not available");
        }

        return possible;
    }
}
