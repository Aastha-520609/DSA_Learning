package striver;
import java.util.HashMap;
import java.util.ArrayList;

public class SortCharacterByFrequency {
	public static String countFreq(String str) {
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i), 0) + 1);
		}
		
		ArrayList<Character> lst = new ArrayList<>(hmap.keySet());
		lst.sort((a,b) -> hmap.get(b) - hmap.get(a));
		
		StringBuilder sb = new StringBuilder();
		for(char ch: lst) {
			int freq = hmap.get(ch);
			for(int i=0; i<freq; i++) {
				sb.append(ch);
			}
		}
		
		return sb.toString();
		
	}
	public static void main(String args[]) {
		System.out.println(countFreq("tree"));
		System.out.println(countFreq("cccaaa"));
		System.out.println(countFreq("Aabb"));
	}

}
