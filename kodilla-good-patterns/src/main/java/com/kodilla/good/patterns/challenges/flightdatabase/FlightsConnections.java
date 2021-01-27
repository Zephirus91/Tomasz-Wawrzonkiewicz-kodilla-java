package com.kodilla.good.patterns.challenges.flightdatabase;

public class FlightsConnections {
    private Flight start;
    private Flight end;

    public FlightsConnections(Flight start, Flight end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightsConnections that = (FlightsConnections) o;

        if (!start.equals(that.start)) return false;
        return end.equals(that.end);
    }

    @Override
    public int hashCode() {
        int result = start.hashCode();
        result = 31 * result + end.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight information (via travel): Flight from " + start.getDeparture() + " to "
                + end.getArrival() + " via " + start.getArrival() + ".";
    }
}
