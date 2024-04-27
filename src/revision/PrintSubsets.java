package revision;
import java.util.*;
import java.io.*;
public class PrintSubsets {
	public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subsets = 1 << n;
        List<List<Integer>> ans = new ArrayList<>();

        for(int num=0; num<subsets; num++)
        {
           List<Integer> list = new ArrayList<>();
           for(int i = 0; i < n; i++)
           {
              if((num & (1 << i)) != 0 )
              {
                list.add(nums[i]);
              }
           }
           ans.add(list);   
        }
        return ans;
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
      
      List<List<Integer>> res = subsets(arr);
      System.out.print("[");
      for(int i=0; i<res.size(); i++)
      {
    	  System.out.print(res.get(i) + ",");
      }
      System.out.print("]");
	}
}
