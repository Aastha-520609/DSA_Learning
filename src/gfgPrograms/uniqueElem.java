package gfgPrograms;
import java.util.*;
import java.io.*;
public class uniqueElem {
	public static int findUnique(int a[], int n, int k)
    {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(!hmap.containsKey(a[i]))
            {
                hmap.put(a[i],1);
            }
            else
            {
                hmap.put(a[i],hmap.get(a[i])+1); 
            }
        }
        for(int i=0; i<n; i++)
        {
            if(hmap.get(a[i]) % k != 0)
            {
                return a[i];
            }
        }
        return -1;
    }
	public static void main(String args[])
	{
		int a[] = {6, 2, 5, 2, 2, 6, 6};
		int n = 7;
		int k = 3;
		System.out.println(findUnique(a,n,k));
	}
}
