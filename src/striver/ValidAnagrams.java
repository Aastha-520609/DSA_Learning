package striver;

public class ValidAnagrams {
	public static boolean checkAnagram(String real, String goal) {
		if(real.length() != goal.length()) {
			return false;
		}
		
		int[] charCount = new int[26];
		
		for(int i=0; i<real.length(); i++) {
			charCount[real.charAt(i) - 'a']++;
			charCount[goal.charAt(i) - 'a']--;
		}
		
		for(int count: charCount) {
			if(count != 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String args[]) {
	   System.out.println(checkAnagram("anagram", "nagrama"));
	   System.out.println(checkAnagram("rat", "car"));
	}

}
