package com.kodilla.good.patterns.challenges.flightdatabase;

public class Application {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        FlightSearch flightSearch = new FlightSearch(flightDatabase);

        try {
            System.out.println("List of flies 'from':\n");
            flightSearch.displayFlightsFrom("Madrit");
            System.out.println("\nList of flies 'to':\n");
            flightSearch.displayFlightsTo("Rome");
            System.out.println("\nList of flies 'via':\n");
            flightSearch.displayFlightsVia("Cracov","Sydney","Paris");
        } catch (Exception e) {
            System.out.println("No flights found");
        }
    }
}
