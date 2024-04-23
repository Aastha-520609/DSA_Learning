package revision;
import java.util.*;
import java.io.*;
public class MinSubsetSumDiff {
	static int minDiff = Integer.MAX_VALUE;
	static String ans = "";
	public static void solution(int[] arr, int idx, ArrayList<Integer> set1, ArrayList<Integer> set2, int sum1, int sum2)
	{
		if(idx == arr.length)
		{
			int diff = Math.abs(sum1 - sum2);
			if(diff < minDiff)
			{
				minDiff = diff;
				ans = set1 + " " + set2;
			}
			return;
		}
		
		if(set1.size() < (arr.length + 1) / 2)
		{
			set1.add(arr[idx]);
			solution(arr, idx + 1, set1, set2, sum1 + arr[idx], sum2);
			set1.remove(set1.size() - 1);
		}
		
		if(set2.size() < (arr.length + 1) / 2)
		{
			set2.add(arr[idx]);
			solution(arr, idx + 1, set1, set2, sum1, sum2 + arr[idx]);
			set2.remove(set2.size() - 1);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int idx = 0;
		ArrayList<Integer> set1 = new ArrayList<Integer>();
		ArrayList<Integer> set2 = new ArrayList<Integer>();
		int sum1 = 0;
		int sum2 = 0;
		solution(arr,idx,set1,set2,sum1,sum2);
		System.out.println(ans);
	}

}
