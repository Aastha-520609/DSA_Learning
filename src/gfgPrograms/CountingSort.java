package gfgPrograms;
import java.util.*;
public class CountingSort {
	 public static String countSort(String arr)
	    {
	        // code here
	        StringBuilder s = new StringBuilder("");
	        char[] a = new char[arr.length()];
	        for(int i=0; i<arr.length(); i++)
	        {
	            a[i] = arr.charAt(i);
	        }
	        Arrays.sort(a);
	        for(int i=0; i<a.length; i++)
	        {
	           s.append(a[i]);
	        }
	        return s.toString();
	    }
	public static void main(String[] args)
	{
		String str = "geeksforgeeks";
		System.out.print(countSort(str));
	}
}
