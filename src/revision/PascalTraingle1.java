package revision;
import java.util.*;
import java.io.*;
//finding the element in the particular cell.
public class PascalTraingle1 {
	public static int getElement(int n, int r)
	{
		int res = 1;
		for(int i=0; i<r; i++)
		{
			res = res * (n-i);
			res = res / (i+1);
		}
		return res;
	}
	
	public static List<Integer> getRow(int r)
	{
		int res = 1;
	    List<Integer> ansRow = new ArrayList<>();
	    ansRow.add(1);
	    
		for(int i=1; i<r; i++)
		{
			res = res * (r-i);
			res = res / i;
			ansRow.add((int)res);
		}
		return ansRow;
	}
	
	public static List<List<Integer>> Triangle(int n)
	{
		List<List<Integer>> ans = new ArrayList<>();
		for(int i=1; i<=n; i++)
		{
			ans.add(getRow(i));
		}
		return ans;
	}
	
	public static void main(String args[])
	{
		int n = 5;
		int r = 3;
		System.out.println(getElement(n-1,r-1));
		List<Integer> result = getRow(n-1);
		for(int element : result)
		{
			System.out.print(element + " ");
		}
		System.out.println();
		List<List<Integer>> ans = Triangle(n);
		for(List<Integer> i : ans)
		{
			for(int ele : i)
			{
				System.out.print(ele + " ");
			}
			System.out.println();
		}
	}
}
