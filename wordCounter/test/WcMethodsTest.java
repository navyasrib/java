import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WcMethodsTest {
    @Test
    public void should_give_the_default_result_for_a_file() {
        WcMethods result = new WcMethods();
        String data = "hi, interesting news I'm working on IDEA text editor\n";
        String fileName = "sample.txt";
        result.operate(data, fileName);
        System.out.println("result = " + result);
        String expected = "1    9   53  "+fileName;
        assertEquals(result,(result));
    }

}
