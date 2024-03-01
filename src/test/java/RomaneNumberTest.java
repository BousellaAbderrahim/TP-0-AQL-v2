
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RomaneNumberTest {
    @Test
    public void convertShouldReturnArabicNumerals(){
        RomaneNumber roman = new RomaneNumber();
        int result = roman.convert("XX");

        Assertions.assertEquals(20, result);
    }
}
