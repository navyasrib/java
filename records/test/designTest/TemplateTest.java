package designTest;

import design.Template;
import guest.Person;
import personDetails.*;

public class TemplateTest{
    Name name = new Name("Hari","Froo");
    Gender gender = new Gender("male");
    Age age = new Age(6);
    City city = new City("kongon");
    State state = new State("Meghalaya");
    Country country = new Country("India");
    Address address = new Address(city,state,country);
    Person person = new Person(name,gender,age,address);
    Template t = new Template(person);
    String alignedData = t.generate("title firstname lastname\ncity, state\ncountry");
}
