import java.io.*;
import java.math.*;
import java.util.*;

public class Fibonacci{
	public static int fibonacciRecursion(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
	}

	public static int fibonacciDP(int n){
		int[] memo = new int[n+2];
		memo[0]=0;
		memo[1] = 1;
		for (int i = 2; i <= n; i++){
			memo[i] = memo[i-1]+memo[i-2];
		}
		//System.out.println("final: " + memo[n-1]);
		return memo[n];
	}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = scan.nextInt();

		final long startTime = System.nanoTime();
		int fibo = fibonacciRecursion(n);
		System.out.println("The fibonacci number of " + n + " is " + fibo);
		final long duration = System.nanoTime() - startTime;
		System.out.println("Time to run Recursive Fibonacci:" + duration*1000);
		
		final long startTime1 = System.nanoTime();
		int fiboDP = fibonacciDP(n);
		System.out.println("The fibonacci number of " + n + " is " + fiboDP);
		final long duration1 = System.nanoTime() - startTime1;
		System.out.println("Time to run DP Fibonacci:" + duration1*1000);
	}
}