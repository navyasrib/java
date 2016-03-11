import guest.Person;
import personDetails.*;

import java.util.ArrayList;
import java.util.List;

public class Invitees {

    private List<Person> allGuests;

    public Invitees() {
        allGuests = new ArrayList<>();
    }

    public void createPerson(String data) {
        String[] list = data.split("\n");
        for (String aList : list) {
            String[] details = aList.split(",");
            allGuests.add(getPerson(details));
        }
    }

    private Person getPerson(String[] details) {
        Name name = new Name(details[0], details[1]);
        Gender gender = new Gender(details[2]);
        Age age = new Age(Integer.parseInt(details[3]));
        City city = new City(details[4]);
        State state = new State(details[5]);
        Country country = new Country(details[6]);
        Address address = new Address(city, state, country);
        return new Person(name, gender, age, address);
    }

    public String getFitstLastNames() {
        String allNames = "";
        for (Person guest : allGuests) {
            allNames += guest.getFirstLastName();
            allNames += "\n";
        }
        return allNames;
    }

    public String getLastFirstNames() {
        String allNames = "";
        for (Person guest : allGuests) {
            allNames += guest.getLastFirstName();
            allNames += "\n";
        }
        return allNames;
    }

    public List<Person> getByCountry(String countryName) {
        FilterBy s = new FilterBy();
        return s.getListByCountry(allGuests, countryName);
    }

    public String getGuestsFirstLastCountry(String country) {
        String allNames = "";
        List<Person> sortedByCountry = this.getByCountry(country);
        for (Person guest : sortedByCountry) {
            allNames += guest.getFirstLastNameWithCountry();
            allNames += "\n";
        }
        return allNames;
    }

    public String getGuestsByLastFirstCountry(String country) {
        String allNames = "";
        List<Person> sortedByCountry = getByCountry(country);
        for (Person guest : sortedByCountry) {
            allNames += guest.getLastFirstNameWithCountry();
            allNames += "\n";
        }
        return allNames;
    }
}

