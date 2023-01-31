package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class maxOfArrayUsingRecursion {
      public static void main(String args[])
      {
    	Scanner sc = new Scanner(System.in);
  		int n = sc.nextInt();
  		int[] arr = new int[n];
  		for(int i = 0; i < arr.length; i++)
  		{
  			arr[i] = sc.nextInt();
  		}
  		int max = maxOfArray(arr,0);
  		System.out.println(max);
      }
      public static int maxOfArray(int[] arr, int index)
      {
    	  if(index == arr.length - 1)
    	  {
    		  return arr[index];
    	  }
    	  int misa = maxOfArray(arr, index + 1);
    	  if(misa > arr[index])
    	  {
    		  return misa;
    	  }
    	  else
    	  {
    		  return arr[index];
    	  }
      }
}
