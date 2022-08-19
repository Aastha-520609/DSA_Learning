package gfgPrograms;
import java.util.*;
public class ArrangingArray {
	    public static void Rearrange(long a[], long n)
	    {
	        // Your code goes here
	        ArrayList<Long> array = new ArrayList<>();
	        for(int i=0; i<n; i++)
	        {
	            if(a[i]<0)
	            {
	                array.add(a[i]);
	            }
	        }
	        for(int j=0; j<n; j++)
	        {
	            if(a[j]>=0)
	            {
	                array.add(a[j]);
	            }
	        }
	        for(int k=0; k<array.size(); k++)
	        {
	           System.out.println(array.get(k));
	        }
	    }
	public static void main(String[] args)
	{
		int n = 4;
		long array[] = {-3,2,3,-2};
		Rearrange(array,n);
	}

}
