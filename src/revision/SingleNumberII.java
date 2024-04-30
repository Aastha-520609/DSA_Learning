package revision;
import java.util.*;
import java.io.*;
public class SingleNumberII {
	public static int singleNumber(int[] arr)
	{
		int ones = 0;
		int twos = 0;
		for(int i=0; i<arr.length-1; i++)
		{
			ones = (ones ^ arr[i]) & ~twos;
			twos = (twos ^ arr[i]) & ~ones;
		}
		return ones;
	}
	public static void main(String[] args)
	{
	  int[] arr = new int[] {4,4,1,2,2,4,2};
	  System.out.println(singleNumber(arr));
	}

}
