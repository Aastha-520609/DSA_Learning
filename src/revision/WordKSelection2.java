package revision;
import java.util.*;
import java.io.*;
public class WordKSelection2 {
	public static void solution(String unique_str, int current_selection, int total_selection, int lastOccurence, String ans)
	{
		if(current_selection > total_selection)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i = lastOccurence + 1; i < unique_str.length(); i++)
		{
			char ch = unique_str.charAt(i);
			solution(unique_str, current_selection + 1, total_selection, i, ans + ch);
		}
	}
	public static void main(String[] args) {
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
		solution(unique_str, 1, k, -1 , "");
	}

}
