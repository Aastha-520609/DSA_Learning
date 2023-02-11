package gfgPrograms;
import java.util.*;
public class removingDuplicates {
	public static int[] removeDuplicate(int A[], int N)
    {
       LinkedHashSet<Integer> set = new LinkedHashSet<>();
       for(Integer i: A)
       {
           set.add(i);
       }
       
       int[] array = new int[set.size()];
       int k = 0;
       for(Integer i: set)
       {
           array[k] = i;
           k++;
       }
       return array;
    }
	public static void main(String[] args)
	{
		int[] A = {1, 2, 3, 1, 4, 2};
		int N = A.length;
		//System.out.print(removeDuplicate(arr,n));
		removeDuplicate(A,N);
		
		for(int i=0; i<N; i++)
		{
			System.out.print(A[i] + " ");
		}
	}

}
