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

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return name.getFirstName();
    }

    public String getLastName() {
        return name.getLastName();
    }

    public String toString() {
        return name + "," + gender + "," + age + "," + address.toString();
    }
}
