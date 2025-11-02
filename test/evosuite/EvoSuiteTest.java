import org.junit.Test;
import static org.junit.Assert.*;

public class EvoSuiteTest {

    @Test
    public void testConstructor() {
        Stack stack = new Stack(10);
        assertNotNull(stack);
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void testPush() {
        Stack stack = new Stack(5);
        stack.push(100);
        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPushUntilFull() {
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertTrue(stack.isFull());
        assertEquals(3, stack.size());
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack(5);
        stack.push(42);
        assertEquals(42, stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    public void testPop() {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    public void testIsFullAndIsEmpty() {
        Stack stack = new Stack(2);
        stack.push(5);
        stack.push(10);
        assertFalse(stack.isEmpty());
        assertTrue(stack.isFull());
    }

    @Test
    public void testPopMakesNotFull() {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertFalse(stack.isFull());
    }

    @Test
    public void testMultiplePeeks() {
        Stack stack = new Stack(5);
        stack.push(100);
        stack.push(200);
        stack.push(300);
        assertEquals(300, stack.peek());
        assertEquals(3, stack.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testPushWhenFull() {
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }

    @Test(expected = IllegalStateException.class)
    public void testPopWhenEmpty() {
        Stack stack = new Stack(5);
        stack.pop();
    }

    @Test(expected = IllegalStateException.class)
    public void testPeekWhenEmpty() {
        Stack stack = new Stack(5);
        stack.peek();
    }

    @Test
    public void testPushMany() {
        Stack stack = new Stack(10);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        assertEquals(10, stack.size());
        assertTrue(stack.isFull());
    }

    @Test
    public void testMultipleOperations() {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testSingleElement() {
        Stack stack = new Stack(1);
        stack.push(99);
        assertTrue(stack.isFull());
        assertEquals(99, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testLargeCapacity() {
        Stack stack = new Stack(100);
        assertFalse(stack.isFull());
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }
}
