package gfgPrograms;
import java.util.*;
public class findPairDifference {
	public static boolean findPair(int arr[], int size, int n)
    {
        //code here.
        for(int i=0; i<size-1; i++)
        {
            for(int j=1; j<size; j++)
            {
                if(arr[j] - arr[i] == n && i!=j)
                {
                    return true;
                }
            }
        }
        return false;
    }
	public static void main(String[] args)
	{
		int[] arr = {5,20,3,2,5,80};
		int size = 6;
		int n = 78;
		System.out.print(findPair(arr,size,n));
	}

}
