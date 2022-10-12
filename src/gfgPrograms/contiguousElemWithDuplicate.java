package gfgPrograms;
import java.util.*;
public class contiguousElemWithDuplicate {
	public static int areElementsContiguous (int arr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        int temp = arr[0];
        for(int i=1; i<n; i++)
        {
           if(arr[i] != temp)
           {
               if(temp+1 == arr[i])
               {
                   temp = arr[i];
               }
               else
               {
                   return 0;
               }
           }
        }
        return 1;
    }
	public static void main(String[] args)
	{
	  int[] arr = {5, 2, 3, 6, 4, 4, 6, 6};
	  System.out.print(areElementsContiguous(arr,8));
	}
}
