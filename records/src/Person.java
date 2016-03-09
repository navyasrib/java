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
        return name + "," + gender + "," + age.getAge() + "," + address.toString();
    }

}
