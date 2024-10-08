package striver;

public class RearrangeElementBySign {
	public static int[] rearrangeArray(int[] nums) {

	       int[] ans = new int[nums.length];
	       int posIndex = 0;
	       int negIndex = 1;

	        for(int i=0; i<nums.length; i++){
	            if(nums[i] > 0){
	                ans[posIndex] = nums[i];
	                posIndex += 2;
	            }
	            else{
	                ans[negIndex] = nums[i];
	                negIndex += 2;
	            }
	        }
	        
	        return ans;
	    }
	public static void main(String args[]) {
		int[] arr = {3,1,-2,-5,2,-4};
	    int[] res = rearrangeArray(arr);
	    for(int i=0; i<res.length; i++) {
	    	System.out.print(res[i]+" ");
	    }
	}
}
