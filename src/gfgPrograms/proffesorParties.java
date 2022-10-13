package gfgPrograms;
import java.util.*;
public class proffesorParties {
	 public static String PartyType( long a[], int n)
	    {
	        // Your code goes here
	        Arrays.sort(a);
	        int count = 0;
	        for(int i=0; i<n-1; i++)
	        {
	            if(a[i] == a[i+1])
	            {
	                count++;
	            }
	        }
	        if(count == 0)
	        {
	            return "GIRLS";
	        }
	        return "BOYS";
	    }
	public static void main(String[] args)
	{
	  long a[] = {1, 2, 3, 4, 7};
	  int n = 5;
	  System.out.print(PartyType(a,n));
	}
}
