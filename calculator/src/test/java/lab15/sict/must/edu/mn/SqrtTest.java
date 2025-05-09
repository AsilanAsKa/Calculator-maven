package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    void testSqrtPositive() {
        Sqrt calc = new Sqrt();
        assertEquals(5.0, calc.sqrt(25.0));
    }

    @Test
    void testSqrtNegative() {
        Sqrt calc = new Sqrt();
        assertThrows(IllegalArgumentException.class, () -> calc.sqrt(-1.0));
    }
}
