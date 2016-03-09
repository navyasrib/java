package personDetailsTest;

import org.junit.Test;
import personDetails.Gender;

import static org.junit.Assert.assertEquals;

public class GenderTest {
    @Test
    public void testTitleShouldGiveMrForMale() throws Exception {
        Gender g = new Gender("male");
        assertEquals("Mr", g.title());
    }

    @Test
    public void testTitleShouldGiveMsForFemale() throws Exception {
        Gender g = new Gender("Female");
        assertEquals("Ms",g.title());
    }
}
