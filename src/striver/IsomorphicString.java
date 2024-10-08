package striver;
import java.util.HashMap;
public class IsomorphicString {
	public static boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		HashMap<Character, Character> hmapS = new HashMap<>();
		HashMap<Character, Character> hmapT = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			
			if(hmapS.containsKey(sChar)) {
				if(hmapS.get(sChar) != tChar) {
					return false;
				}
			}
			else {
				hmapS.put(sChar, tChar);
			}
			
			if(hmapT.containsKey(tChar)){
				if(hmapT.get(tChar) != sChar) {
					return false;
				}
			}
			else {
				hmapT.put(tChar, sChar);
			}
			
		}
		
		return true;
	}
	public static void main(String args[]) {
		String s = "foo";
		String t = "bar";
		System.out.println(isIsomorphic(s, t));
	}

}
