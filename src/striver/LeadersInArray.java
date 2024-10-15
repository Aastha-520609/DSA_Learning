package striver;
import java.util.*;

public class LeadersInArray {
	 public static ArrayList<Integer> bruteLeaders(int n, int arr[]) {	        
	        ArrayList<Integer> lst = new ArrayList<Integer>();
	        boolean leader;
	        for(int i=0; i<arr.length; i++){
	          leader = true;
	          for(int j=i+1; j<arr.length; j++){
	              if(arr[j] > arr[i]){
	                  leader = false;
	                  break;
	              }
	          }
	          if(leader == true)
	          {
	            lst.add(arr[i]);
	          }
	        }
	        return lst;
	    }
	 public static ArrayList<Integer> leaders(int n, int arr[]) {
	        ArrayList<Integer> lst = new ArrayList<Integer>();
	        int maxi = Integer.MIN_VALUE;
	        for(int i=n-1; i>=0; i--){
	            if(arr[i] >= maxi){
	                lst.add(arr[i]);
	                maxi = Math.max(maxi, arr[i]);
	            }
	        }
	        
	        Collections.reverse(lst);
	        return lst;
	    }
	public static void main(String args[]) {
		int[] arr = {16,17,4,3,5,2};
		int n = arr.length;
		ArrayList<Integer> result = bruteLeaders(n, arr);
		for(int val: result) {
			System.out.print(val + " ");
		}
		System.out.println();
		ArrayList<Integer> result1 = leaders(n, arr);
		for(int val: result1) {
			System.out.print(val + " ");
		}
	}

}
