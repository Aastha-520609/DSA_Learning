package revision;
import java.util.*;
import java.io.*;
public class StringPermutation {
	public static void permutations(int current_item, int total_item, HashMap<Character, Integer> fmap, String ans)
	{
		if(current_item > total_item)
		{
			System.out.println(ans);
			return;
		}
		
		for(char ch: fmap.keySet())
		{
			if(fmap.get(ch) > 0)
			{
				fmap.put(ch, fmap.get(ch) - 1);
				permutations(current_item + 1, total_item, fmap, ans + ch);
				fmap.put(ch, fmap.get(ch) + 1);
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		HashMap<Character, Integer> fmap = new HashMap<>();
		for(char ch: str.toCharArray())
		{
			if(fmap.containsKey(ch))
			{
				fmap.put(ch, fmap.get(ch) + 1);
			}
			else
			{
				fmap.put(ch, 1);
			}
		}
		
		permutations(1, str.length(), fmap, " ");
	} 
}
