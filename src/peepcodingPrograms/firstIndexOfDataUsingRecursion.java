package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class firstIndexOfDataUsingRecursion {
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
	  int res = firstIndex(arr,0,data);
	  System.out.println(res);
	}
    public static int firstIndex(int[] arr, int index, int x)
    {
    	if(index == arr.length)
    	{
    		return -1;
    	}
    	//This concept goes to the end of the array and starting comparing element from last to first.
    	/*int fiisa = firstIndex(arr, index+1, x);
    	if(arr[index] == x)
    	{
    		return arr[index];
    	}
    	else
    	{
    		return fiisa;	
    	}*/
    	//This does the comparision while going from start to end
    	if(arr[index] == x)
    	{
    		return index;
    	}
    	else
    	{
    		int fiisa = firstIndex(arr, index+1, x);
    		return fiisa;	
    	}
    }
}
