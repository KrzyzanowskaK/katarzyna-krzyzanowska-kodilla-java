package com.kodilla.good.patterns.FlightsSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightsConnection {
    private String throughCity;

    public final Map<Airport, List<Airport>> getFlights() {

        final Map<Airport, List<Airport>> flightsConnection = new HashMap<>();

        Flights flights = new Flights();

        Airport warszawa = flights.getDepartureAirports().get(0);
        Airport kraków = flights.getDepartureAirports().get(1);
        Airport praga = flights.getDepartureAirports().get(2);

        List<Airport> flightsFromWarszawa = flights.getFlightsFromWarszawa();
        List<Airport> flightsFromKraków = flights.getFlightsFromKraków();
        List<Airport> flightsFromPraga = flights.getFlightsFromPraga();

        flightsConnection.put(warszawa, flightsFromWarszawa);
        flightsConnection.put(kraków, flightsFromKraków);
        flightsConnection.put(praga, flightsFromPraga);

        return new HashMap<>(flightsConnection);
    }

    public String findFlightThroughCity(String airport) {
        FlightsConnection flightsConnection = new FlightsConnection();

        flightsConnection.getFlights().entrySet().stream()
                .forEach(arrivalAirports -> {
                    if (arrivalAirports.getValue().toString().contains(airport)) {
                        String throughCity = arrivalAirports.getKey().toString();
                        this.throughCity = throughCity;}});
        return throughCity;
    }
}