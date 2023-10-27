package revision;
import java.util.*;
public class rotateArray {
	public static int[] rotate(int arr[], int n)
    {
        int temp = arr[n-1];
        for(int i=n-1; i>0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }
	public static void main(String args[])
	{
		int[] array = {1,2,3,4,5};
		int n = array.length;
		int[] result = rotate(array,n);
		for(int i=0; i<result.length; i++)
		{
			System.out.print(result[i] + " ");
		}
	}
}
