import guest.Person;
import org.junit.Before;
import org.junit.Test;
import personDetails.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FilterByTest {
    private Name name;
    private Age age;
    private Gender gender;
    private Address address;
    private City city;
    private State state;
    private Country country;

    @Before
    public void setUp() throws Exception {
        name = new Name("Chaitanya", "Ram");
        age = new Age(12);
        gender = new Gender("male");
        city = new City("Jamshedpur");
        state = new State("Jharkhand");
        country = new Country("India");
        address = new Address(city, state, country);
    }

    @Test
    public void testGetGuestsBySpecificCountry() throws Exception {
        FilterBy f = new FilterBy();
        List<Person> list = new ArrayList<>(3);
        list.add(new Person(name,gender,age,address));
        list.add(new Person(name,gender,age,address));
        country = new Country("Russia");
        address = new Address(city,state,country);
        list.add(new Person(name,gender,age,address));
        List<Person> result = f.getListByCountry(list,"India");
        assertEquals(2,result.size());
    }

    @Test
    public void testGetGuestsByAgeAbove20() throws Exception {
        FilterBy f = new FilterBy();
        ArrayList<Person> list = new ArrayList<>(3);
        age = new Age(20);
        list.add(new Person(name,gender,age,address));
        age = new Age(18);
        list.add(new Person(name,gender,age,address));
        age = new Age(25);
        list.add(new Person(name,gender,age,address));
        List<Person> result = f.getByAge(list);
        assertEquals(2,result.size());
    }
}
