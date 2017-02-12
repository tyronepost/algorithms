package chapter1.section1;

import org.junit.Test;

import static org.junit.Assert.*;
import static chapter1.section1.Exercise20.factorial;

/**
 * Created by Tyrone on 2/12/2017.
 */
public class Exercise20Test {
    @Test
    public void test() {
        assertEquals(1, factorial(1));
        assertEquals(2, factorial(2));
        assertEquals(6, factorial(3));
        assertEquals(24, factorial(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException() {
        factorial(-1);
    }
}