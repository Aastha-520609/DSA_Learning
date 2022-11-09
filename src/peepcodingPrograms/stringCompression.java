package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class stringCompression {
	public static String compression(String s)
	{
		String str = s.charAt(0) + ""; // or s.subString(0,1);
		for(int i=1; i<s.length(); i++)
		{
			char curr = s.charAt(i);
			char prev = s.charAt(i-1);
			
			if (curr != prev)
			{
				str += curr;
			}
		}
		return str;
	}
	/*public static String count(String s)
	{
		String str = s.charAt(0) + ""; // or s.subString(0,1);
		int count = 1;
		for(int i=1; i<s.length(); i++)
		{
			char curr = s.charAt(i);
			char prev = s.charAt(i-1);
			
			if (curr == prev)
			{
				count++;
			}
			else
			{
				//if count is greather than 1 then add it to string otherwise don't
				if(count > 1)
				{
					s += count;
					count = 1;
				}
				s += curr;
			}
		}
		if(count > 1)
		{
			s += count;
			count = 1;
		}
		return str;
	}*/
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner (System.in);
		String s = "aaabbbccdeeff";
		System.out.println(compression(s));
		//System.out.println(count(s));
	}
}
