package gfgPrograms;
import java.util.*;
public class duplicatesInArray {
	public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> hmap = new HashMap<>();
        ArrayList<Integer> alist = new ArrayList<Integer>();
        int count = 0;
        for(int i=0; i<n; i++)
        {
            if(hmap.containsKey(arr[i]))
            {
                count = hmap.get(arr[i]);
                hmap.put(arr[i], count + 1);
            }
            else
            {
                hmap.put(arr[i],1);
            }
        }
        for(int i=0; i<n; i++)
        {
            if(hmap.containsKey(i) && hmap.get(i) > 1)
            {
                alist.add(i);
            }
        }
        if(alist.size() == 0)
        {
            alist.add(-1);
        }
        return alist;
    }
	public static void main(String[] args)
	{
		int n = 4;
		int[] arr = {0,3,1,2};
		System.out.print(duplicates(arr,n));
	}

}
