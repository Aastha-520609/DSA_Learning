package revision;
import java.util.*;
import java.io.*;
public class CoinChange {
	public static void coinChange(int i, int[] coins, int amount, int total_amt, String ans)
	{
		if(i == coins.length)
		{
			if(amount == total_amt)
			{
				System.out.println(ans);
			}
			return;
		}
		coinChange(i+1, coins, amount + coins[i], total_amt, ans + coins[i] + "-");
		coinChange(i+1, coins, amount + 0, total_amt, ans);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] coins = new int[n];
		for(int i=0; i<n; i++)
		{
			coins[i] = sc.nextInt();
		}
		int total_amt = sc.nextInt();
		coinChange(0, coins, 0, total_amt, "");
	}
}
