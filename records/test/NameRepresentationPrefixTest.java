import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameRepresentationPrefixTest {
    @Test
    public void testShouldGiveTheNamesWithTitleMrForMale() throws Exception {
        Person p = new Person("Chaitanya","Ram","M",12,"Jamshedpur","Jharkhand","India");
        NameRepresentationPrefix name = new NameRepresentationPrefix();
        assertEquals("Mr Chaitanya Ram",name.getName(p));
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMsForFemale() throws Exception {
        Person p = new Person("RadhaKrishna","Metla","F",24,"Bangalore","Karnataka","India");
        NameRepresentationPrefix name = new NameRepresentationPrefix();
        assertEquals("Ms RadhaKrishna Metla",name.getName(p));
    }
}
