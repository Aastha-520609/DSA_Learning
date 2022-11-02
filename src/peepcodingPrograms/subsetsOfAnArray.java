package peepcodingPrograms;
import java.util.*;
public class subsetsOfAnArray {
	public static void subset(char arr[], int n)
	{
		int limit = (int)Math.pow(2, arr.length);
		for(int i=0; i<limit; i++)
		{
			String set = "";
			int temp = i;
			for(int j= arr.length -1; j>=0; j--)
			{
				int rem = temp % 2;
				temp = temp/2;
				if(rem == 0)
				{
					set = "_\t" + set;
				}
				else
				{
					set = arr[j] + "\t" + set;
				}
			}
			System.out.println(set);
		}
	}
	public static void main(String[] args)
	{
	  char[] arr = {'a','b','c'};
	  int n = arr.length;
	  subset(arr,n);
	}
}
