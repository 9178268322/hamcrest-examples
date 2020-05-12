package com.ip;

import entities.Flight;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static java.time.format.DateTimeFormatter.ofPattern;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

public class HamcrestTest {

    @Test
    public void collectionsMatchers() {

        List<Integer> list = Arrays.asList(5, 2, 4);

        assertThat(list, hasSize(3));

        assertThat(list, contains(5, 2, 4));
        assertThat(list, containsInAnyOrder(2, 4, 5));
        assertThat(list, everyItem(greaterThan(1)));
    }

    @Test
    public void array() {

        Integer[] ints = new Integer[] {7, 5, 12, 16};

        assertThat(ints, arrayWithSize(4));
        assertThat(ints, arrayContaining(7, 5, 12 ,16));
    }

    @Test
    public void flightTest() {
        Flight flight = new Flight("Boston", "New York", LocalDate.parse("15-02-2015", ofPattern("dd-MM-yyyy")), 7);
        Flight flight2 = new Flight("Boston", "New York", LocalDate.parse("15-02-2015", ofPattern("dd-MM-yyyy")), 7);

        assertThat(flight, hasProperty("fromDest"));
        assertThat(flight, hasProperty("fromDest", equalTo("Boston")));

        assertThat(flight, samePropertyValuesAs(flight2));

    }

    @Test
    public void stringMatcher() {
        String stringToTest = null;
        //assertThat(stringToTest, isEmptyString());
        //assertThat(stringToTest, isEmptyOrNullString());
    }


}
