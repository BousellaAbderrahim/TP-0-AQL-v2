import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PrimeTest {
    @Test
    void NumberIsNotPrimeInferiorAt2(){
        Assertions.assertFalse(Prime.isPrime(1));
        Assertions.assertFalse(Prime.isPrime(-6));
    }
    @Test
    void NumberIsNotPrimeSuperiorAt2(){
        Assertions.assertFalse(Prime.isPrime(6));
    }
    @Test
    void NumberIskPrimerSuperiorAt3(){
        Assertions.assertTrue(Prime.isPrime(7));
    }
    @Test
    void NUmberIsEquals2(){
        Assertions.assertTrue(Prime.isPrime(2));
    }
    @Test
    void NUmberIsEquals3(){
        Assertions.assertTrue(Prime.isPrime(3));
    }
}