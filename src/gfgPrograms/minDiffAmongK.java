package gfgPrograms;
import java.util.*;
public class minDiffAmongK {
	public static long minDiff(long a[] ,int N,int K)
    {
        Arrays.sort(a);
        long ans = Integer.MAX_VALUE;
        for(int i=0; i<=N-K; i++)
        {
            long max = a[i+K-1];
            long min = a[i];
            long diff = max - min;
            if(diff<ans)
            {
                ans = diff;
            }
        }
        return ans;
    }
	public static void main(String[] args)
	{
		long arr[] = {10,100,300,200,1000,20,30};
		System.out.print(minDiff(arr,7,3));
	}
}
