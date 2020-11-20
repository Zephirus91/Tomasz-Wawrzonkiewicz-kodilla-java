package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearch {
    public boolean findFlight (Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> depart = new HashMap<>();
        depart.put("Warsaw", true);
        depart.put("Berlin", false);
        depart.put("Washington", true);
        depart.put("Paris", true);
        depart.put("Delhi", false);
        depart.put("Sydney", true);
        depart.put("Tokyo", false);

        if (depart.containsKey(flight.getArrivalAirport())) {
            return depart.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}
