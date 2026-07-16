package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.add(2, 3);
        int expectedResult = 5;

        assertEquals(expectedResult, actualResult);
    }
}