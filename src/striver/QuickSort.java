package striver;

public class QuickSort {
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int index = pIndex(arr, low, high);
			quickSort(arr, low, index - 1);
			quickSort(arr,index + 1, high);
		}
		
	}
	public static int pIndex(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i < j) {
			while(arr[i] <= pivot && i < high) {
				i++;
			}
			
			while(arr[j] > pivot && j > low) {
				j--;
			}
			
			if(i < j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
			}
		}
		
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		
		return j;
	}
	public static void main(String args[]) {
		int[] arr = {5,2,9,1,7,6};
		int low = 0;
		int high = arr.length - 1;
		quickSort(arr, low, high);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
