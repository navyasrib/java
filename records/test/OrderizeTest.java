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
        List list = o.arrange(data);
        assertEquals(3,list.size());
        System.out.println("list = " + list);
    }

    @Test
    public void testshouldGiveAllThePersonNamesInFirstLastFormat() throws Exception {
        String data = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\n";
        Orderize o = new Orderize();
        List list = o.arrange(data);
//        Person[] names = o.getFitstLastNames();
//        assertEquals();
    }
}
