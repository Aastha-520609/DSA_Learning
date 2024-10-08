package striver;

public class SortColours {
	public static void main(String args[]) {
		int[] nums = {2,0,2,1,1,0};
		int n = nums.length; 
		int low = 0;
		int mid = 0;
		int high = n - 1;
		
		while(mid <= high) {
			if(nums[mid] == 0) {
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;
				mid++;
			}
			else if(nums[mid] == 1) {
				mid++;
			}
			else {
				int temp = nums[high];
				nums[high] = nums[mid];
				nums[mid] = temp;
				high--;
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}

}
