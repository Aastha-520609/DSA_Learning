package gfgPrograms;
import java.util.*;
public class sumOfElem {
	public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        // Your code goes here
        Arrays.sort(A);
        long sum = 0;
        for(long i=K1; i<=K2-2; i++)
        {
            sum = sum + A[(int)i];
        }
        return sum;
    }
	public static void main(String[] args)
	{
		long[] A = {20, 8, 22, 4, 12, 10, 14};
		long N = 7;
		long K1 = 3;
		long K2 = 6;
		System.out.print(sumBetweenTwoKth(A,N,K1,K2));
	}
}
