package revision;
import java.util.*;
import java.io.*;
public class ThreeSum {
	public static List<List<Integer>> triplet(int[] array, int n)
	{
		Set<List<Integer>> st = new HashSet<>();
		
		for(int i=0; i<n; i++)
		{
			Set<Integer> hashset = new HashSet<>();
			for(int j=i+1; j<n; j++)
			{
				int third = -(array[i] + array[j]);
				
				if(hashset.contains(third))
				{
					List<Integer> lst = Arrays.asList(array[i], array[j], third);
					lst.sort(null);
					st.add(lst);
				}
				
				hashset.add(array[j]); //to avoid duplicate we add it.
			}
		}
		
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;
	}
	public static void main(String args[])
	{
		//int[] array = {-18,0, 30, 0, -48, 0, -34, -27, -40, -4, -17, -30, -2 };
		int[] array = {-18, -1, -44, -48, -9, -16, -36, -13, 29, 17, -12, 9, -49};
        List<List<Integer>> result = triplet(array, array.length);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
	}

}
