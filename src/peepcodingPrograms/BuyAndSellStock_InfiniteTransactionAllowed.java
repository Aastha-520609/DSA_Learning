package peepcodingPrograms;
import java.util.*;
import java.io.*;
/*More than one buying is not allowed, Buying and selling of stock should be simultaneously, B S and again B S is allowed*/
public class BuyAndSellStock_InfiniteTransactionAllowed {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		
		int[] price = new int[n];
		for(int i=0; i<price.length; i++)
		{
			price[i] = sc.nextInt();
		}
		
		int profit = 0;
		int buyingDate = 0;
		int sellingDate = 0;
		for(int i=1; i<price.length; i++)
		{
			if(price[i] >= price[i-1])
			{
				sellingDate++;
			}
			else
			{
				profit += price[sellingDate] - price[buyingDate];
				buyingDate = sellingDate = i;
			}
		}
		
		profit += price[sellingDate] - price[buyingDate];
		System.out.println(profit);
	}

}
