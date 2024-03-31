package revision;
public class TargetSumSubset {
	public static void printTargetSumSubsets(int[] arr, int idx, String set, int sum, int tar)
	{
		if(idx == arr.length)
		{
			if(sum == tar)
			{
				System.out.println(set + ".");
			}
			return;
		}
		
		printTargetSumSubsets(arr, idx + 1, set + arr[idx] + "," , sum + arr[idx], tar);
		printTargetSumSubsets(arr, idx + 1, set, sum, tar);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {10,20,30,40,50};
		int target = 70;
		printTargetSumSubsets(arr, 0 , "", 0, target);
	}

}
