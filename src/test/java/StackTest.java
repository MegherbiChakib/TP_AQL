import org.example.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StackTest {

    public Stack stack;
    @BeforeEach
    void setup(){
        stack =new Stack();
    }

    //le teste isEmpty() == true
     @Test
    public void isEmptyTrueTest(){
        assertTrue(stack.isEmpty());
    }

    //le teste push()
    @Test
    public void PushTest(){

    }

    //le teste isEmpty() == false
    @Test
    public void isEmptyFalseTest(){
        assertFalse(stack.isEmpty());
    }
}
