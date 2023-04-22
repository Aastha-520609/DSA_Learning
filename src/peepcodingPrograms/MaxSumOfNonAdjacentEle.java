package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class MaxSumOfNonAdjacentEle {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //elements array
		
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++)
		{
		   arr[i] = sc.nextInt();	
		}
		
		int including = arr[0];
		int excluding = 0;
		
		for(int i=1; i<arr.length; i++)
		{
			int new_including = excluding + arr[i];
			int new_excluding = Math.max(including, excluding);
			
			including = new_including;
			excluding = new_excluding;
		}
		
		int ans = Math.max(including, excluding);
		System.out.println(ans);
	}

}
