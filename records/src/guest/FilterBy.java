package guest;

import personDetails.Age;

import java.util.List;

public class FilterBy {
    public FilterBy() {
    }

    public Guests getListByCountry(List<Person> list, String country) {
        Guests guests = new Guests();
        country = country.toUpperCase();
        for (Person p : list) {
            if (p.getAddress().getCountry().isSameAs(country))
                guests.add(p);
        }
        return guests;
    }

    public Guests getByAge(List<Person> list, int age1) {
        Guests guests = new Guests();
        for (Person p : list) {
            Age age = p.getAge();
            if (age.isGreaterThan(age1))
                guests.add(p);
        }
        return guests;
    }
}
