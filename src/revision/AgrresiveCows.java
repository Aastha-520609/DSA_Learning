package revision;
import java.util.*;
public class AgrresiveCows {
	public static boolean canBePlaced(int[] stalls, int dist, int k)
    {
        int n = stalls.length;
        int countCows = 1;
        int last = stalls[0];
        for(int i=1; i<n; i++)
        {
            if(stalls[i] - last >= dist)
            {
                countCows++;
                last = stalls[i];
            }
            if(countCows >= k)
            {
                return true;
            }
        }
        return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n-1] - stalls[0];
        int ans = 0;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(canBePlaced(stalls, mid, k) == true)
            {
                ans = mid;
                low = mid + 1;
            }
            else
            { 
                high = mid - 1;
            }
        }
        return ans;
    }
	public static void main(String args[])
	{
		int[] stalls = {0,3,4,7,10,9};
		int k = 4;
		System.out.println(aggressiveCows(stalls, k));
	}
}
