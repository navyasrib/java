import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void testShouldGiveTheNamesWithTitleMrForMaleInFirstLastFormat() throws Exception {
        Person p = new Person("Chaitanya","Ram","male","12","Jamshedpur","Jharkhand","India");
        String name = p.getFirstLastName();
        assertEquals("Mr Chaitanya Ram",name);
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMsForFemaleInFirstLastFormat() throws Exception {
        Person p = new Person("RadhaKrishna","Metla","female","24","Bangalore","Karnataka","India");
        String name = p.getFirstLastName();
        assertEquals("Ms RadhaKrishna Metla",name);
    }

    @Test
    public void testShouldGivePersonsFromSpecificCountryInFirstLastFormat() throws Exception {
        Person p = new Person("RadhaKrishna","Metla","female","24","Bangalore","Karnataka","India");
        Person p1 = new Person("Harsha","Gonne","male","29","Bangalore","Karnataka","India");
        Person p2 = new Person("Rakesh","Sonti","male","15","HotLand","Suvi","England");
        ArrayList <Person> personsList = new ArrayList<>();
        personsList.add(p);
        personsList.add(p1);
        personsList.add(p2);
        FilterBy n = new FilterBy();
        List<Person> selectedList = n.getListByCountry(personsList,"India");
        Iterator iterator = selectedList.iterator();
        assertEquals("Ms RadhaKrishna Metla, India",((Person) iterator.next()).getFormalNameWithCountry());
        assertEquals("Mr Harsha Gonne, India",((Person) iterator.next()).getFormalNameWithCountry());
        try{
            assertEquals("",((Person) iterator.next()).getFormalNameWithCountry());
        }
        catch(NoSuchElementException e){
            assertEquals(null,e.getMessage());
        }
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMrForMaleInLastFirstFormat() throws Exception {
        Person p = new Person("Chaitanya", "Ram", "Male", "12", "Jamshedpur", "Jharkhand", "India");
        String name = p.getLastFirstName();
        assertEquals("Mr Ram, Chaitanya", name);
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMsForFemaleInLastFirstFormat() throws Exception {
        Person p = new Person("RadhaKrishna", "Metla", "Female", "24", "Bangalore", "Karnataka", "India");
        String name = p.getLastFirstName();
        assertEquals("Ms Metla, RadhaKrishna", name);
    }

    @Test
    public void testShouldGivePersonsFromSpecificCountryInLastFirstFormat() throws Exception {
        Person p = new Person("RadhaKrishna", "Metla", "female", "24", "Bangalore", "Karnataka", "India");
        Person p1 = new Person("Harsha", "Gonne", "male", "29", "Bangalore", "Karnataka", "India");
        Person p2 = new Person("Rakesh", "Sonti", "male", "15", "HotLand", "Suvi", "England");
        ArrayList<Person> personsList = new ArrayList<>();
        personsList.add(p);
        personsList.add(p1);
        personsList.add(p2);
        FilterBy n = new FilterBy();
        List<Person> selectedList = n.getListByCountry(personsList, "India");
        Iterator iterator = selectedList.iterator();
        assertEquals("Ms Metla, RadhaKrishna, India", ((Person) iterator.next()).getCasualNameWithCountry());
        assertEquals("Mr Gonne, Harsha, India", ((Person) iterator.next()).getCasualNameWithCountry());
        try {
            assertEquals("", ((Person) iterator.next()).getCasualNameWithCountry());
        } catch (NoSuchElementException e) {
            assertEquals(null, e.getMessage());
        }
    }
}
