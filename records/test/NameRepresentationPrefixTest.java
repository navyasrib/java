import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class NameRepresentationPrefixTest {
    @Test
    public void testShouldGiveTheNamesWithTitleMrForMale() throws Exception {
        Person p = new Person("Chaitanya","Ram","male",12,"Jamshedpur","Jharkhand","India");
        NameRepresentationPrefix name = new NameRepresentationPrefix();
        assertEquals("Mr Chaitanya Ram",name.getName(p));
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMsForFemale() throws Exception {
        Person p = new Person("RadhaKrishna","Metla","female",24,"Bangalore","Karnataka","India");
        NameRepresentationPrefix name = new NameRepresentationPrefix();
        assertEquals("Ms RadhaKrishna Metla",name.getName(p));
    }

    @Test
    public void testShouldGivePersonsFromSpecificCountry() throws Exception {
        Person p = new Person("RadhaKrishna","Metla","female",24,"Bangalore","Karnataka","India");
        Person p1 = new Person("Harsha","Gonne","male",29,"Bangalore","Karnataka","India");
        Person p2 = new Person("Rakesh","Sonti","male",15,"HotLand","Suvi","England");
        ArrayList <Person> personsList = new ArrayList<>();
        personsList.add(p);
        personsList.add(p1);
        personsList.add(p2);
        SortByAddress n = new SortByAddress();
        NameRepresentationPrefix representaion = new NameRepresentationPrefix();
        ArrayList <Person> selectedList = n.getListBy(personsList,"India");
        Iterator iterator = selectedList.iterator();
        assertEquals("Ms RadhaKrishna Metla, India",representaion.getNameWithCountry((Person) iterator.next()));
        assertEquals("Mr Harsha Gonne, India",representaion.getNameWithCountry((Person) iterator.next()));
        try{
            assertEquals("",representaion.getNameWithCountry((Person) iterator.next()));
        }
        catch(NoSuchElementException e){
            assertEquals(null,e.getMessage());
        }
    }
}
