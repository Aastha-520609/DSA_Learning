package revision;
import java.util.*;
import java.io.*;
public class KLengthWord2 {
	public static void solution(int current_item, int total_item, String unique_str, HashSet<Character> used, String ans)
	{
		if(current_item > total_item)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<unique_str.length(); i++)
		{
			char ch = unique_str.charAt(i);
			if(!used.contains(ch))
			{
				used.add(ch);
				solution(current_item + 1, total_item, unique_str, used, ans + ch);
				used.remove(ch);
			}
		}
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
		
		solution(1, k, unique_str, new HashSet<>(), "");
	}
}
