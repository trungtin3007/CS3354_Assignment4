import org.junit.Test;
import static org.junit.Assert.*;

public class ChatGPTTest {

    @Test
    public void testPushAndPeek() {
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);

        // Check peek returns last pushed element
        assertEquals(20, s.peek());

        // Check size after pushes
        assertEquals(2, s.size());
    }

    @Test
    public void testPop() {
        Stack s = new Stack(2);
        s.push(5);
        s.push(15);

        // Pop should return last pushed element
        assertEquals(15, s.pop());

        // Size should reduce
        assertEquals(1, s.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testPopEmptyThrows() {
        Stack s = new Stack(1);
        s.pop();
    }

    @Test(expected = IllegalStateException.class)
    public void testPushFullThrows() {
        Stack s = new Stack(1);
        s.push(100);
        s.push(200);
    }

    @Test
    public void testIsEmptyAndIsFull() {
        Stack s = new Stack(2);

        // Initially empty
        assertTrue(s.isEmpty());
        assertFalse(s.isFull());

        s.push(1);
        s.push(2);

        // Now full
        assertTrue(s.isFull());
        assertFalse(s.isEmpty());

        s.pop();

        // After pop
        assertFalse(s.isFull());
        assertFalse(s.isEmpty());
    }
}
