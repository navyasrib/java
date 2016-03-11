package guest;

import personDetails.*;

import java.util.ArrayList;
import java.util.List;

public class Guests {

    private List<Person> allGuests;
    private FilterBy filterBy;

    public Guests() {
        allGuests = new ArrayList<>();
    }

    public void add(Person person){
        allGuests.add(person);
        filterBy = new FilterBy();
    }

    private static Person getPerson(String[] details) {
        Name name = new Name(details[0], details[1]);
        Gender gender = new Gender(details[2]);
        Age age = new Age(Integer.parseInt(details[3]));
        City city = new City(details[4]);
        State state = new State(details[5]);
        Country country = new Country(details[6]);
        Address address = new Address(city, state, country);
        return new Person(name, gender, age, address);
    }

    public static Guests parseGuests(String data){
        Guests guests = new Guests();
        String[] list = data.split("\n");
        for (String aList : list) {
            String[] details = aList.split(",");
            guests.add(getPerson(details));
        }
        return guests;
    }

    public List<Person> getAllguests() {
        return this.allGuests;
    }

    public Guests getSameCountry(String country) {
        return filterBy.getListByCountry(allGuests,country);
    }

    public Guests getOlderThan(int age) {
        return filterBy.getByAge(allGuests,age);
    }

    public Guests getCountryWiseOlderThan(String country, int age) {
        Guests g = getSameCountry(country);
        return filterBy.getByAge(g.allGuests,age);
    }
}

