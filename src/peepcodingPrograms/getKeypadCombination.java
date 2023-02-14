package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class getKeypadCombination {
	public static void main(String args[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		ArrayList<String> words = getKPC(str);
		System.out.println(words);
	}
	static String[] codes = {".;", "abc", "def", "ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static ArrayList<String> getKPC(String str)
	{
		if(str.length() == 0)
		{
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		char ch = str.charAt(0); // 6
		String ros = str.substring(1); // 78
		
		ArrayList<String> rres = getKPC(ros); // 6 words of 78
		ArrayList<String> mres = new ArrayList<>();
		
		String codeforch = codes[ch - '0']; // taking value of 6 index
		for(int i=0; i<codeforch.length(); i++) //pqrs
 		{
			char chcode = codeforch.charAt(i);
			for(String rstr: rres)
			{
				mres.add(chcode + rstr);
			}
		}
		return mres;
	}

}
