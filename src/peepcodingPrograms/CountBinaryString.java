package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class CountBinaryString {
	public static void main(String args[])
	{
		//The binary string should not contain two consecutive zeros.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //the number for which you want to count the possible string
		
		int oldCountZeros = 1;
		int oldCountOnes = 1;
		
		for(int i=2; i<=n; i++)
		{
			int newCountZeros = oldCountOnes;
			int newCountOnes = oldCountZeros + oldCountOnes;
			
			//change newCount to oldCount
			oldCountZeros = newCountZeros ;
			oldCountOnes = newCountOnes ;
		}
		
		System.out.println(oldCountZeros + oldCountOnes);
	}

}
