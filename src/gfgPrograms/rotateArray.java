package gfgPrograms;
import java.util.*;
public class rotateArray {
	public static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int[] temp = new int[n];    
        for(int i=0;i<n;i++)
        {
            int num = (i+d)%n;
            temp[i] = arr[num];
        }

        for(int i=0;i<n;i++)
        {

            arr[i] = temp[i];
        }
    }
	public static void main(String[] args)
	{
	 int[] arr = {1,2,3,4,5};
	 int d = 2;
	 int n = arr.length;
	 rotateArr(arr,d,n);
	 for(int i=0; i<n; i++)
	 {
		 System.out.print(arr[i] + " ");
	 }
	}
}
