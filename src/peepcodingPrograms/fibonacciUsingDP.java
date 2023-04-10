package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class fibonacciUsingDP {
	public static int fib(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	public static int updatedFib(int n, int[] storedValue)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		
		//if in the storedValue array, the value of n is not equal to the zero then take the value of particular n from the storedValue.
		if(storedValue[n] != 0)
		{
			return storedValue[n];
		}
		
		int fib1 = updatedFib(n-1, storedValue);
		int fib2 = updatedFib(n-2, storedValue);
		int resFib = fib1 + fib2;
		
		storedValue[n] = resFib;
		return resFib;
		
	}
	public static void main(String args[])
	{
		int n = 6;
		int ansFib = updatedFib(n, new int[n+1]);
		System.out.println(ansFib);
	}

}
