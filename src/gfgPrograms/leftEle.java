package gfgPrograms;
import java.util.*;
public class leftEle {
	/*Question:
	 Given a array of length N, at each step it is reduced by 1 element. In the first step the maximum element would be removed, while in the second 
	 step minimum element of the remaining array would be removed, in the third step again the maximum and so on. Continue this till the array 
	 contains only 1 element. And find the final element remaining in the array.*/
	public static long leftElement(long arr[], long n)
    {
        // Your code goes here  
        Arrays.sort(arr);
        int low = 0;
        int high =(int) n - 1;
        int mid = (low+high)/2;
        return arr[mid];
    }
	public static void main(String[] args)
	{
		long n = 7;
		long arr[] = {7,8,3,4,2,9,5};
		long ans = leftElement(arr,n);
		System.out.print(ans);
		
	}

}
