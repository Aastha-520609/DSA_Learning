package striver;

import java.util.HashMap;

public class SingleNumber {
	/*public static void main(String args[]) {
		int[] arr = {4,1,2,1,2};
		
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
		}
		
		for(HashMap.Entry<Integer, Integer> entry: hmap.entrySet()) {
			System.out.println("key :" + entry.getKey() + ", value: " + entry.getValue());
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
		
	}*/
	
	/*public static void main(String args[]) {
		int[] arr = {4,1,2,1,2};
		int xor = 0;
		
		for(int i=0; i<arr.length; i++) {
			xor = xor^arr[i];
		}
		
		System.out.println(xor);
	}*/
	
	public static void main(String args[]) {
		int[] arr = {1,2,4,2,1};
		
		for(int i=0; i<arr.length; i++) {
			boolean isSingle = true;
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					isSingle = false;
					break;
				}
				
			}
			
			if(isSingle == true) {
				System.out.println(arr[i]);
				break;
			}
		}
		
	}
}
