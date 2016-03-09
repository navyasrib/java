import org.junit.Test;
import personDetails.Name;

import static org.junit.Assert.assertEquals;

public class NameRepresentatorSTest {

    @Test
    public void testGetNameRepresentsNameInLastFirstFormat() throws Exception {
        Name name = new Name("Navya", "Basava");
        NameRepresentatorS n = new NameRepresentatorS();
        assertEquals("Basava, Navya",n.getName(name));
    }
}
