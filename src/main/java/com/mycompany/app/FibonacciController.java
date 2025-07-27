package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FibonacciController {

    private static final Logger logger = LoggerFactory.getLogger(FibonacciController.class);

    @GetMapping("/")
    public String home() {
        return "Welcome to Fibonacci Calculator!";
    }
    @GetMapping("/fibonacci")
    public long getFibonacci(@RequestParam(name="n") int n) {
        logger.info("Received request for Fibonacci of n = {}", n);
        if (n < 0)
            throw new IllegalArgumentException("n must be non-negative");
        long result = Fibonacci.fibonacci(n);
        logger.info("Fibonacci of n = {} is {}", n, result);
        return result;
    }


}
