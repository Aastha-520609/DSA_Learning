package gfgPrograms;
import java.util.*;
public class fightingTheDarkness {
	public static long maxDays(long arr[], int n){
        // code here 
        Arrays.sort(arr);
        return arr[n-1];
    }
	public static void main(String[]  args)
	{
		int n = 5;
		long arr[] = {2,3,4,2,1};
		System.out.println(maxDays(arr,n));
	}

}
