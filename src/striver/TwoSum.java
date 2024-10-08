package striver;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		for(int i=1; i<nums.length; i++) {
			for(int j=i; j<nums.length; j++) {
				if(nums[j] + nums[j-i] == target) {
					return new int[] {j-i,j};
				}
			}
		}
		
		return new int[] {};
	}
	public static void main(String args[]) {
		//int[] nums = {2,7,11,15};
		int[] nums = {3,2,4};
		
		//int target = 9;
		int target = 6;
		
		int[] arr = twoSum(nums,target);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
