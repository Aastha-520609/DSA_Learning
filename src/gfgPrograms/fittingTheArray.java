package gfgPrograms;
import java.util.*;
public class fittingTheArray {
	public static int isFit (int arr[], int brr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0; i<n; i++)
        {
            if(arr[i] > brr[i])
            {
               return 0; 
            }
        }
        return 1;
    }
	public static void main(String[] args)
	{
	  int[] arr = {7,5,3,2};
	  int[] brr = {5, 4, 8, 7};
	  int n = 4;
	  System.out.print(isFit(arr,brr,n));
	}
}
