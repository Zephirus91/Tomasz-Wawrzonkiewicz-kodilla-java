package com.kodilla.good.patterns.challenges.flightdatabase;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {
    private List<Flight> flights = new ArrayList<>();

    public List<Flight> getFlights() {
        flights.add(new Flight("Budapest", "Rome"));
        flights.add(new Flight("Budapest", "Berlin"));
        flights.add(new Flight("Rome", "Cracov"));
        flights.add(new Flight("Moskow", "Cracov"));
        flights.add(new Flight("Madrit", "Washington"));
        flights.add(new Flight("Madrit", "Warsaw"));
        flights.add(new Flight("Washington", "Rome"));
        flights.add(new Flight("Cracov", "Paris"));
        flights.add(new Flight("Paris", "Sydney"));
        flights.add(new Flight("Praha", "Sofia"));
        flights.add(new Flight("Miami", "Los Angeles"));
        return new ArrayList<>(flights);
    }
}