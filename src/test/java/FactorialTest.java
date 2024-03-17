import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorialForN0() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialForNGreaterThan0() {
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));

    }

    @Test
    public void testFactorialForNegativeN() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> Factorial.factorial(-1));
    }


}
