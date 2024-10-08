package striver;

public class MajorityElement {
	public static void main(String args[]) {
		int[] arr = {3,2,3};
		int n = arr.length;
		
		//This is Boyer-Moore Voting Algorithm
		int count = 0;
		int element = 0;
		for(int i=0; i<n; i++) {
			if(count == 0) {
				count = 1;
				element = arr[i];
			}
			else if(arr[i] == element) {
				count++;
			}
			else {
				count--;
			}	
		}
		
		int val = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == element) {
				val++;
			}
		}
		
		if(val > n/2) {
			System.out.println(element);
		}
	}

}
