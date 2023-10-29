package revision;
import java.util.*;
public class countOfSubstring {
	public static int freqSubstring(String text, String pattern)
	{
		int N = text.length();
		int M = pattern.length();
		int j;
		int count = 0;
		for(int i=0; i<=N-M; i++)
		{
			for(j = 0; j<M; j++)
			{
				if(text.charAt(i+j) != pattern.charAt(j))
				{
					break;
				}
			}
			if(j == M)
			{
				count++;
				j=0;
			}
		}
		return count;
	}
	public static void main(String args[])
	{
	  String text = "geeksforgeeksgeeksforgeekkks";
	  String pattern = "geeks";
	  System.out.println(freqSubstring(text, pattern));
	}
}
