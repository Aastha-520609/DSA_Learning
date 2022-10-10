package gfgPrograms;
import java.util.*;
public class subArrayWithGivenSum {
	public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> array = new ArrayList<Integer>();
        int sum = 0;
        int k = 0;
        for(int i=0; i<n; i++)
        {
            sum = sum + arr[i];
            if(sum == s)
            {
              array.add(k+1);
              array.add(i+1);
              break;
            }
            if(sum > s)
            {
                i = k;
                k++;
                sum = 0;
            }
        }
        
        if(array.size() == 0)
        {
            array.add(-1);
        }
       return array;
    }
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,7,5};
		int n = 5;
		int s = 12;
		System.out.print(subarraySum(arr,n,s));
	}
}
