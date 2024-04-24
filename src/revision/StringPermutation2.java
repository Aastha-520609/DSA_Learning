package revision;
import java.util.*;
import java.io.*;
public class StringPermutation2 {
	public static void permutation(int current_char, String str, Character[] place, HashMap<Character, Integer> lastOccurence)
	{
		if(current_char == str.length())
		{
			for(int i=0; i<place.length; i++)
			{
			  System.out.print(place[i]);
			}
			System.out.println();
			return;
		}
		
		char ch = str.charAt(current_char);
		int lo = lastOccurence.get(ch);
		
		for(int i = lo + 1; i < place.length; i++)
		{
			if(place[i] == null)
			{
				place[i] = ch;
				lastOccurence.put(ch, i);
				permutation(current_char + 1, str, place, lastOccurence);
				lastOccurence.put(ch, lo);
				place[i] = null;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		Character[] place = new Character[str.length()];
		HashMap<Character, Integer> lastOccurence = new HashMap<>();
		for(char ch: str.toCharArray())
		{
			lastOccurence.put(ch, -1);
		}
		
		permutation(0, str, place, lastOccurence);
	}
}
