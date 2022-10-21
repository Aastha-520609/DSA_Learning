package gfgPrograms;
import java.util.*;
public class cyclicRotateByOne {
	public static void rotate(int arr[], int n)
    {
        int last_num = arr[n-1];
        for(int i=0; i<n; i++)
        {
            int temp = arr[i];
            arr[i] = last_num;
            last_num = temp;
        }
    }
	public static void main(String[] args)
	{
	  int[] arr = {1,2,3,4,5};
	  int n = 5;
	  rotate(arr,n);
	  for(int i=0; i<n; i++)
	  {
		  System.out.print(arr[i] + " ");
	  }
	}
}
