package revision;
import java.util.*;
import java.io.*;
public class MaximumSubsetDiff {
	public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int[] arr = new int[n];
	  for(int i=0; i<n; i++) {
		  arr[i] = sc.nextInt();
	  }
	  
	  Arrays.sort(arr);
	  
	  int result = 0;
	  for(int i=0; i<n-1; i++) {
		  if(arr[i] != arr[i+1]) {
			  result += Math.abs(arr[i]);
		  }else {
			  i++;
		  }
	  }
	  
	  if(arr[n-2] != arr[n-1]) {
		  result += Math.abs(arr[n-1]);
	  }
	  
	  System.out.println(result);
	}
}
