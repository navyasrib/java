package designTest;

import design.BorderRepresentation;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class BorderRepresentationTest {
    @Test
    public void testShouldRepresentThePersonDetailsInTemplateWithBorder() throws Exception {
        HashMap<String, String> lines = new HashMap<>();
        lines.put("first", "Mr Sathi Wang");
        lines.put("second", "Hangun, Sangun");
        lines.put("third", "Africa");
        BorderRepresentation border = new BorderRepresentation("+", "-", "|");
        StringBuilder alignedInfo = border.generate(lines);
        assertEquals("+----------------+\n" +
                "| Mr Sathi Wang  |\n" +
                "|----------------|\n" +
                "| Hangun, Sangun |\n" +
                "| Africa         |\n" +
                "+----------------+", alignedInfo.toString());
    }
}
