package striver;

public class SelectionSort {
	public static void main(String args[]) {
		int[] arr = {1,9,4,2,8};
		
		//Finds the minimum value and swap it with the current index.
		for(int i=0; i<arr.length-1; i++) {
			int mini = i;
			for(int j=i+1; j<arr.length-1; j++) {
				if(arr[j] < arr[mini]) {
				   mini = j;	
				}	
			}
			
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
