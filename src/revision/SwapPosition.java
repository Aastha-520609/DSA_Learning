package revision;
import java.util.*;
public class SwapPosition {
	public static int countSwaps(int[] arr, int n) {
		int[] temp = arr.clone();
		Arrays.sort(temp);
		
		HashMap<Integer,Integer> hmap = new HashMap<>();
		for(int i=0; i<n; i++) {
			hmap.put(temp[i], i);
		}
		
		boolean[] visited = new boolean[n];
		int swaps = 0;
		for(int i=0; i<n; i++) {
			if(visited[i] || hmap.get(arr[i]) == i) {
				continue;
			}
			
			int cycleSize = 0;
			int j = i;
			while(!visited[j]) {
				visited[j] = true;
				j = hmap.get(arr[j]);
				cycleSize++;
			}
			
			if(cycleSize > 0) {
				swaps += (cycleSize - 1);
			}
		}
		return swaps;
	}
	public static void main(String args[]) {
		int n = 5;
		int[] arr = {5,7,9,8,6};
		System.out.println(countSwaps(arr,n));
	}

}
