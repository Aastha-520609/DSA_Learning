package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class BuyAndSellWithCoolDown {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //no of days
		
		int[] prices = new int[n];
		for(int i=0; i<prices.length; i++)
		{
			prices[i] = sc.nextInt();
		}
		
		int oBuyState = -prices[0];
		int oSellState = 0;
		int oCoolState = 0;
		
		for(int i=1; i<prices.length; i++)
		{
			int nBuyState = 0;
			int nSellState = 0;
			int nCoolState = 0;
			//for buyState
			if(oCoolState - prices[i] > oBuyState)
			{
				nBuyState = oCoolState - prices[i];
			}
			else
			{
				nBuyState = oBuyState;
			}
			
			//for sellState
			if(oBuyState + prices[i] > oSellState)
			{
				nSellState = oBuyState + prices[i];
			}
			else
			{
				nSellState = oSellState;
			}
			
			//for coolState
			if(oSellState > oCoolState)
			{
				nCoolState = oSellState;
			}
			else
			{
				nCoolState = oCoolState;
			}
			
			oBuyState = nBuyState;
			oSellState = nSellState;
			oCoolState = nCoolState;
		}
		
		System.out.println(oSellState);
	}
}
