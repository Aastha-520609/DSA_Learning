package revision;
import java.util.*;
public class longestSubArrayWithSumK {
	public static ArrayList<Integer> longestSubArraySum(int[] arr, int n, int s) 
    {
        // Your code here
        HashMap<Integer, Integer> hmap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum = sum + arr[i];
            
            if((sum - s) == 0)
            {
                list.add(1);
                list.add(i+1);
            }
            
            if(hmap.containsKey(sum - s))
            {
                list.add(hmap.get(sum - s)+1);
                list.add(i+1);
            }
            
            hmap.put(sum, i+1);
        }
        
        if(list.isEmpty())
        {
        	list.add(-1);
        }
        return list;
    }
	public static void main(String args[])
	{
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int n = array.length;
		int s = 15;
		 ArrayList<Integer> result = longestSubArraySum(array, n, s);
		    int i = 0;
		    int count = 0;
	        while (i < result.size()) {
	            int start = result.get(i);
	            int end = result.get(i + 1);
	            for (int j = start - 1; j < end; j++) {
	                System.out.print(array[j] + " ");
	                count++;
	            }
	            System.out.print(" Count = " + count);
	            count = 0;
	            System.out.println();
	            i += 2;
	        }
	}   
}
