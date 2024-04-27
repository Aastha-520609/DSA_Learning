package revision;
import java.util.*;
import java.io.*;
public class SingleNumber {
	  public static int singleNumber(int[] nums) {
	        int xor = 0;
	        for(int i=0; i<nums.length; i++)
	        {
	            xor = xor ^ nums[i];
	        }
	        return xor;
	    }
	public static void main(String[] args)
	{
		int[] arr = new int[] {2,4,1,2,4};
		System.out.println(singleNumber(arr));
		
	}

}
