package com.mycompany.app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1;
        System.out.println("Enter a number to get its Fibonacci number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        System.out.print(fibonacci.fibonacci(num1));
    }
}
