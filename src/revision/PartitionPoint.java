package revision;
import java.util.*;
import java.io.*;
public class PartitionPoint {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int k = sc.nextInt();
			int[] arr = new int[k];
			for(int j=0; j<k; j++) {
				arr[j] = sc.nextInt();
			}
			
			int totalSum = 0;
			for(int z=0; z<k; z++) {
				totalSum += arr[z];
			}
			
			int leftSum = 0;
			int ans1 = 0;
			int ans2 = 0;
			for(int x=0; x<k; x++) {
				int rightSum = totalSum - leftSum - arr[x];
				
				if(rightSum == leftSum) {
					ans1 = x+1;
					ans2 = leftSum;
					break;
				}
				
				leftSum += arr[x];
			}
			
			if(ans1 == 0) {
				System.out.println("0");
			}
			else {
				System.out.println(ans1 + " " + ans2);
			}
		}		
	}
}
