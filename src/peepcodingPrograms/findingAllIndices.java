package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class findingAllIndices {
	public static void main(String args[]) throws Exception
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
		  
		  //creating an array of its size
		  int[] idxarr = allIndices(arr, data, 0, 0);
		  
		  if(idxarr.length == 0)
		  {
			  System.out.println();
			  return;
		  }
		  for(int i=0; i<idxarr.length; i++)
		  {
			  System.out.println(idxarr[i]);
		  }
	   }
	public static int[] allIndices(int arr[], int x, int index, int fsof) //found so far
	{
		if(index == arr.length)
		{
			return new int[fsof];
		}
		
		if(arr[index] == x)
		{
			int[] idxarr = allIndices(arr, x, index+1, fsof+1);
			idxarr[fsof] = index;
			return idxarr;
		}
		else
		{
			int[] idxarr = allIndices(arr, x, index+1, fsof);
			return idxarr;
		}
	}
}
