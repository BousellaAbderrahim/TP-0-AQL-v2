import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class FibonacciTest {
    @Test
    void NegatifFibonacciTerm(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> Fibonacci.fibonacci(-5));
    }
    @Test
    void zeroFibonacciTerm(){
        Assertions.assertEquals(0, Fibonacci.fibonacci(0));
    }
    @Test
    void PositifFibonacciTerm(){
        Assertions.assertEquals(1, Fibonacci.fibonacci(2));

    }
}