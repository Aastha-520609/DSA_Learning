package striver;

public class BubbleSort {
	//Bubble Sort is a simple comparison-based sorting algorithm. 
	//It works by repeatedly stepping through the list, comparing adjacent elements, and swapping them if they are in the wrong order.
	
	//The name "bubble sort" comes from the way larger elements "bubble" up to the end of the list, 
	//while smaller elements move toward the beginning.
	public static void main(String args[]) {
		int[] arr = {5,2,9,1,5,6};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int val: arr) {
			System.out.print(val + " ");
		}
		
	}

}
