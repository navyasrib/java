import org.junit.Test;
import personDetails.Name;

import static org.junit.Assert.assertEquals;

public class NameRepresentatorPTest {
    @Test
    public void testGetNameRepresentsNameInFirstLastFormat() throws Exception {
        Name name = new Name("Navya","Basava");
        NameRepresentatorP n = new NameRepresentatorP();
        assertEquals("Navya Basava",n.getName(name));
    }
}
