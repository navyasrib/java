package personDetailsTest;

import org.junit.Test;
import personDetails.Age;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class AgeTest {
    @Test
    public void testShouldSayGivenAgeIsGeaterItsAge() throws Exception {
        Age age = new Age(23);
        assertTrue(age.isGreaterThan(20));
    }
    @Test
    public void testShouldSayGivenAgeIsNotGeaterItsAge() throws Exception {
        Age age = new Age(23);
        assertFalse(age.isGreaterThan(25));
    }
    @Test
    public void testShouldSayGivenAgeIsGeaterItsAgeWhenBothAgesAreEqual() throws Exception {
        Age age = new Age(23);
        assertTrue(age.isGreaterThan(23));
    }
}
