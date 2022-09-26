package gfgPrograms;
import java.util.*;
public class divisibleBy4 {
	    public static int DivisibleBy4(String N)
	    {
	        // Your Code Here
	        int n = N.length();
	        if(n>1)
	        {
	            int last = N.charAt(n-1) - '0';
	            int secondLast = N.charAt(n-2) - '0';
	            int res = (secondLast*10 + last);
	            if(res % 4 == 0)
	            {
	                return 1;
	            }
	        }
	        return 0;
	    }
	public static void main(String[] args)
	{
		String N = "1124";
		int res = DivisibleBy4(N);
		System.out.println(res);
	}
}

