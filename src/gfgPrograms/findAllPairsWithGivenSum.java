package gfgPrograms;
import java.util.ArrayList;
//import java.util.pair;
import java.util.*;
public class findAllPairsWithGivenSum {
	public static ArrayList allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here
        ArrayList<Long> alist = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                if(A[i] + B[j] == X)
                {
                    //pair t = new pair(A[i],B[j]);
                    alist.add(A[i]);
                    alist.add(B[j]);
                }
                else if(A[i] + B[j] < X)
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
        }
        //pair[] result = new pair[alist.size()];
        return alist;
    }
	public static void main(String[] args)
	{
	 long[] A = {1, 2, 4, 5, 7};
	 long[] B = {5, 6, 3, 4, 8};
	 int N = 5;
	 int M = 5;
	 int X = 9;
	 System.out.print(allPairs(A,B,N,M,X));
	 
	}

}
