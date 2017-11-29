package com.kodilla.exception.test;

public class FlightSearchRunner {
    public static void main(String args[]) {
        Flight flight = new Flight("Warszawa","Tokyo");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight);
            System.out.println("We got one  available connection from " + flight);
        }
        catch (RouteNotFoundException e) {
            System.out.println("Sorry, we don't have that connection.");
        }
        finally {
            System.out.println("Thank you for use our search.");
        }
    }
}
