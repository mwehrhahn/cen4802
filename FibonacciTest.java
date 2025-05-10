package cen4802;

public class FibonacciTest {

	public static int fibonacci(int n)
	{
		if (n <= 1)
		{
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		System.out.println("The " + n + "th term in the Fibonacci sequence is: " + fibonacci(n));

	}

}
