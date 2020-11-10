package com.kodilla.stream.world;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country france = new Country("France", new BigDecimal("67000000"));
        Country russia = new Country("Russia", new BigDecimal("142000000"));
        Country china = new Country("China", new BigDecimal("1330000000"));
        Country maroko = new Country("Maroko", new BigDecimal("34000000"));
        Country sudan = new Country("Sudan", new BigDecimal("37000000"));
        Country samoa = new Country("Samoa", new BigDecimal("178000"));
        Country tonga = new Country("Tonga", new BigDecimal("119000"));
        Country brasil = new Country("Brasil", new BigDecimal("199000000"));
        Country chile = new Country("Chile", new BigDecimal("17000000"));
        Country usa = new Country("USA", new BigDecimal("309000000"));
        Country cuba = new Country("Cuba", new BigDecimal("13000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(france);

        Continent asia = new Continent("Asia");
        asia.addCountry(russia);
        asia.addCountry(china);

        Continent africa = new Continent("Africa");
        africa.addCountry(maroko);
        africa.addCountry(sudan);

        Continent australia = new Continent("Australia and Oceania");
        australia.addCountry(samoa);
        australia.addCountry(tonga);

        Continent southAmerica = new Continent(" South America");
        southAmerica.addCountry(brasil);
        southAmerica.addCountry(chile);

        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(usa);
        northAmerica.addCountry(cuba);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(australia);
        world.addContinent(southAmerica);
        world.addContinent(northAmerica);

        //When
        BigDecimal totalQuantityOfPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantityOfPeople = new BigDecimal("2186297000");
        Assertions.assertEquals(expectedQuantityOfPeople, totalQuantityOfPeople);
    }
}
