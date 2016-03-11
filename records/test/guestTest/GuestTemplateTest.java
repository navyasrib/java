package guestTest;

import design.Template;
import guest.GuestTemplate;
import guest.Guests;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTemplateTest {
    private Guests guests;

    @Before
    public void setUp() throws Exception {
        String data = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\n";
        guests = Guests.parseGuests(data);
    }

    @Test
    public void testShouldGiveAListOfGuestDetailsInSpesifiedModel() throws Exception {
        Template template = new Template("title firstname lastname");
        GuestTemplate guestTemplate = new GuestTemplate(guests, template);
        assertEquals(3,guestTemplate.getGuestsWithTemplate().size());
    }

    @Test
    public void testShouldGiveAListOfGuestDetailsInSpesifiedModelIncludingBorder() throws Exception {
        Template template = new Template("title firstname lastname\ncity, state\ncountry");
        GuestTemplate guestTemplate = new GuestTemplate(guests, template);
        assertEquals(3,guestTemplate.getGuestsWithBorder().size());
    }
}
