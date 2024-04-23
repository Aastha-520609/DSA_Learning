package revision;
import java.util.*;
import java.io.*;
public class MaxNumAfterKSwaps {
	public static String swap(String str, int i, int j)
	{
		char ith = str.charAt(i);
		char jth = str.charAt(j);
		
		String left = str.substring(0, i);
		String middle = str.substring(i+1, j);
		String right = str.substring(j+1);
		
		return left + jth + middle + ith + right;
	}
	static String max;
	public static void findMaximum(String str, int K)
	{
		if(Integer.parseInt(str) > Integer.parseInt(max))
		{
			max = str;
		}
		
		if(K == 0)
		{
			return;
		}
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(str.charAt(j) > str.charAt(i))
				{
					str = swap(str, i, j);
					findMaximum(str, K-1);
					str = swap(str, i, j);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int K = sc.nextInt();
		max = str;
		findMaximum(str, K);
		System.out.println(max);
	}
}
