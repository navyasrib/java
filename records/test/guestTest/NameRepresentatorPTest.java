package guestTest;

import guest.NameRepresentatorS;
import guest.Person;
import org.junit.Test;
import personDetails.Name;

import static org.junit.Assert.assertEquals;

public class NameRepresentatorPTest {
    @Test
    public void testGetNameRepresentsNameInFirstLastFormat() throws Exception {
        Name name = new Name("Navya","Basava");
        Person.NameRepresentatorP n = new Person.NameRepresentatorP();
        assertEquals("Navya Basava",n.getName(name));
    }

    public static class NameRepresentatorSTest {

        @Test
        public void testGetNameRepresentsNameInLastFirstFormat() throws Exception {
            Name name = new Name("Navya", "Basava");
            NameRepresentatorS n = new NameRepresentatorS();
            assertEquals("Basava, Navya",n.getName(name));
        }
    }
}
