package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        // Checks whether two values are equal
        assertEquals(5, 2 + 3);

        // Checks whether the condition is true
        assertTrue(5 > 3);

        // Checks whether the condition is false
        assertFalse(5 < 3);

        // Checks whether the value is null
        assertNull(null);

        // Checks whether the value is not null
        assertNotNull(new Object());
    }
}