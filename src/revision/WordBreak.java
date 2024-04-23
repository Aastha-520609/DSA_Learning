package revision;
import java.util.*;
import java.io.*;
public class WordBreak {
	 public static boolean wordBreak(String s, List<String> wordDict) {
	        if(s.isEmpty())
	        {
	            return true;
	        }
	        for(int i=1; i<=s.length(); i++)
	        {
	            String left = s.substring(0, i);
	            if(wordDict.contains(left))
	            {
	               String right = s.substring(i);
	               if(wordBreak(right, wordDict))
	               {
	                 return true;
	               }
	            }
	        }
	        return false;
	    }
	 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String> wordDict = new ArrayList<String>();
		for(int i=0; i<n; i++)
		{
			wordDict.add(sc.nextLine());
		}
		boolean result = wordBreak(s, wordDict);
	    System.out.println(result);
	}
}
