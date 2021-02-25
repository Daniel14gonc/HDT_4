import org.junit.Test;

import static org.junit.Assert.*;

public class StackArrayListTest {

    @Test
    public void push() {
        StackArrayList<String> stacki = new StackArrayList<>();
        stacki.push("2");
        assertEquals("2", stacki.peek());
    }

    @Test
    public void pop(){
        StackArrayList<String> stacki = new StackArrayList<>();
        stacki.push("2");
        stacki.push("3");
        stacki.push("4");
        assertEquals("4", stacki.pop());
    }

    @Test
    public void empty() {
        StackArrayList<String> stacki = new StackArrayList<>();
        stacki.push("2");
        stacki.push("3");
        stacki.push("4");
        assertEquals(false, stacki.empty());
    }

    @Test
    public void size() {
        StackArrayList<String> stacki = new StackArrayList<>();
        stacki.push("2");
        stacki.push("3");
        stacki.push("4");
        assertEquals(3, stacki.size());
    }

    @Test
    public void peek() {
        StackArrayList<String> stacki = new StackArrayList<>();
        stacki.push("2");
        stacki.push("3");
        stacki.push("4");
        assertEquals("4", stacki.peek());
    }
}