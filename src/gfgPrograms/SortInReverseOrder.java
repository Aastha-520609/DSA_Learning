package gfgPrograms;
import java.util.*;
public class SortInReverseOrder {
	 public static String ReverseSort(String str) 
	    { 
	        // code here
	        char[] a = str.toCharArray();
	        Arrays.sort(a);
	        int n = a.length;
	        char t;
	        for(int i=0; i<n/2; i++)
	        {
	            t = a[i];
	            a[i] = a[n-i-1];
	            a[n-i-1] = t;
	        }
	        return String.valueOf(a);
	    }
	public static void main(String[] args)
	{
		String str = "cdeba";
		String s = ReverseSort(str);
		System.out.println(s);
	}
    
}
