import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class NameRepresentationPrefixTest {
    @Test
    public void testShouldGiveTheNamesWithTitleMrForMale() throws Exception {
        Person p = new Person("Chaitanya","Ram","male","12","Jamshedpur","Jharkhand","India");
        String name = p.getFirstLastName();
        assertEquals("Mr Chaitanya Ram",name);
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMsForFemale() throws Exception {
        Person p = new Person("RadhaKrishna","Metla","female","24","Bangalore","Karnataka","India");
        String name = p.getFirstLastName();
        assertEquals("Ms RadhaKrishna Metla",name);
    }

    @Test
    public void testShouldGivePersonsFromSpecificCountry() throws Exception {
        Person p = new Person("RadhaKrishna","Metla","female","24","Bangalore","Karnataka","India");
        Person p1 = new Person("Harsha","Gonne","male","29","Bangalore","Karnataka","India");
        Person p2 = new Person("Rakesh","Sonti","male","15","HotLand","Suvi","England");
        ArrayList <Person> personsList = new ArrayList<>();
        personsList.add(p);
        personsList.add(p1);
        personsList.add(p2);
        SortByAddress n = new SortByAddress();
        ArrayList <Person> selectedList = n.getListBy(personsList,"India");
        Iterator iterator = selectedList.iterator();
        assertEquals("Ms RadhaKrishna Metla, India",p.getFormalNameWithCountry((Person) iterator.next()));
        assertEquals("Mr Harsha Gonne, India",p.getFormalNameWithCountry((Person) iterator.next()));
        try{
            assertEquals("",p.getFormalNameWithCountry((Person) iterator.next()));
        }
        catch(NoSuchElementException e){
            assertEquals(null,e.getMessage());
        }
    }
}
