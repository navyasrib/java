import org.junit.Before;
import org.junit.Test;
import personDetails.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

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
        Country c1 = new Country("India");
        Address address1 = new Address(city,state,c1);
        Name name1 = new Name("Harsha", "Gonne");
        Person p1 = new Person(name1,gender,age,address1);
        Country c2 = new Country("Australia");
        Address address2 = new Address(city,state,c2);
        Person p2 = new Person(name1,gender,age,address2);
        ArrayList<Person> personsList = new ArrayList<>();
        personsList.add(p);
        personsList.add(p1);
        personsList.add(p2);

        FilterBy n = new FilterBy();
        List<Person> selectedList = n.getListByCountry(personsList, "India");
        Iterator iterator = selectedList.iterator();
        assertEquals("Mr Chaitanya Ram, India", ((Person) iterator.next()).getFirstLastNameWithCountry());
        assertEquals("Mr Harsha Gonne, India", ((Person) iterator.next()).getFirstLastNameWithCountry());
        try {
            assertEquals("", ((Person) iterator.next()).getFirstLastNameWithCountry());
        } catch (NoSuchElementException e) {
            assertEquals(null, e.getMessage());
        }
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
        Country c1 = new Country("India");
        Address address1 = new Address(city,state,c1);
        Name name1 = new Name("Harsha", "Gonne");
        Person p1 = new Person(name1,gender,age,address1);
        Country c2 = new Country("Australia");
        Address address2 = new Address(city,state,c2);
        Person p2 = new Person(name1,gender,age,address2);
        ArrayList<Person> personsList = new ArrayList<>();
        personsList.add(p);
        personsList.add(p1);
        personsList.add(p2);

        FilterBy n = new FilterBy();
        List<Person> selectedList = n.getListByCountry(personsList, "India");
        Iterator iterator = selectedList.iterator();
        assertEquals("Mr Ram, Chaitanya, India", ((Person) iterator.next()).getLastFirstNameWithCountry());
        assertEquals("Mr Gonne, Harsha, India", ((Person) iterator.next()).getLastFirstNameWithCountry());
        try {
            assertEquals("", ((Person) iterator.next()).getLastFirstNameWithCountry());
        } catch (NoSuchElementException e) {
            assertEquals(null, e.getMessage());
        }
    }
}
