package gfgPrograms;
import java.util.*;
import java.io.*;

public class FibonacciSeries {
	public static long[] Series(int N) {
        // code here
        long[] result = new long[N+1];
        result[0] = 0;
        result[1] = 1;
        
        int index = 2;
        
        fib(result,N,index); //calling fib(result,5,2)
        
        return result;
    }
    
    public static void fib(long[] result, int n, int i)
    {
        if(i > n)
        {
            return;
        }
        
        result[i] = result[i-1] + result[i-2]; //result[2] = 1+0 = 1
        
        fib(result, n, i+1); //fib(result, 5, 3) // goes on till i>n.
    }
	public static void main(String args[])
	{
		int N = 5;
		//Series(N);
		FibonacciSeries obj = new FibonacciSeries();
		long[] ans = obj.Series(N);
		for(long i: ans )
		{
			System.out.print(i + " ");
		}
		
	}
}
