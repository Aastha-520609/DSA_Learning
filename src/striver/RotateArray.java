package striver;

public class RotateArray {
	public static void reverse(int[] arr, int low, int high) {
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	public static void rotate(int[] arr, int k) {
		k = k % arr.length;
		//first reverse the whole array
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
	}
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
	    rotate(arr,k);
	    for(int i=0; i<arr.length; i++) {
	    	System.out.print(arr[i] + " ");
	    }
		
	}

}
