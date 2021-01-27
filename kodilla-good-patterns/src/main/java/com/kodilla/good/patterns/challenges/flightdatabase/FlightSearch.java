package com.kodilla.good.patterns.challenges.flightdatabase;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {
    FlightDatabase flightDatabase;

    public FlightSearch(FlightDatabase flightDatabase) {
        this.flightDatabase = flightDatabase;
    }

    public Set<Flight> findFlightTo(String city) {
        return flightDatabase.getFlights().stream()
                .filter(flight -> flight.getArrival().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findFlightFrom(String city) {
        return flightDatabase.getFlights().stream()
                .filter(flight -> flight.getDeparture().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<FlightsConnections> findFlightVia(String begin, String finish, String fliesVia) {
        Set<Flight> beginOfTravel = findFlightFrom(begin);
        Set<Flight> finishOfTravel = findFlightTo(finish);

        Set<FlightsConnections> result = new HashSet<>();

        for (Flight start : beginOfTravel) {
            for (Flight end : finishOfTravel) {
                if (start.getArrival().equals(fliesVia) && end.getDeparture().equals(fliesVia)) {
                    result.add(new FlightsConnections(start, end));
                }
            }
        }
        return result;
    }

    public void printFlights(Set<Flight> customFlights) {
        customFlights.forEach(System.out::println);
    }

    public void displayFlightsTo(String city) {
        Set<Flight> result = findFlightTo(city);
        printFlights(result);
    }

    public void displayFlightsFrom(String city) {
        Set<Flight> result = findFlightFrom(city);
        printFlights(result);
    }

    public void displayFlightsVia(String begin, String finish, String change){
        Set<FlightsConnections> result = findFlightVia(begin, finish, change);
        result.forEach(System.out::println);
    }
}