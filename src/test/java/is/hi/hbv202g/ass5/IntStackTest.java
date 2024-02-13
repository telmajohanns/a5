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
    }

    @Test
    public void testFullStackIsFull() {
        for (int i = 0; i < s1.getCapacity(); i++) {
            s1.push(i);
        }
        assertTrue(s1.isFull());
    }

}
