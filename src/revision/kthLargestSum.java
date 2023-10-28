package revision;
import java.util.*;
public class kthLargestSum {
	public static int kthLargest(int N, int K, int[] Arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<N; i++)
        {
            int sum = 0;
            for(int j=i; j<N; j++)
            {
                sum = sum + Arr[j];
                list.add(sum);
            }
        }
        
        Collections.sort(list, Collections.reverseOrder());
        return list.get(K-1);
    }
	public static void main(String args[])
	{
		int n = 3;
		int[] array = {3,2,1};
		int k = 2;
		int result = kthLargest(n,k,array);
		System.out.println(result);
		
	}
}
