package gfgPrograms;
import java.util.*;
public class SortAString {
	public static String sort(String s) 
	    {
	        // code here
	        char a[] = s.toCharArray();
	        Arrays.sort(a);
	        return String.valueOf(a);
	    }
	public static void main(String[] args)
	{
		String inputString = "edcab";
		String str = sort(inputString);
		System.out.println(str);
	}
}
