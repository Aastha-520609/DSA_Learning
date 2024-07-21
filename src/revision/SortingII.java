package revision;
import java.util.*;
public class SortingII {
	public static void merge(int[] nums, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= high){
            if(nums[left] <=  nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }

        while(right<=high){
            temp.add(nums[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            nums[i] = temp.get(i - low);
        }
    }
    public static void mergeSort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int mid = (low+high)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, mid, high);
    }
    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n-1);
        return nums;
    }
    
    public static int partition(int[] nums, int low, int high) {
    	int pivot = nums[low];
    	int i = low;
    	int j = high;
    	while(i < j) {
    		while(nums[i] <= pivot && i <= high - 1) {
    			i++;
    		}
    		
    		while(nums[j] > pivot && j >= low + 1) {
    			j--;
    		}
    		
    		if(i<j) {
    			int temp = nums[i];
    			nums[i] = nums[j];
    			nums[j] = temp;
    		}
    	}
    	
    	int temp = nums[low];
    	nums[low] = nums[j];
    	nums[j] = temp;
    	
    	return j;
    }
    public static void qs(int[] nums, int low, int high) {
    	if(low < high) {
    		int pIndex = partition(nums, low, high);
    		qs(nums,low,pIndex-1);
    		qs(nums, pIndex+1, high);
    	}
    }
    
	public static void main(String args[]) {
		int[] nums = {4,9,2,19,1};
		int n = nums.length;
		qs(nums, 0, n - 1);
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
