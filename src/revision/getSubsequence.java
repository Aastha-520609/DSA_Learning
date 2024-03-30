package revision;
import java.util.*;
public class getSubsequence {
	public static ArrayList<String> subsequence(String str)
	{
		//Base case
		if(str.length() == 0) 
		{
		  ArrayList<String> bres = new ArrayList<>();
		  bres.add("");
		  return bres;
		}
		
		char ch = str.charAt(0);
		String restOfString = str.substring(1);
		
		ArrayList<String> resultOfrestOfString = subsequence(restOfString);
		
		ArrayList<String> newList = new ArrayList<>();
		for(String val: resultOfrestOfString)
		{
			newList.add("_"+ val);
		}
		
		for(String val: resultOfrestOfString)
		{
			newList.add(ch + val);
		}
		
		return newList;
	}
	public static void main(String[] args)
	{
		String str = "abc";
		ArrayList<String> result = subsequence(str);
		System.out.println(result);
	}

}
