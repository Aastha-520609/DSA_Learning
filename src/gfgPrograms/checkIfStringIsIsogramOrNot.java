package gfgPrograms;
import java.util.*;
public class checkIfStringIsIsogramOrNot {
	public static int isIsogram(String data){
	        //Your code here
	        //since no repeatation of element allowed so we use hashset
	        HashSet<Character> set = new HashSet<>();
	        for(int i=0; i<data.length(); i++)
	        {
	            char ch = data.charAt(i);
	            set.add(ch);
	        }
	        if(set.size() == data.length())
	        {
	            return 1;
	        }
	        return 0;
	    }
	public static void main(String[] args)
	{
		String data = "machine";
		System.out.print(isIsogram(data));
	}

}
