package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        System.out.print("Enter the number of fibonacci numbers: ");
        input = sc.nextInt();

        long result = Fibonacci.fibonacci(input);
        logger.info("Result: {}", result);

        System.out.println("Fibonacci of " + input + " is " + result);
    }
}
