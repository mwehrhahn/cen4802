package com.mycompany.app;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


/**
 * Unit test for Fibonacci Class.
 */
public class FibonacciTest {

    @Test
    @DisplayName("Test Fibonacci Base Cases")
    public void testFibonacciBaseCases() {
        Assertions.assertEquals(0, Fibonacci.fibonacci(0));
        Assertions.assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    @DisplayName("Test Fibonacci Recursion")
    public void testFibonacciRecursion() {
        Assertions.assertEquals(55, Fibonacci.fibonacci(10));
    }

    @Test
    @DisplayName("Test Fibonacci With Negative Number")
    public void testFibonacciWithNegativeNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }

    @Test
    @DisplayName("Test Fibonacci With Large Input")
    public void testFibonacciWithLargeInput() {
        Assertions.assertEquals(832040, Fibonacci.fibonacci(30));
    }

    @DisplayName("Test Fibonacci From CSV File Source Method")
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldTestFibonacciFromCSVFileSource(int index, int expected) {
        Assertions.assertEquals(expected, Fibonacci.fibonacci(index));
    }

    @AfterEach
    public void tearDown() {
        System.out.println("This should print after each test");
    }
}
