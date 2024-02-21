package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {
    private IntStack s1;

    @Before
    public void constructStackObjects() {
        s1 = new IntStack();
    }

    @Test
    public void testNewStackIsNotFull() {
        assertFalse(s1.isFull());
        assertTrue(s1.isEmpty());

    }

    @Test
    public void testFullStackIsFull() {
        for (int i = 0; i < s1.getCapacity(); i++) {
            s1.push(i);
        }
        assertTrue(s1.isFull());
        assertFalse(s1.isEmpty());
    }

    @Test
    public void notAsFull() {
        for (int i = 0; i < s1.getCapacity() - 1; i++) {
            s1.push(i);
        }
        assertFalse(s1.isFull());
    }

    @Test
    public void testPopReturnsPushedValue() {
        s1.push(1);
        s1.push(2);

        assertEquals(2, s1.pop());
        assertEquals(1, s1.pop());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void popOnEmptyStack() {
        s1.pop();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void pushOnFullStack() {
        int capacity = s1.getCapacity();
        
        for (int i = 0; i < capacity; i++) {
            s1.push(i);
        }
        s1.push(1);
    }

}
