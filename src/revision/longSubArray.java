package revision;
import java.util.*;
public class longSubArray {
	public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        int sum = 0;
        int maxLength = 0;
        for(int i=0; i<N; i++)
        {
            sum = sum + A[i];
            
            if(sum == K)
            {
                maxLength = Math.max(maxLength, i+1);
            }
            
            int rem = sum - K;
            
            if(hmap.containsKey(rem))
            {
                int length = i - hmap.get(rem);
                maxLength = Math.max(maxLength, length);
            }
            
            if(!hmap.containsKey(sum))
            {
                hmap.put(sum,i);
            }
        }
        
        return maxLength;
	}
	public static void main(String args[])
	{
		int[] array = {10,5,2,7,1,9};
		int n = array.length;
		int s = 15;
		System.out.println(lenOfLongSubarr(array,n,s));
	}

}
