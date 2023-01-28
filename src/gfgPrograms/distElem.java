package gfgPrograms;
import java.util.*;
import java.io.*;
public class distElem {
	public static long sumOfDistinct(long arr[], int N)
    {
        Arrays.sort(arr);
        long sum = 0;
        HashSet<Long> set = new HashSet<>();
        for(long ele : arr)
        {
            set.add(ele);
        }
        for(long e : set)
        {
            sum = sum + e;
        }
        return sum;
    }
	public static void main(String[] args)
	{
		long arr[] = {5, 1, 2, 4, 6, 7, 3, 6, 7};
		int N = arr.length;
		System.out.println(sumOfDistinct(arr,N));
	}
}
