package revision;
import java.util.*;
public class sumDiffOfArray {
	public static int[] sum(int[] array1, int[] array2, int n1, int n2)
	{
		int i = array1.length - 1;
		int j = array2.length - 1;
		int[] sum = new int[n1>n2? n1 : n2];
		int k = sum.length - 1;
		int carry = 0;
		
		while(k>=0)
		{
			int digit = carry; //initializing carry to digit
			if(i>=0)
			{
				digit = digit + array1[i];
			}
			
			if(j>=0)
			{
				digit = digit + array2[j];
			}
			
			carry = digit / 10;
			digit = digit % 10;
			
			sum[k] = digit;
			
			i--;
			j--;
			k--;
		}
		
		if(carry != 0)
		{
			System.out.print(carry+ " ");
		}
		
		for(int val: sum)
		{
			System.out.print(val + " ");
		}
		return sum;
	}
	
	public static void main(String args[]) {
		int n1 = 5;
		int[] array1 = {10,3,4,6,8};
		int n2 = 4;
		int[] array2 = {1,9,8,8};
		sum(array1, array2, n1, n2);
	}
}
