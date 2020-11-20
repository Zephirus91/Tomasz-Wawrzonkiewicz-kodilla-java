package com.kodilla.exception.test;

public class FlightSearchBrowser {
    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("Warsaw", "Paris");

        try {
            System.out.println(flightSearch.findFlight(flight));
        } catch (Exception e) {
            System.out.println("This route is unavailable");
        } finally {
            System.out.println("Thank you for using our services");
        }
    }
}
