import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class InviteesTest {
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
    public void testShouldGiveAllThePersonNamesInFirstLastFormat() throws Exception {
        Invitees o = new Invitees();
        o.createPerson(data);
        String names = o.getFitstLastNames();
        assertEquals("Ms Julius Barrows\n" +
                "Ms Melody Dooley\n" +
                "Mr Gavin Hyatt\n", names);
    }

    @Test
    public void testShouldGiveAllThePersonNamesInLastFirstFormat() throws Exception {
        Invitees o = new Invitees();
        o.createPerson(data);
        String names = o.getLastFirstNames();
        assertEquals("Ms Barrows, Julius\n" +
                "Ms Dooley, Melody\n" +
                "Mr Hyatt, Gavin\n", names);
    }

    @Test
    public void testGetByCountry() throws Exception {
        Invitees o = new Invitees();
        o.createPerson(data);
        List names = o.getByCountry("Bangladesh");
        assertEquals("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh", names.get(0).toString());
    }

    @Test
    public void testGuestsGetByCountry() throws Exception {
        Invitees o = new Invitees();
        o.createPerson(data1);
        String names = o.getGuestsFirstLastCountry("Bangladesh");
        assertEquals("Ms Melody Dooley, Bangladesh\n" +
                "Mr Gavin Hyatt, Bangladesh\n",names);
    }

    @Test
    public void testGuestsGetByCountryCasual() throws Exception {
        Invitees o = new Invitees();
        o.createPerson(data1);
        String names = o.getGuestsByLastFirstCountry("Bangladesh");
        assertEquals("Ms Dooley, Melody, Bangladesh\n" +
                "Mr Hyatt, Gavin, Bangladesh\n",names);
    }

}
