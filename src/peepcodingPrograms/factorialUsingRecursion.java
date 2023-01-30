package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class factorialUsingRecursion {
	public static int fact(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return(n*fact(n-1));
		}
	}
	public static void main(String args[])
	{
		int n = 5;
		int f = fact(n);
		System.out.println(f);
	}
}
