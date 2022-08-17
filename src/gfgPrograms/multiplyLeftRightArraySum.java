package gfgPrograms;
import java.util.*;
public class multiplyLeftRightArraySum {
	 public static int multiply (int arr[], int n) {
	        //Complete the function
	        int left = 0;
	        for(int i=0; i<n/2; i++)
	        {
	            left = left + arr[i];
	        }
	        int right = 0;
	        for(int i=n/2; i<n; i++)
	        {
	            right = right + arr[i];
	        }
	        int mul = left * right;
	        return mul;
	    }
	public static void main(String args[])
	{
		int n = 4;
		int array[] = {1,2,3,4};
		int mul = multiply(array,n);
		System.out.println(mul);
	}

}
