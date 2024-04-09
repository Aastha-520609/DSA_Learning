package revision;
import java.util.*;
public class keypadCombination {
	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
	public static ArrayList<String> getKPC(String str)
	{
		if(str.length() == 0)
		{
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		char ch = str.charAt(0); //6
		String restOfString = str.substring(1); //78
		//having faith that calling restOfString recursivly the 78 will gives its 6 output
		ArrayList<String> resultOfRestOfString = getKPC(restOfString);
		
		ArrayList<String> finalResult = new ArrayList<>();
		
		String particular = codes[ch - '0'];
		for(int i=0; i<particular.length(); i++)
		{
			char c = particular.charAt(i);
			for(String res: resultOfRestOfString)
			{
				finalResult.add(c + res);
			}
		}
		return finalResult;
	}
	public static void main(String[] args)
	{
		String str = "678";
		ArrayList<String> words = getKPC(str);
		System.out.println(words);
	}

}
