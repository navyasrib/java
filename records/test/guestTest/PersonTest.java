package guestTest;
import guest.Person;
import org.junit.Before;
import org.junit.Test;
import personDetails.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class PersonTest {
        Name name;
        Age age;
        Gender gender;
        Address address;
    @Before
    public void setUp() throws Exception {
        name = new Name("Chaitanya", "Ram");
        age = new Age(12);
        gender = new Gender("male");
        City city = new City("Jamshedpur");
        State state = new State("Jharkhand");
        Country country = new Country("India");
        address = new Address(city, state, country);
    }

    @Test
    public void testShouldGiveTheFirstNameOfPerson() throws Exception {
        Person person = new Person(name, gender, age, address);
        assertEquals("Chaitanya",person.getFirstName());
    }

    @Test
    public void testShouldGiveTheLastNameOfPerson() throws Exception {
        Person person = new Person(name, gender, age, address);
        assertEquals("Ram",person.getLastName());
    }
}
