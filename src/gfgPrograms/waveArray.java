package gfgPrograms;
import java.util.*;
public class waveArray {
	public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=1; i<n; i+=2)
        {
            int temp = a[i];
            a[i] = a[i-1];
            a[i-1] = temp;
        }
    }
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		int n = 5;
		convertToWave(n,arr);
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
