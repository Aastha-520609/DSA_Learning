import java.io.*;
import java.util.*;
public class InsertionSort {
	public static void main(String args[])
	{
		int arr[] = {2,9,1,6,3};
		//for unsorted array
		for(int i=1; i<arr.length; i++)
		{
			int current_value = arr[i]; //which is one at first i.e current = index 1; //1-here value =9 // 2- here value = 1
			int j = i - 1; // which means when index i = 1 , the index of j will be 0 // here value = 2 // here value = 9
			while(j>=0 && arr[j] > current)// while j value is greater and equal to index value 0 and also arr of j greater than current value // here j is not greater than 9 so it will not enter to while
			//2 yes 9 is greater than 1
			{
				arr[j+1] = arr[j]; // so at array 2 9 is placed
				j--; // j is again at position 1 
			}
			arr[j+1] = current; // array j + 1 is index 2 where already there is cureent value 
			// again 
		}
	}
 
}
