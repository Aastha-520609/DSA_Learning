package striver;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
	public static int bruteConsecutive(int[] arr, int n) {
		int longest = 1;
		int count = 0;
		for(int i=0; i<n; i++) {
			int num = arr[i];
			count = 1;
			while(linearSearch(arr, num+1) == true) {
				num = num + 1;
				count = count + 1;
			}
			
			longest = Math.max(longest, count);
		}
		
		return longest;
	}
	
	public static boolean linearSearch(int[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	public static int betterConsecutive(int[] arr, int n) {
		Arrays.sort(arr);
		int lastSmaller = Integer.MIN_VALUE;
		int count = 0;
		int longest = 1;
		for(int i=0; i<n; i++) {
			if(arr[i] - 1 == lastSmaller) {
				count += 1;
				lastSmaller = arr[i];
			}
			else if(lastSmaller != arr[i] - 1) {
				count = 1;
				lastSmaller = arr[i];
			}
			longest = Math.max(longest, count);
		}
		
		return longest;
	}
	
	public static void main(String args[]) {
		//int[] arr = {5,8,3,2,1,4};
		int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
		int n = arr.length;
		System.out.println(bruteConsecutive(arr, n));
		System.out.println();
		System.out.println(betterConsecutive(arr,n));
	}

}
