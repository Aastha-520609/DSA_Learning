package gfgPrograms;
import java.util.*;
import java.io.*;

public class missingNumber {
   public static int missingNum(int A[], int N)
	   {
	         // Your code goes here
	         int total = (N*(N+1))/2;
	         for(int i=0; i<N-1; i++)
	         {
	            total = total - A[i];
	         }
	         return total;
	   }
	public static void main(String args[])
	{
		int N = 4;
	  	int A[] = {1,4,3};
	  	System.out.println(missingNum(A, N));
	}
}
