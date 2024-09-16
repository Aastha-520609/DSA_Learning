package striver;
import java.util.ArrayList;

public class MergeSort {
	//Divide and merge
	public static void merge(int[] arr, int low, int mid, int high) {
		int left = low;
		int right = mid + 1;
		
		ArrayList<Integer> temp = new ArrayList<>();
		while(left <= low && right <= high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}
			else {
				temp.add(arr[right]);
				right++;
			}
		}
		
		while(left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		
		while(right <= high) {
			temp.add(arr[right]);
			right++;
		}
		
		for(int i=low; i<high; i++) {
			arr[i] = temp.get(i - low);
		}
		
		
	}
	public static void divide(int[] arr, int low, int high) {
		int mid = (low + high) / 2;
		
		if(low >= high) {
			return;
		}
		
		divide(arr, low, mid);
		divide(arr,mid+1, high);
		
		merge(arr,low,mid, high);
		
	}
	public static void main(String args[]) {
		int[] arr = {5,2,9,1,5,6};
		int low = 0;
		int high = arr.length - 1;
		divide(arr,low,high);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
