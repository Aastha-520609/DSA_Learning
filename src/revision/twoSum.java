package revision;
import java.util.*;
public class twoSum {
	public static String read(int n, int []book, int target){
        // Write your code here.
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<n; i++)
        {
            int rem = target - book[i];
            if(hmap.containsKey(rem))
            {
                return "YES";
            }
            hmap.put(book[i], 1);
        }
        return "NO";
    }
	public static void main(String args[])
	{
		int[] book = {4,1,2,3,1};
		int n = book.length;
		int target = 5;
		System.out.println(read(n,book,target));
	}
}
