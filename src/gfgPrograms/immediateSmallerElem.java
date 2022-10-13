package gfgPrograms;
import java.util.*;
public class immediateSmallerElem {
	public static void immediateSmaller(int arr[], int n) {
        for(int i=0; i<n; i++)
        {
            if(i+1 < n && arr[i+1] < arr[i])
            {
                arr[i] = arr[i+1];
            }
            else
            {
                arr[i] = -1;
            }
        }
    }
	public static void main(String[] args)
	{
	  int[] arr = {4, 2, 1, 5, 3};
	  immediateSmaller(arr,5);
	  for(int i=0; i<5; i++)
	  {
		  System.out.print(arr[i] + " ");
	  }
	}
}
