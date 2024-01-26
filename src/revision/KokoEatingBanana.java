package revision;
import java.util.*;
public class KokoEatingBanana {
	public static int maximum(int[] piles)
    {
        int max = Integer.MIN_VALUE;
        for(int val : piles)
        {
            max = Math.max(val, max);
        }
        return max;
    }

    public static int calculateHours(int[] piles, int hourly)
    {
        int tHour = 0;
        for(int i=0; i<piles.length; i++)
        {
            tHour += Math.ceil((double)(piles[i])/(double)(hourly));
        }
        return tHour;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maximum(piles);
        int ans = Integer.MAX_VALUE;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int tHour = calculateHours(piles, mid);
            if(tHour <= h)
            {
                ans = mid;
                high = mid - 1; //inorder to get the minimum element
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
	public static void main(String args[])
	{
		int[] piles = {3,6,7,11};
		int h = 8;
		System.out.println(minEatingSpeed(piles, h));
	}
}
