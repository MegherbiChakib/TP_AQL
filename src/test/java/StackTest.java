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


    //le teste isEmpty() == false
    @Test
    public void isEmptyFalseTest(){
        stack.push(1);
        assertFalse(stack.isEmpty());
    }


    @Test
    public void testPushAndPop() {

        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
        // Make sure peek doesn't remove the element
        assertEquals(2, stack.peek());
    }

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSize() {
        Stack stack = new Stack();
        assertEquals(0, stack.size());
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }

    @Test
    public void testEmptyPop() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    public void testEmptyPeek() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::peek);
    }

    @Test
    public void testExpandArray() {
        Stack stack = new Stack();
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        // Stack should have expanded during these pushes
        assertEquals(14, stack.pop());
    }
}
