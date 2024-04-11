package revision;
import java.util.*;
import java.io.*;
public class CryptarithmeticPuzzle {
	public static int getNum(String s, HashMap<Character, Integer> hmap)
	{
		String num = "";
		for(int i=0; i<s.length(); i++)
		{
			num += hmap.get(s.charAt(i));
		}
		
		return Integer.parseInt(num);
	}
	public static void solution(String unique, int idx, HashMap<Character, Integer> hmap, boolean[] usedNumbers, String s1, String s2, String s3)
	{
		if(idx == unique.length())
		{
			int num1 = getNum(s1, hmap);
			int num2 = getNum(s2, hmap);
			int num3 = getNum(s3, hmap);
			
			if(num1 + num2 == num3)
			{
				for(int i=0; i<26; i++)
				{
					char ch = (char)('a' + i); //making char from a to z
					if(hmap.containsKey(ch))
					{
						System.out.print(ch + "-" + hmap.get(ch) + " ");
					}
				}
				System.out.println();
			}
			return;
		}
		
		char ch = unique.charAt(idx);
		for(int num = 0; num <= 9; num++)
		{
			if(usedNumbers[num] == false)
			{
				hmap.put(ch, num);
				usedNumbers[num] = true;
				solution(unique, idx+1, hmap, usedNumbers, s1, s2, s3);
				usedNumbers[num] = false;
				hmap.put(ch, -1);
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		
		HashMap<Character, Integer> hmap = new HashMap<>();
		String unique = "";
		for(int i=0; i<s1.length(); i++)
		{
			if(!hmap.containsKey(s1.charAt(i))) {
				hmap.put(s1.charAt(i), -1);
				unique += s1.charAt(i);
			}
		}
		
		for(int i=0; i<s2.length(); i++)
		{
			if(!hmap.containsKey(s2.charAt(i))) {
				hmap.put(s2.charAt(i), -1);
				unique += s2.charAt(i);
			}
		}
		
		for(int i=0; i<s3.length(); i++)
		{
			if(!hmap.containsKey(s3.charAt(i))) {
				hmap.put(s3.charAt(i), -1);
				unique += s3.charAt(i);
			}
		}
		
		boolean[] usedNumbers = new boolean[10];
		solution(unique, 0, hmap, usedNumbers, s1, s2, s3);
	}
}
