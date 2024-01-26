package revision;
import java.util.*;
import java.io.*;
public class RoseGarden {
	public static int max(int[] bloomDay)
    {
        int maxi = Integer.MIN_VALUE;
        for(int val: bloomDay)
        {
           if(val > maxi)
           {
               maxi = val;
           }
        }
        return maxi;
    }

    public static int min(int[] bloomDay)
    {
        int mini = Integer.MAX_VALUE;
        for(int val: bloomDay)
        {
            if(val < mini)
            {
                mini = val;
            }
        }
        return mini;
    }

    //checking on which day the minimum no of bouquet making is possible, the flowers should be bloomed and adjacent
    public static boolean possible(int[] bloomDay, int day, int m, int k)
    {
        int count = 0;
        int no_of_bouquet = 0;
        for(int val: bloomDay)
        {
            if(val <= day)
            {
               count++;
            }
            else
            {
                no_of_bouquet += (count/k);
                count = 0;
            }
        }
        no_of_bouquet += (count/k);
        return no_of_bouquet >= m;
    }
    public static int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        if(n < (long)m*k)
        {
            return -1;
        }
        int low = min(bloomDay);
        int high = max(bloomDay);
        int ans = low;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(possible(bloomDay, mid, m, k))
            {
                ans = mid;
                high = mid - 1;
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
	  int[] bloomDay = {7,7,7,7,7,13,11,12,7};
	  int m = 2; //minimum no of bouquet to be made.
	  int k = 3; //minimum of flowers to be added in the bouquet
	  System.out.println(minDays(bloomDay,m,k));
	}
}
