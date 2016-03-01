import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPowerOf2Test {
    @Test
    public void testShouldGiveTrueIfANumberIsPowerOf2() throws Exception {
        IsPowerOf2 a = new IsPowerOf2();
        assertTrue(a.number(2));
    }

    @Test
    public void testForALargeNumber() throws Exception {
        IsPowerOf2 a = new IsPowerOf2();
        assertTrue(a.number(1024));
    }

    @Test
    public void testShouldGiveFalseIfANumberIsNotPowerOf2() throws Exception {
        IsPowerOf2 a = new IsPowerOf2();
        assertFalse(a.number(12345));
    }
    @Test
    public void testShouldGiveFalseZero() throws Exception {
        IsPowerOf2 a = new IsPowerOf2();
        assertFalse(a.number(0));
    }
}
