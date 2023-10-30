package revision;
import java.util.*;
public class subsetOfArray {
public static String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            long ele = a1[i];
            if(map.containsKey(ele))
            {
                map.put(ele, map.getOrDefault(ele, 0) + 1);
            }
            else
            {
                map.put(ele, 1);
            }
        }
        
        for(int i=0; i<m; i++)
        {
            long ele2 = a2[i];
            if(map.containsKey(ele2) && map.get(ele2) > 0)
            {
                map.put(ele2, map.get(ele2) - 1);
            }
            else
            {
                return "No";
            }
        }
        
        return "Yes";
    }
	public static void main(String args[])
	{
		long[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
		long a2[] = {11, 3, 7, 1, 7};
		long n = a1.length;
		long m = a2.length;
		System.out.println(isSubset(a1,a2,n,m));
	}

}
