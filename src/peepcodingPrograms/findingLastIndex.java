package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class findingLastIndex {
	public static void main(String args[])
	{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Size of an array: ");
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  System.out.println("Enter Elements of an array: ");
		  for(int i=0; i<arr.length; i++)
		  {
			arr[i] = sc.nextInt();  
		  }
		  System.out.println("Enter data whose first index is to be found: ");
		  int data = sc.nextInt();
		  int res = lastIndex(arr,0,data);
		  System.out.println(res);
	}
	public static int lastIndex(int arr[], int index, int x)
	{
		if(index == arr.length)
		{
			return -1;
		}
		int liisa = lastIndex(arr, index+1, x);
		if(liisa == -1)
		{
			if(arr[index] == x)
			{
				return index;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return liisa;
		}
	}
}
