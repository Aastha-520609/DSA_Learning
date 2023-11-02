package revision;
import java.util.*;
public class SubArraysWithEqualSum {
	public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
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
		int[] array = {1,2,3,4,5,6};
		int n = array.length;
		int s = 15;
		 ArrayList<Integer> result = subarraySum(array, n, s);
		 
		 for (int i = 0; i < result.size(); i += 2) {
	            int start = result.get(i);
	            int end = result.get(i + 1);
	            System.out.println("[" + start + "," + end + "]");
	        }
	}
}
