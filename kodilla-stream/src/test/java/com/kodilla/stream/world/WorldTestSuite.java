package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal(3795213));
        Country finland = new Country(new BigDecimal(564561));
        Country uk = new Country(new BigDecimal(12345679));
        Country spain = new Country(new BigDecimal(7897897));
        Country japan = new Country(new BigDecimal(6921457));
        Country india = new Country(new BigDecimal(15863147));
        Country china = new Country(new BigDecimal(45894965));
        Country thailand = new Country(new BigDecimal(1142368));
        Country usa = new Country(new BigDecimal(54447849));
        Country canada = new Country(new BigDecimal(5867895));
        Country mexico = new Country(new BigDecimal(3517894));
        Country cuba = new Country(new BigDecimal(148412));
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent america = new Continent();
        World world = new World();

        //When
        europe.addCountry(poland);
        europe.addCountry(finland);
        europe.addCountry(uk);
        europe.addCountry(spain);
        asia.addCountry(japan);
        asia.addCountry(india);
        asia.addCountry(china);
        asia.addCountry(thailand);
        america.addCountry(usa);
        america.addCountry(canada);
        america.addCountry(mexico);
        america.addCountry(cuba);
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(america);

        //Then
        BigDecimal sumOfAllPeople = new BigDecimal(158407337);
        Assert.assertEquals(sumOfAllPeople, world.getPeopleQuantity());
    }
}
