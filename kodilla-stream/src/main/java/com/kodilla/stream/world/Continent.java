package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private String name;
    private List<Country> countries = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return name.equals(continent.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", countries=" + countries +
                '}';
    }
}
