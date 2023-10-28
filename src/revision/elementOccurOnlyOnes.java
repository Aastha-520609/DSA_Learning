package revision;
import java.util.*;
public class elementOccurOnlyOnes {
	 public static int getSingleElement(int []arr){
	        // Write your code here.
	        HashMap<Integer, Integer> map = new HashMap<>();

	        //int res = 0;
	        for(int i=0; i<arr.length; i++)
	        {
	            int e1 = arr[i];
	            if(map.containsKey(e1))
	            {
	                map.put(e1, map.get(e1) + 1);
	            }
	            else
	            {
	                map.put(e1, 1);
	            }

	        }

	        for(int result: map.keySet())
	        {
	            if(map.get(result) == 1)
	            {
	                return result;
	            }
	        }
	        return -1;
	    }
	 public static void main(String args[])
	 {
		 int[] array = {1,1,2,3,3,4,4};
		 int n = array.length;
		 int result = getSingleElement(array);
		 System.out.println(result);
	 }

}
