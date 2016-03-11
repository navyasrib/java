package guest;
import personDetails.*;

public class Person {

    private final Gender gender;
    private final Age age;
    private final Address address;
    private final Name name;
    private final String title;

    public Person(Name name, Gender gender, Age age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.title = gender.title();
    }

    public Age getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public String getFirstLastName() {
        NameRepresentatorP n = new NameRepresentatorP();
        return this.title + " " + n.getName(name);
    }

    public String getFirstLastNameWithCountry() {
        return this.getFirstLastName() + ", " + this.address.getCountry();
    }

    public String getLastFirstName() {
        NameRepresentatorS n = new NameRepresentatorS();
        return this.title + " " + n.getName(name);
    }

    public String getLastFirstNameWithCountry() {
        return this.getLastFirstName() + ", " + this.address.getCountry();
    }

    public String toString() {
        return name + "," + gender + "," + age + "," + address.toString();
    }

    public String getAgeCountryFirstLast() {
        return this.getFirstLastNameWithCountry() + ", " + this.age;
    }

    public String getAgeCountryLastFirst() {
        return this.getLastFirstNameWithCountry() + ", " + this.age;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return name.getFirstName();
    }

    public String getLastName() {
        return name.getLastName();
    }

    public static class NameRepresentatorP {

        public NameRepresentatorP() {
        }

        public String getName(Name name) {
            return name.getFirstName() + " " + name.getLastName();
        }
    }
}
