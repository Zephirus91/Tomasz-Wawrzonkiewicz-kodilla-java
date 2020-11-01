package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    public void asiaContains() {

        List<String> asia = new ArrayList<>();
        asia.add("Tokio");
        asia.add("Pekin");
        asia.add("Seul");
    }

    public void africaContains() {

        List<String> africa = new ArrayList<>();
        africa.add("Kair");
        africa.add("Dakar");
        africa.add("Nairobi");
    }

    public void europeContains() {

        List<String> europe = new ArrayList<>();
        europe.add("Poland");
        europe.add("France");
        europe.add("Italy");
    }

    public void northAmericaContains() {

        List<String> northAmerica = new ArrayList<>();
        northAmerica.add("New York");
        northAmerica.add("Los Angeles");
        northAmerica.add("Chicago");
    }

    public void southAmericaContains() {

        List<String> southAmerica = new ArrayList<>();
        southAmerica.add("Bogota");
        southAmerica.add("Medelin");
        southAmerica.add("Santiago");
    }

    public void australiaContains() {

        List<String> australia = new ArrayList<>();
        australia.add("Sydney");
        australia.add("Melbourne");
        australia.add("Canberra");
    }
}
