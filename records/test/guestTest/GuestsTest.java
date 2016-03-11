package guestTest;

import guest.Guests;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestsTest {
    private String data;
    private String data1;

    @Before
    public void setUp() throws Exception {
        data = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\n";
        data1 = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Bangladesh\n";
    }

    @Test
    public void testShouldGiveTheFirstLastRepresentationToAllGuests() throws Exception {
        Guests guests = Guests.parseGuests(data1);
        assertEquals(3,guests.getAllguests().size());
    }

    @Test
    public void testShouldGetTheGuestsFilteredByCountry() throws Exception {
        Guests guests = Guests.parseGuests(data1);
        assertEquals(2,guests.getSameCountry("Bangladesh").getAllguests().size());
    }

    @Test
    public void testShouldGetTheGuestsFilteredByAge() throws Exception {
        Guests guests = Guests.parseGuests(data);
        assertEquals(2,guests.getOlderThan(20).getAllguests().size());
    }

    @Test
    public void testShouldGetTheGuestsFilteredByCountryAndAge() throws Exception {
        Guests guests = Guests.parseGuests(data);
        assertEquals(1,guests.getCountryWiseOlderThan("Bangladesh",20).getAllguests().size());
    }
}
