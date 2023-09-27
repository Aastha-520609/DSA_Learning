package leetcode;
import java.util.*;
public class buyAndSellStock {
	public static int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profitIfSoldToday = 0;
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < least)
            {
               least = prices[i];
            }

            profitIfSoldToday = prices[i] - least;
            if(profitIfSoldToday > overallProfit)
            {
                overallProfit = profitIfSoldToday;
            }
        }
        return overallProfit;
    }
	public static void main(String args[])
	{
	   int[] prices = {7,1,5,3,6,4};
	   int res = maxProfit(prices);
	   System.out.println(res);
	}
}
