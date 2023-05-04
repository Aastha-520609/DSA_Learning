package peepcodingPrograms;
import java.util.*;
import java.io.*;
/*Given n as number of days
 * Given an n array where price of stocks are taken
 * Print the maximum profit you can make if you are allowed a single transaction.*/
public class BuyAndSellStock_OneTransactionAllowed {
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt(); 
	   
	   int[] price = new int[n];
	   for(int i=0; i<price.length; i++)
	   {
		   price[i] = sc.nextInt();
	   }
	   
	   int leastPrice = Integer.MAX_VALUE;
	   int overallProfit = 0;
	   int profitIfSoldToday = 0;
	   
	   for(int i=0; i<price.length; i++)
	   {
		   //finding the leastPrice of the stock inorder to get the max profit, since when the stock price was less among all 
		   //and you buyed it that day, then while selling it you will get max profit.
		   if(price[i] < leastPrice)
		   {
			   leastPrice = price[i];
		   }
		   
		   //when least buyed amount is deducted from the price you are selling it today then you will get profit if sold today
		   profitIfSoldToday = price[i] - leastPrice;
		   
		   if(profitIfSoldToday > overallProfit)
		   {
			   overallProfit = profitIfSoldToday;
		   }
	   }
	   
	   System.out.println(overallProfit); 
	}
}
