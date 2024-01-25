package revision;
import java.util.*;
public class FindingSqaureRootUsingBinarySearch {
	public static int sqrtN(long N) {
		 int low = 1;
		 int high = (int)N;
		 while(low <= high)
		 {
			int mid = (low + high)/2;
			if((mid*mid) <= (int)N)
			{
				low =  mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		 }
		 return high;
	}
	public static void main(String args[])
	{
		Long N = (long)36;
		System.out.println(sqrtN(N));
	}
}
