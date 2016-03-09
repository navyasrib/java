import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class LabelStylesTest {
    @Test
    public void testAllLabelsStylesShoulsBeInHashMap() throws Exception {
        String data = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\n";
        Invitees invitees = new Invitees();
        invitees.createPerson(data);
        LabelStyles labelStyles = new LabelStyles(invitees);
        labelStyles.mapLables();
        labelStyles.mapLables("bangladesh");
        HashMap<String,String> allMethodsResult = labelStyles.getLables();
        assertTrue(allMethodsResult.containsKey("firstLast"));
        assertTrue(allMethodsResult.containsKey("lastFirst"));
        assertTrue(allMethodsResult.containsKey("firstCountry"));
        assertTrue(allMethodsResult.containsKey("lastCountry"));
    }
}
