package revision;
import java.util.*;
public class stockBuyAndSell {
	public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int least = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profitIfSoldToday = 0;

        for(int i=0; i<prices.size(); i++)
        {
            if(prices.get(i) < least)
            {
                least = prices.get(i);
            }

            profitIfSoldToday = prices.get(i) - least;

            if(profitIfSoldToday > overallProfit)
            {
                overallProfit = profitIfSoldToday;
            }
        }

        return overallProfit;
    }
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		int res = maximumProfit(list);
		System.out.println(res);
	}

}
