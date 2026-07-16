package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAAATest {

    // Test fixture shared by the test methods
    private Calculator calculator;

    // Runs before every test method
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created.");
    }

    // Runs after every test method
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator object removed.");
    }

    @Test
    public void testAdditionUsingAAA() {

        // Arrange: prepare the input and expected result
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        // Act: execute the method being tested
        int actualResult = calculator.add(firstNumber, secondNumber);

        // Assert: verify the actual result
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAdditionWithNegativeNumber() {

        // Arrange
        int firstNumber = 10;
        int secondNumber = -4;
        int expectedResult = 6;

        // Act
        int actualResult = calculator.add(firstNumber, secondNumber);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}