package revision;
import java.util.*;
import java.io.*;
public class PalindromicPermutations {
	public static void solution(int current_state, int len, HashMap<Character, Integer> freq_map, Character odd, String ans)
	{
		if(current_state > len)
		{
			String reverse = "";
			for(int i = ans.length() - 1; i >= 0; i--)
			{
				reverse += ans.charAt(i);
			}
			
			String result = ans;
			if(odd != null)
			{
				result += odd;
			}
			result += reverse;
			
			System.out.println(result);
			return;
		}
		for(char ch: freq_map.keySet())
		{
			int freq = freq_map.get(ch);
			if(freq > 0)
			{
			    freq_map.put(ch, freq - 1);
			    solution(current_state + 1, len, freq_map, odd, ans + ch);
			    freq_map.put(ch,freq);	
			}
		}
	}
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  String str = sc.next();
	  HashMap<Character, Integer> freq_map = new HashMap<>();
	  for(int i=0; i<str.length(); i++)
	  {
		  char ch = str.charAt(i);
		  if(freq_map.containsKey(ch))
		  {
			  freq_map.put(ch, freq_map.get(ch) + 1);
		  }
		  else
		  {
			  freq_map.put(ch, 1);
		  }
	  }
	  
	  //Divide input by 2
	  Character odd = null;
	  int odds = 0;
	  int len = 0;
	  
	  for(char ch: freq_map.keySet())
	  {
		  int freq = freq_map.get(ch);
		  
		  if(freq % 2 == 1)
		  {
			  odd = ch;
			  odds++;
		  }
		  
		  freq_map.put(ch, freq / 2);
		  len += freq / 2;
	  }
	  
	  if(odds > 1)
	  {
		  System.out.println(-1);
		  return;
	  }
	  solution(1, len, freq_map, odd, "");
	}
}
