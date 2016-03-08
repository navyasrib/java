import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameRepresentatorSTest {

    @Test
    public void testGetNameRepresentsNameInLastFirstFormat() throws Exception {
        Person p = new Person("navya", "basava", "female", "18", "vijayawada", "Andhra Pradesh", "India");
        NameRepresentatorS n = new NameRepresentatorS();
        assertEquals("Ms basava, navya",n.getName(p));
    }
}
