import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class NameRepresentationSufixTest {
    @Test
    public void testShouldGiveTheNamesWithTitleMrForMale() throws Exception {
        Person p = new Person("Chaitanya", "Ram", "Male", "12", "Jamshedpur", "Jharkhand", "India");
        String name = p.getLastFirstName();
        assertEquals("Mr Ram, Chaitanya", name);
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMsForFemale() throws Exception {
        Person p = new Person("RadhaKrishna", "Metla", "Female", "24", "Bangalore", "Karnataka", "India");
        String name = p.getLastFirstName();
        assertEquals("Ms Metla, RadhaKrishna", name);
    }

    @Test
    public void testShouldGivePersonsFromSpecificCountry() throws Exception {
        Person p = new Person("RadhaKrishna", "Metla", "female", "24", "Bangalore", "Karnataka", "India");
        Person p1 = new Person("Harsha", "Gonne", "male", "29", "Bangalore", "Karnataka", "India");
        Person p2 = new Person("Rakesh", "Sonti", "male", "15", "HotLand", "Suvi", "England");
        ArrayList<Person> personsList = new ArrayList<>();
        personsList.add(p);
        personsList.add(p1);
        personsList.add(p2);
        SortByAddress n = new SortByAddress();
        ArrayList<Person> selectedList = n.getListBy(personsList, "India");
        Iterator iterator = selectedList.iterator();
        assertEquals("Ms Metla, RadhaKrishna, India", p.getCasualNameWithCountry((Person) iterator.next()));
        assertEquals("Mr Gonne, Harsha, India", p.getCasualNameWithCountry((Person) iterator.next()));
        try {
            assertEquals("", p.getCasualNameWithCountry((Person) iterator.next()));
        } catch (NoSuchElementException e) {
            assertEquals(null, e.getMessage());
        }
    }
}
