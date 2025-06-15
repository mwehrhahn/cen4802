package com.mycompany.app;

public class Fibonacci {
    /**
     * Method that calculates and returns the nth term of the Fibonacci sequence using recursion
     * @param n, the position of the term to calculate, 1-based index
     * @return the nth fibonacci number
     */
    public static int fibonacci(int n)
    {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n <= 1)
        {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
