package striver;

public class VoteCutting {
	public static int getMax(int[] arr, int k) {
		
		int ans = -1;
		int minValue = arr[0];
		for(int nums: arr) {
			minValue = Math.min(minValue, nums);
		}
		
		for(int x=1; x<=minValue; x++) {
			int totalCuts = 0;
			
		    for(int num: arr) {
		    	totalCuts += num/x;
		    }
		    
		    if(totalCuts == k) {
		    	ans = x;
		    	break;
		    }
		}
		
		return ans;
	}
	public static void main(String args[]) {
		int[] arr = {5,7,9};
		int k = 3;
		System.out.println(getMax(arr, k));
	}
}
