package revision;
import java.util.*;
public class majorityEle {
	public static int majorityElement(int []v) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int majority = 0;
        for(int i=0; i<v.length; i++)
        {
            if(map.containsKey(v[i]))
            {
              map.put(v[i],map.get(v[i]) + 1);
            }
            else{
                map.put(v[i], 1);
            }

            int ans = map.get(v[i]);

            if(ans > v.length / 2)
            {
               majority = v[i]; 
            }
        }
        return majority;
    }
	public static void main(String args[])
	{
		int[] array = {2,2,1,3,1,1,3,1,1};
		System.out.println(majorityElement(array));
	}
}
