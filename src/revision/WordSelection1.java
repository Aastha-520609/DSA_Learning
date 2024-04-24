//Select K Distinct Characters without Repetation
package revision;
import java.util.*;
import java.io.*;
public class WordSelection1 {
	public static void solution(int i, String unique_str, int selection, int total_selection, String ans)
	{
		if(i == unique_str.length())
		{
			if(selection == total_selection)
			{
				System.out.println(ans);
			}
			return;
		}
		
		char ch = unique_str.charAt(i);
		
		solution(i+1, unique_str, selection + 1, total_selection, ans + ch);
		solution(i+1, unique_str, selection + 0, total_selection, ans + "");
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		
		HashSet<Character> unique = new HashSet<>();
		String unique_str = "";
		for(char ch: str.toCharArray())
		{
			if(unique.contains(ch) == false)
			{
				unique.add(ch);
				unique_str += ch;
			}
		}
		
		solution(0, unique_str, 0, k, "");
	}

}
