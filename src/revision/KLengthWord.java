package revision;
import java.util.*;
import java.io.*;
public class KLengthWord {
	public static void solution(int current_char, String unique_str, int selection, int total_selection, Character[] spots)
	{
		if(current_char == unique_str.length())
		{
			if(selection == total_selection)
			{
				for(int i=0; i<spots.length; i++)
				{
					System.out.print(spots[i]);
				}
				System.out.println();
			}
			return;
		}
		char ch = unique_str.charAt(current_char);
		for(int i=0; i<spots.length; i++)
		{
           if(spots[i] == null)
           {
        	   spots[i] = ch;
        	   solution(current_char + 1, unique_str, selection + 1, total_selection, spots);
        	   spots[i] = null;
           }
		}
		
		solution(current_char + 1, unique_str, selection + 0, total_selection, spots);
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
		
		Character[] spots = new Character[k];
		solution(0, unique_str, 0, k, spots);
	}

}
