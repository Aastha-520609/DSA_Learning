package striver;
public class InsertionSort {
	public static void main(String args[]) {
	  int[] arr = {5,2,9,1,5,6};
	  
	  //Takes each element from the unsorted portion and inserts it into its correct position in sorted order
	  for(int i=1; i<arr.length-1; i++) {
		  int key = arr[i];
		  int j = i-1;
		  while(j >= 0 && arr[j] > key) {
			  arr[j+1] = arr[j];
			  j--;
		  }
		  
		  arr[j+1] = key;
		  
	  }
	  
	  for(int i=0; i<arr.length; i++) {
		  System.out.print(arr[i] + " ");
	  }
	}
}
