package revision;
import java.util.*;
import java.io.*;
public class EqualSumSubsetPartition {
	public static void solution(int[] arr, int idx, int n, int k, int[] subsetSum, int subset_ans, ArrayList<ArrayList<Integer>> ans)
	{
		if(idx == arr.length)
		{
			if(subset_ans == k)
			{
				boolean flag = true;
				for(int i=0; i<subsetSum.length - 1; i++)
				{
					if(subsetSum[i] != subsetSum[i+1])
					{
						flag = false;
						break;
					}
				}
				
				if(flag)
				{
					for(ArrayList<Integer> parition: ans)
					{
						System.out.print(parition + " ");
					}
					System.out.println();
				}
			}
			return;
		}
		
		for(int i=0; i<ans.size(); i++)
		{
			if(ans.get(i).size() > 0)
			{
				ans.get(i).add(arr[idx]);
				subsetSum[i] += arr[idx];
				solution(arr, idx+1, n, k, subsetSum, subset_ans, ans);
				subsetSum[i] -= arr[idx];
				ans.get(i).remove(ans.get(i).size() - 1);	
			}
			else
			{
				ans.get(i).add(arr[idx]);
				subsetSum[i] += arr[idx];
				solution(arr, idx+1, n, k, subsetSum, subset_ans + 1, ans);
				subsetSum[i] -= arr[idx];
				ans.get(i).remove(ans.get(i).size() - 1);
				break;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		int k = sc.nextInt();
		if(k == 1)
		{
			System.out.print("[");
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i] + ",");
			}
			System.out.print("]");
			return;
		}
		
		if(k>n || sum%k != 0)
		{
			System.out.println("-1");
			return;
		}
		
		int[] subsetSum = new int[k];
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i=0; i<k; i++)
		{
			ans.add(new ArrayList<>());
		}
		solution(arr, 0, n, k, subsetSum, 0, ans);
	}

}
