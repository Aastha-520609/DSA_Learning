package revision;
import java.util.*;
public class sort0s1s {
	public static void sort012(int a[], int n)
    {
        // code here 
        int low = 0;
        int mid = 0;
        int high = n - 1;
        int temp = 0;
        while(mid <= high)
        {
            if(a[mid] == 0)
            {
                temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if(a[mid] == 1)
            {
                mid++;
            }
            else
            {
                temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
        
        for(int i=0; i<n; i++)
		{
			System.out.print(a[i] + " ");
		}
        
    }
	public static void main(String args[])
	{
		int[] array = {2,0,2,1,1,0};
		int n = array.length;
		sort012(array,n);
	}

}
