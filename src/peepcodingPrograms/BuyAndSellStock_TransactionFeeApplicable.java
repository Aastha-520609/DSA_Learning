package peepcodingPrograms;
import java.util.*;
import java.io.*;
/*Given n representing the number of days.
 * Given array elements represents the price of stock on ith day
 * Given transaction fee for every transaction
 * Required to print maximum profit we can make by applying transaction fee for infinte transactions*/
public class BuyAndSellStock_TransactionFeeApplicable {
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   
	   int[] prices = new int[n];
	   for(int i=0; i<prices.length; i++)
	   {
		   prices[i] = sc.nextInt();
	   }
	   
	   int fee = sc.nextInt();
	   
	   int oBuyState = -prices[0];
	   int oSellState = 0;
	   
	   for(int i=1; i<prices.length; i++)
	   {
		   //check if it is profitable to not to buy the another stock or to buy.
		   //we check it by reducing the particular day stock price by the profit we have gained(i.e sellStock), and comparing it with
		   //previous day stock price, we will look which will be better for us, buying the stock today or not.
		   int nBuyState = 0;
		   int nSellState = 0;
		   //in oldSellState value if we buy the stock and the amount is better than the previous state, then we buy that and assign 
		   //new value to the buyState.
		   if((oSellState - prices[i]) > oBuyState) 
		   { 
			   nBuyState = oSellState - prices[i];
		   }
		   else
		   {
			   nBuyState = oBuyState; 
		   }
		   
		   //For selling - if we do selling when the stock price is ith then what will be the max profit
		   //if we do selling of ith stock on old bought state(i.e how much amount we have) then after reducing the amount of fee
		   //if we get profit more than previous then we will sell it else we won't.
		   if(oBuyState + prices[i] - fee > oSellState)
		   {
			   nSellState = oBuyState + prices[i] - fee;
		   }
		   else
		   {
			   nSellState = oSellState;
		   }
		   
		   oBuyState = nBuyState;
		   oSellState = nSellState;
	   }
	   
	   System.out.println(oSellState);
	}
}
