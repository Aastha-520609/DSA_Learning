package revision;

import java.util.Arrays;

public class practice2 {
	public static int maxDifference(String str) {
		boolean allSame = true;
		char firstChar = str.charAt(0);
		for(char ch: str.toCharArray()) {
			if(ch != firstChar) {
				allSame = false;
				break;
			}
		}
		
		if(allSame) {
			return 0;
		}
		
		int maxDiff = 0;

	        // Attempt all rotations to find the maximum difference
	        for (int i = 1; i < str.length(); i++) {
	            String rotated = str.substring(i) + str.substring(0, i);
	            int diff = calculateDifference(str, rotated);
	            maxDiff = Math.max(maxDiff, diff);
	        }
		
		return maxDiff;
	}
	
	public static int calculateDifference(String original, String permuted) {
        int diff = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != permuted.charAt(i)) {
                diff++;
            }
        }
        return diff;
    }
	
	public static void main(String args[]) {
		String str = "bbj";
		System.out.println(maxDifference(str));
	}

}
