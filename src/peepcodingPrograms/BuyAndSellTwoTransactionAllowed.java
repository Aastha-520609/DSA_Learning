package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class BuyAndSellTwoTransactionAllowed {
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt(); //no of days
	  
	  int[] prices = new int[n];
	  for(int i=0; i<prices.length; i++)
	  {
		  prices[i] = sc.nextInt();
	  }
	  
	  //All for sell
	  int mpst = 0; //max profit if sold today
	  int leastAmount = prices[0];  //least amount so far 
	  int[] arr1 = new int[prices.length]; // maximum profit if sold upto today
	  for(int i=1; i<prices.length; i++)
	  {
		  if(prices[i] < leastAmount)
		  {
			  leastAmount = prices[i];
		  }
		  
		  mpst = prices[i] - leastAmount;
		  
		  if(mpst > arr1[i-1])
		  {
			  arr1[i] = mpst;
		  }
		  else
		  {
			  arr1[i] = arr1[i-1];
		  }
	  }
	  
	  //For buying
	  int mpbt = 0; //maximum profit if bought today
	  int maxAmount = prices[prices.length - 1]; //maximum Amount so far
	  int[] arr2 = new int[prices.length]; // 
	  
	  for(int i=prices.length - 2; i>=0; i--)
	  {
		  if(prices[i] > maxAmount)
		  {
			  maxAmount = prices[i];
		  }
		  
		  mpbt = maxAmount - prices[i];
		  
		  if(mpbt > arr2[i+1])
		  {
			  arr2[i] = mpbt;
		  }
		  else
		  {
			  arr2[i] = arr2[i+1];
		  }
	  }
	  
	  int overallProfit = 0;
	  for(int i=0; i<prices.length; i++)
	  {
		  if(arr2[i] + arr1[i] > overallProfit)
		  {
			  overallProfit = arr2[i] + arr1[i];
		  }
	  }
	  
	  System.out.println(overallProfit);
	}
}
