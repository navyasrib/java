package personDetailsTest;

import org.junit.Test;
import personDetails.Country;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CountryTest {
    @Test
    public void testIsSameAsAsShouldSayTrueForSameCountry() throws Exception {
        Country c = new Country("India");
        assertTrue(c.isSameAs("India"));
    }

    @Test
    public void testIsSameAsAsShouldSayFalseForDifferentCountry() throws Exception {
        Country c = new Country("India");
        assertFalse(c.isSameAs("Australia"));
    }
}
