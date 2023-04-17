package peepcodingPrograms;
import java.util.*;
import java.io.*;
// question is all about coins array is given and a target amount is given, we have to print no of combinations made using given coins that sums upto target.
public class coinChangeCombination {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //Size of Array
		
		int[] coinsArray = new int[n]; //coins are given
		for(int i=0; i<coinsArray.length; i++)
		{
			coinsArray[i] = sc.nextInt();
		}
		
		int targetAmount = sc.nextInt(); //number whose combination is to be found
		
		//dp array where targeted combinations are stored
		int[] resultArray = new int[targetAmount + 1];
		
		resultArray[0] = 1; //we can take 0 in all combinations
		
		for(int i=0; i<coinsArray.length; i++)
		{
			for(int j = coinsArray[i]; j<resultArray.length; j++)
			{
				resultArray[j] = resultArray[j] + resultArray[j - coinsArray[i]];
			}
		}
		
		System.out.println(resultArray[targetAmount]);
	}

}
