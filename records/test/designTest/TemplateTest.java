package designTest;

import design.Template;
import guest.Person;
import org.junit.Before;
import org.junit.Test;
import personDetails.*;

import static org.junit.Assert.assertEquals;

public class TemplateTest {
    private Person person;

    @Before
    public void setUp() throws Exception {
        Name name = new Name("Hari", "Froo");
        Gender gender = new Gender("male");
        Age age = new Age(6);
        City city = new City("kungon");
        State state = new State("Meghalaya");
        Country country = new Country("India");
        Address address = new Address(city, state, country);
        person = new Person(name, gender, age, address);
    }

    @Test
    public void testForModelWithFirstLastNameAndTitle() throws Exception {
        Template template = new Template(person);
        assertEquals("Mr Hari Froo",template.generate("title firstname lastname"));
    }

    @Test
    public void testForModelWithLastFirstNameAndTitle() throws Exception {
        Template template = new Template(person);
        assertEquals("Mr Froo, Hari",template.generate("title lastname, firstname"));
    }

    @Test
    public void testForModelWithFirstLastNameAndCity() throws Exception {
        Template template = new Template(person);
        assertEquals("Mr Hari Froo, kungon",template.generate("title firstname lastname, city"));
    }

    @Test
    public void testForModelWithLastFirstNameAndCity() throws Exception {
        Template template = new Template(person);
        assertEquals("Mr Froo, Hari, kungon",template.generate("title lastname, firstname, city"));
    }

    @Test
    public void testForModelWithLastFirstNameCountryAndAge() throws Exception {
        Template template = new Template(person);
        assertEquals("Mr Froo, Hari, India, 6",template.generate("title lastname, firstname, country, age"));
    }

    @Test
    public void testForModelWithFirstLastNameCountryAndAge() throws Exception {
        Template template = new Template(person);
        assertEquals("Mr Hari Froo, India, 6",template.generate("title firstname lastname, country, age"));
    }

    @Test
    public void testGenerateTemplateshouldGiveThePersonDetailsInFirstLastFormat() throws Exception {
        Template t = new Template(person);
        String alignedData = t.generate("title firstname lastname\ncity, state\ncountry");
        assertEquals("Mr Hari Froo\nkungon, Meghalaya\nIndia", alignedData);
    }

    @Test
    public void testGenerateTemplateshouldGiveThePersonDetailsInLastFirstFormat() throws Exception {
        Template t = new Template(person);
        String alignedData = t.generate("title lastname, firstname\ncity, state\ncountry");
        assertEquals("Mr Froo, Hari\nkungon, Meghalaya\nIndia", alignedData);
    }

    @Test
    public void testGetWithBorderShouldGiveAllDetailsOfPersonWithBorder() throws Exception {
        Template template = new Template(person);
        assertEquals("+-------------------+\n" +
                    "| Mr Hari Froo      |\n" +
                    "|-------------------|\n" +
                    "| kungon, Meghalaya |\n" +
                    "| India             |\n" +
                    "+-------------------+",template.getWithBorder("Title FirstName LastName\nCity, State\nCountry"));
    }
}
