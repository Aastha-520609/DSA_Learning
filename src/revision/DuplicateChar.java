package revision;
import java.util.*;
public class DuplicateChar {
	public static String removeDuplicate(String s) {
		HashSet<Character> set = new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		for(char ch: s.toCharArray()) {
				if(!set.contains(ch)) {
					result.append(ch);
					set.add(ch);
				}
			}
		return result.toString();
	}
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(removeDuplicate(str));
	}
}
