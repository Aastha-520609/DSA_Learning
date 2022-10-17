package gfgPrograms;
import java.util.*;
public class powerOf2 {
	 public static int isPowerofTwo(long n){
	        // Your code here
	        if(n == 0)
	        {
	            return 0;
	        }
	        while(n != 1)
	        {
	            if(n % 2 != 0)
	            {
	             return 0;   
	            }
	            n = n / 2;
	        }
	        return 1;
	    }
	public static void main(String[] args)
	{
	  long n = 98;
	  System.out.print(isPowerofTwo(n));
	}
}
