import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrderizeTest {
    @Test
    public void testShouldGiveASetOfPersons() throws Exception {
        String data = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\n";
        Orderize o = new Orderize();
        List list = o.createPerson(data);
        assertEquals(3,list.size());
    }

    @Test
    public void testShouldGiveAllThePersonNamesInFirstLastFormat() throws Exception {
        String data = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\n";
        Orderize o = new Orderize();
        o.createPerson(data);
        String names = o.getFitstLastNames();
        assertEquals("Ms Julius Barrows\n" +
                "Ms Melody Dooley\n" +
                "Mr Gavin Hyatt\n",names);
    }

    @Test
    public void testShouldGiveAllThePersonNamesInLastFirstFormat() throws Exception {
        String data = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\n";
        Orderize o = new Orderize();
        o.createPerson(data);
        String names = o.getLastFirstNames();
        assertEquals("Ms Barrows, Julius\n" +
                "Ms Dooley, Melody\n" +
                "Mr Hyatt, Gavin\n",names);
    }
}
