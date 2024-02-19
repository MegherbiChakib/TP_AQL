import org.example.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    @Test
    public void AddTest(){
        Calculator calculator = new Calculator();
        int a =3 ;
        int b=2;
        Assertions.assertEquals(5,calculator.add(a,b));

    }
}
