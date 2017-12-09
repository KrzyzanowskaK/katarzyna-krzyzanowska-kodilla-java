package com.kodilla.good.patterns.FlightsSystem;

public class FlightsSearch {
    private FlightsConnection flightsConnection = new FlightsConnection();

    public void findFlightsFrom(String airport) {
        System.out.println("Lot z " + airport + ":");

        flightsConnection.getFlights().entrySet().stream()
                .filter(depart -> depart.getKey().toString() == airport)
                .flatMap(arrive -> arrive.getValue().stream())
                .forEach(System.out::println);
    }

    public void findFlightsTo(String airport) {
        System.out.println("Lot do " + airport + " z:");

        flightsConnection.getFlights().entrySet().stream()
                .forEach(arrive -> {
                    if (arrive.getValue().toString().contains(airport)) {
                        System.out.println(arrive.getKey().toString());
                    }
                });
    }

    public void findFlightsBy(String airport) {
        System.out.println("Lot do " + airport + " z:");

        String throughCity = flightsConnection.findFlightThroughCity(airport);
        flightsConnection.getFlights().entrySet().stream()
                .forEach(arrivalAirports -> {
                    if (arrivalAirports.getValue().toString().contains(throughCity)) {
                        System.out.println(arrivalAirports.getKey().toString() + " przez " + throughCity);
                    }});
    }
}
