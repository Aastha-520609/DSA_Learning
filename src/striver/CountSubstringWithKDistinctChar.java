package striver;
import java.util.HashMap;

public class CountSubstringWithKDistinctChar {
	public static int subStringCount(String str, int k) {
		if (k == 1) {
            return kDistinct(str, k);
        }
		
		return kDistinct(str, k) - kDistinct(str, k-1);
	}
	
	public static int kDistinct(String str, int k) {
		int n = str.length();
		int left = 0;
		int count = 0;
		
		HashMap<Character, Integer> hmap = new HashMap<>();
		for(int right = 0; right < n; right++) {
			char rightChar = str.charAt(right);
			hmap.put(rightChar, hmap.getOrDefault(rightChar, 0) + 1);
			
			while(hmap.size() > k) {
				char leftChar = str.charAt(left);
				hmap.put(leftChar, hmap.get(leftChar) - 1);
				if(hmap.get(leftChar) == 0) {
					hmap.remove(leftChar);
				}
				
				left++;
			}
			
			count += (right - left + 1);
		}
		
		return count;
		
	}
	public static void main(String args[]) {
		String str = "aba";
		int k = 2;
		System.out.println(subStringCount(str, k));
	}
}
