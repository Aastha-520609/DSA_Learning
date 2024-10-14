package striver;

public class BuyAndSellStock {
	public static int profit(int[] prices) {
		
		int mini = prices[0];
		int maxProfit = 0;
		for(int i=1; i<prices.length; i++) {
			int cost = prices[i] - mini;
			maxProfit = Math.max(maxProfit, cost);
			mini = Math.min(prices[i], mini);
		}
		
		return maxProfit;
	}
	public static void main(String args[]) {
		int[] prices = {7,1,5,3,6,4};
		//int[] prices = {7,6,4,3,1};
		System.out.println(profit(prices));
	}

}
