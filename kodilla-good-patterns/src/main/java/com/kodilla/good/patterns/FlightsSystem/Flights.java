package com.kodilla.good.patterns.FlightsSystem;

import java.util.ArrayList;
import java.util.List;

public class Flights {
    public List<Airport> getDepartureAirports() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport ("Warszawa"));
        airports.add(new Airport ("Kraków"));
        airports.add(new Airport ("Praga"));
        return airports;
    }

    public List<Airport> getFlightsFromWarszawa() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport ("Kraków"));
        airports.add(new Airport ("Gdańsk"));
        airports.add(new Airport ("Radom"));
        return airports;
    }

    public List<Airport> getFlightsFromKraków() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport ("Berlin"));
        airports.add(new Airport ("Wrocław"));
        airports.add(new Airport ("Rzeszów"));
        return airports;
    }

    public List<Airport> getFlightsFromPraga() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport ("Warszawa"));
        airports.add(new Airport ("Wroclaw"));
        airports.add(new Airport ("Poznań"));
        return airports;
    }
}