package striver;

public class OptimizedVoteCutting {
	
	public static int getTotalCuts(int[] arr, int x) {
		int totalCuts = 0;
		
		for(int num: arr) {
			totalCuts += num/x;
		}
		
		return totalCuts;
	}
	
	public static int getMax(int[] arr, int k) {
		int minVal = arr[0];
		for(int num: arr) {
			minVal = Math.min(num, minVal);
		}
		
		int left = 1;
		int right = minVal;
		int ans = -1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			
			int totalCuts = getTotalCuts(arr, mid);
			
			if(totalCuts == k) {
				ans = mid;
				left = mid + 1;
			}
			else if(totalCuts > k) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		int[] arr = {7,5,9};
		int k = 3;
		System.out.println(getMax(arr,k));
	}
}
