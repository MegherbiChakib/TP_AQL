import org.example.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RomanNumeralTest {
    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }
    @Test
    public void numberWithManyDigits() {
        // se Test est faut car la partie car il manque le "" = "" dans
        //if(currentNumber > next)
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }
    @Test
    public void numberWithManyDigits_Suces() {
        // se Test est faut car la partie car il manque le "" = "" dans
        //if(currentNumber > next)
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convertModified("VIII");
        Assertions.assertEquals(8, result);
    }
}
