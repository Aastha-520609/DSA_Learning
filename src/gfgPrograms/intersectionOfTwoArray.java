package gfgPrograms;
import java.util.*;
public class intersectionOfTwoArray {
	public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        int count = 0;
        for(int i=0; i<m; i++)
        {
            if(map.containsKey(b[i]))
            {
                count++;
                map.remove(b[i]);
            }
        }
        return count;
    }
	public static void main(String args[])
	{
		int n = 5, m = 3;
		int a[] = {89, 24, 75, 11, 23};
		int b[] = {89, 2, 4};
		System.out.println(NumberofElementsInIntersection(a,b,n,m));
	}

}
