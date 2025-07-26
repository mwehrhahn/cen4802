package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fibonacci {
    /**
     * Method that calculates and returns the nth term of the Fibonacci sequence using recursion
     * @param n, the position of the term to calculate, 1-based index
     * @return the nth fibonacci number
     */

    private static final Logger logger = LoggerFactory.getLogger(Fibonacci.class);
    public static int fibonacci(int n)
    {
        logger.info("Fibonacci(n) = {}", n);
        if (n <= 1)
        {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
