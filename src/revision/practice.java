package revision;
import java.util.*;
import java.io.*;
public class practice {
	public static bool isSorted(arr)
	{
		for(int i=0; i<n; i++)
		{
			if(arr[i] <= arr[i-1])
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
		int[] arr = {50,6,9,2,0,20};
		if(arr.length == 0)
		{
			System.out.println("Array is Empty");
		}
		int mx = arr[0];
		int mn = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			mx = Math.max(mx, arr[i]);
		}
		for(int i=0; i<arr.length; i++)
		{
			mn = Math.min(mn, arr[i]);
		}
		System.out.println(mx);
		System.out.println(mn);
		System.out.println(isSorted(arr));
	}
}
