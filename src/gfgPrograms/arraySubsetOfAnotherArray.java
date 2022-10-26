package gfgPrograms;
import java.util.*;
public class arraySubsetOfAnotherArray {
	 public static String isSubset( long a1[], long a2[], long n, long m) 
	    {
	        ArrayList<Long> alist = new ArrayList<>();
	        for(int i=0; i<n; i++)
	        {
	            alist.add(a1[i]);
	        }
	        for(int i=0; i<m; i++)
	        {
	          if(alist.contains(a2[i]))
	          {
	               alist.remove(a2[i]); 
	          }
	          else
	          {
	              return "No";
	          }
	        }
	        return "Yes";
	    }
	public static void main(String[] args)
	{
		long a1[] = {11, 1, 13, 21, 3, 7};
		long a2[] = {11, 3, 7, 1};
		long n = 6;
		long m = 4;
		System.out.print(isSubset(a1,a2,n,m));
		
	}

}
