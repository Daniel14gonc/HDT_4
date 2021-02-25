import org.junit.Test;

import static org.junit.Assert.*;

public class StackSinglyLinkedListTest {

    @Test
    public void peek() {
        List<Integer> list;
        ListFactory<Integer> listFactory = new ListFactory<Integer>();
        list = listFactory.getList(3);
        StackList<Integer> stacki = new StackList<>(list);
        stacki.push(12);
        assertEquals(12, (int)stacki.peek());
    }

    @Test
    public void push() {
        List<Integer> list;
        ListFactory<Integer> listFactory = new ListFactory<Integer>();
        list = listFactory.getList(3);
        StackList<Integer> stacki = new StackList<>(list);
        stacki.push(12);
        assertEquals(12, (int)stacki.peek());
    }

    @Test
    public void pop() {
        List<Integer> list;
        ListFactory<Integer> listFactory = new ListFactory<Integer>();
        list = listFactory.getList(3);
        StackList<Integer> stacki = new StackList<>(list);
        stacki.push(12);
        stacki.push(13);
        stacki.push(14);
        assertEquals(14, (int)stacki.pop());
    }

    @Test
    public void size() {
        List<Integer> list;
        ListFactory<Integer> listFactory = new ListFactory<Integer>();
        list = listFactory.getList(3);
        StackList<Integer> stacki = new StackList<>(list);
        stacki.push(12);
        stacki.push(13);
        stacki.push(14);
        assertEquals(3, stacki.size());
    }
}