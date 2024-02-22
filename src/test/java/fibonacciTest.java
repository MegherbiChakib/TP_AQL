import org.example.fibonacci;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class fibonacciTest {
    private fibonacci fibo;
    @BeforeEach
    public void initialisation(){
        fibo = new fibonacci();
    }

    //Tester si f(0) est juste
    @Test
    public void f0Test(){
        assertEquals(0,fibo.fibonacci(0));
    }

    //Tester si f(1) est juste
    @Test
    public void f1Test(){
        assertEquals(1,fibo.fibonacci(1));
    }

    //Tester si f(-n) est juste
    @Test
    public void negativeTest(){
        assertThrows(IllegalArgumentException.class,() -> fibo.fibonacci(-3));
    }
    @Test
    public void f2Test(){
        assertEquals(1,fibo.fibonacci(2));
    }


    @Test
    public void fiboTest(){
        assertEquals(21,fibo.fibonacci(8));
    }

}
