package gfgPrograms;
import java.util.*;
public class StrangeSort {
	public static void strangeSort (int A[], int N, int K)
    {
        // your code here
        int a = A[K - 1];
        A[K-1] = -1;
        Arrays.sort(A);
        for(int i=0; i<K-1; i++)
        {
            A[i] = A[i+1];
        }
        A[K-1] = a;
    }
	public static void main(String[] args)
	{
		int N = 5;
		int[] A = {3,12,30,79,2};
		int K = 2;
		strangeSort(A,N,K);
		for(int i=0; i<N; i++)
		{
			System.out.print(A[i] + " ");
		}
	}

}
