package revision;
import java.util.*;
public class SingleEleInSortedArray {
	 public static int singleNonDuplicate(ArrayList<Integer> arr)
	    {
	        //    Write your code here.
	        HashMap<Integer, Integer> hmap = new HashMap<>();

	        for(int i:arr)
	        {
	            if(hmap.containsKey(i))
	            {
	                hmap.put(i, hmap.get(i)+1);
	            }
	            else
	            {
	                hmap.put(i, 1);
	            }
	        }

	        for(int key : hmap.keySet())
	        {
	          if(hmap.get(key) == 1)
	          {
	              return key;
	          }
	        }

	        return -1;
	    }
	 public static void main(String args[])
	 {
		 ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 4, 5, 5));
		 System.out.println(singleNonDuplicate(arrayList1));
	 }
}
