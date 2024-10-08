package striver;

import java.util.Arrays;

public class MissingNumber {
	/*public static void main(String args[]) {
		int[] arr = {0,1};
		
		for(int i=0; i<=arr.length; i++) {
			boolean found = false;
			for(int num: arr) {
				if(num == i) {
					found = true;
					break;
				}
			}
			
			if(found != true) {
				System.out.println(i);
			}
		}*/
	 public static void main(String args[]) {
		 int[] arr = {3,0,1};
		 int XOR = 0;
		 
		 for(int i=0; i<=arr.length; i++) {
			 XOR = XOR ^ i;
		 }
		 
		 for(int num: arr) {	
			 XOR = XOR ^ num;
		 }
		 
		 System.out.print(XOR);
	}

}
