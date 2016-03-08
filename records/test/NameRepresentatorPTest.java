import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameRepresentatorPTest {
    @Test
    public void testGetNameRepresentsNameInFirstLastFormat() throws Exception {
        Person p = new Person("navya", "basava", "female", "18", "vijayawada", "Andhra Pradesh", "India");
        NameRepresentatorP n = new NameRepresentatorP();
        assertEquals("Ms navya basava",n.getName(p));
    }
}
