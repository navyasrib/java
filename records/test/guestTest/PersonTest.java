package guestTest;
import guest.Person;
import org.junit.Before;
import org.junit.Test;
import personDetails.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Name name;
    private Age age;
    private Gender gender;
    private Address address;
    private City city;
    private State state;

    @Before
    public void setUp() throws Exception {
        name = new Name("Chaitanya", "Ram");
        age = new Age(12);
        gender = new Gender("male");
        city = new City("Jamshedpur");
        state = new State("Jharkhand");
        Country country = new Country("India");
        address = new Address(city, state, country);
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMrForMaleInFirstLastFormat() throws Exception {
        Person p = new Person(name, gender, age, address);
        String name1 = p.getFirstLastName();
        assertEquals("Mr Chaitanya Ram", name1);
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMsForFemaleInFirstLastFormat() throws Exception {
        name = new Name("RadhaKrishna", "Metla");
        Gender gender1 = new Gender("female");
        Person p = new Person(name, gender1, age, address);
        String name = p.getFirstLastName();
        assertEquals("Ms RadhaKrishna Metla", name);
    }

    @Test
    public void testShouldGivePersonsFromSpecificCountryInFirstLastFormat() throws Exception {
        Person p = new Person(name,gender,age,address);
        String result = p.getFirstLastNameWithCountry();
        assertEquals("Mr Chaitanya Ram, India",result);
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMrForMaleInLastFirstFormat() throws Exception {
        Person p = new Person(name,gender,age,address);
        String name = p.getLastFirstName();
        assertEquals("Mr Ram, Chaitanya", name);
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMsForFemaleInLastFirstFormat() throws Exception {
        name = new Name("RadhaKrishna","Metla");
        gender = new Gender("Female");
        Person p = new Person(name,gender,age,address);
        String name = p.getLastFirstName();
        assertEquals("Ms Metla, RadhaKrishna", name);
    }

    @Test
    public void testShouldGivePersonsFromSpecificCountryInLastFirstFormat() throws Exception {
        Person p = new Person(name,gender,age,address);
        String result = p.getLastFirstNameWithCountry();
        assertEquals("Mr Ram, Chaitanya, India",result);
    }

    @Test
    public void testShouldGiveThePeopleOfAgeAbove20InFirstLastFormat() throws Exception {
        Person p = new Person(name,gender,age,address);
        String result = p.getAgeCountryFirstLast();
        assertEquals("Mr Chaitanya Ram, India, 12",result);
    }

    @Test
    public void testShouldGiveThePeopleOfAgeAbove20InLastFirstFormat() throws Exception {
        Person p = new Person(name,gender,age,address);
        String result = p.getAgeCountryLastFirst();
        assertEquals("Mr Ram, Chaitanya, India, 12",result);
    }
}
