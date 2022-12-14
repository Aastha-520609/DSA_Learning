package peepcodingPrograms;
import java.util.*;
public class palindromeSubstring {
	public static boolean isPalindrome(String str)
	{
		int i = 0;
		int j = str.length() - 1;
		while(i <= j)
		{
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if(ch1 != ch2)
			{
				return false;
			}
			else
			{
				i++;
				j--;
			}
		}
		return true;
	}
	public static void solution(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<=str.length(); j++)
			{
				String ss = str.substring(i,j);
				if(isPalindrome(ss) == true)
				{
					System.out.println(ss);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		String s = "abccbc";
		solution(s);
	}
}
