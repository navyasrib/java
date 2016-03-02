import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameRepresentationSufixTest {
    @Test
    public void testShouldGiveTheNamesWithTitleMrForMale() throws Exception {
        Person p = new Person("Chaitanya", "Ram", "M", 12, "Jamshedpur", "Jharkhand", "India");
        NameRepresentationSufix name = new NameRepresentationSufix();
        assertEquals("Mr Ram, Chaitanya", name.getName(p));
    }

    @Test
    public void testShouldGiveTheNamesWithTitleMsForFemale() throws Exception {
        Person p = new Person("RadhaKrishna", "Metla", "F", 24, "Bangalore", "Karnataka", "India");
        NameRepresentationSufix name = new NameRepresentationSufix();
        assertEquals("Ms Metla, RadhaKrishna", name.getName(p));
    }
}
