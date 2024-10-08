package striver;

public class SumOfBeautyOfAllSubstring {
	public static int findBeauty(int freq[]) {
		int maxFreq = 0;
		int minFreq = Integer.MAX_VALUE;
		for(int f: freq) {
			if(f > 0) {
				maxFreq = Math.max(maxFreq, f);
				minFreq = Math.min(minFreq, f);
			}
		}
		
		return maxFreq - minFreq;
	}
	public static int beautySum(String s) {
		int n = s.length();
		int totalBeauty = 0;
		
		for(int i=0; i<n; i++) {
			int[] freq = new int[26];
			for(int j=i; j<n; j++) {
				freq[s.charAt(j) - 'a']++;
				
			    totalBeauty += findBeauty(freq);
			}
		}
		return totalBeauty;
	}
	public static void main(String args[]) {
		String str = "aabcb";
		System.out.println(beautySum(str));
	}

}
