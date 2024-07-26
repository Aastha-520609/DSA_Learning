package revision;
import java.util.*;
public class RotateStr {
	public static boolean same(String str, String goal) {
		if(str.length() != goal.length()) {
			return false;
		}
		
		String res = str + str;
		//check if res have substring goal or not
		if(res.contains(goal)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) 
		{
			char ch = s.charAt(i);
		    hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
			
		}
		
		for(int i=0; i<t.length(); i++) 
		{
			char ch = t.charAt(i);
			if(!hmap.containsKey(ch)) 
			{
				return false;
			}
			else if(hmap.get(ch) == 1)
			{
				hmap.remove(ch);
			}
			else
			{
				hmap.put(ch, hmap.get(ch) - 1);
			}
		}
		return false;
	}
	
	public static String frequencySort(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }
        
        ArrayList<Character> lst = new ArrayList<Character>(hmap.keySet());
        Collections.sort(lst, (a,b) -> hmap.get(b) - hmap.get(a));
        
        StringBuilder sb = new StringBuilder();
        for(char ch: lst) {
        	int freq = hmap.get(ch);
        	for(int i=0; i<freq; i++) {
        		sb.append(ch);
        	}
        }
        
        return sb.toString();
    }
	
	public static String frequencySort2(String str) {
		
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
		}
		
		StringBuilder sb = new StringBuilder();
		while(!hmap.isEmpty()) {
			int max = 0;
			char maxChar = 'a';
			for(Map.Entry<Character, Integer> e: hmap.entrySet()) {
			   if(e.getValue() > max) {
				   max = e.getValue();
				   maxChar = e.getKey();
			   }
			}
			
			for(int i=0; i<max; i++) {
				sb.append(maxChar);
			}
			
			hmap.remove(maxChar);
		}
		
		return sb.toString();
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//String goal = sc.next();
		//System.out.println(same(str, goal));
		//System.out.println(isAnagram(str, goal));
		//System.out.println(frequencySort(str));
		System.out.println(frequencySort2(str));
	}
}
