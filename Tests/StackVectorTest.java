import org.junit.Test;

import static org.junit.Assert.*;

public class StackVectorTest {

    @Test
    public void push() {
        StackVector<String> stacki = new StackVector<>();
        stacki.push("2");
        assertEquals("2", stacki.peek());
    }

    @Test
    public void pop() {
        StackVector<String> stacki = new StackVector<>();
        stacki.push("2");
        assertEquals("2", stacki.pop());
    }

    @Test
    public void peek() {
        StackVector<String> stacki = new StackVector<>();
        stacki.push("2");
        stacki.push("3");
        stacki.push("4");
        assertEquals("4", stacki.peek());
    }

    @Test
    public void size() {
        StackVector<String> stacki = new StackVector<>();
        stacki.push("2");
        stacki.push("3");
        stacki.push("4");
        assertEquals(3, stacki.size());
    }
}