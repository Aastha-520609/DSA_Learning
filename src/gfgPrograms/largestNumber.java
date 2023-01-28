package gfgPrograms;
import java.util.*;
import java.io.*;
public class largestNumber {
	public static String MaxNumber(long arr[], long n)
    {
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length - 1; i>=0; i--)
        {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
	public static void main(String args[])
	{
		long n = 5;
		long arr[] = {9, 0, 1, 3, 0};
		System.out.println(MaxNumber(arr,n));
	}
}
