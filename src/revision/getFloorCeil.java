package revision;
import java.util.*;
public class getFloorCeil {
	public static int getCeil(int[] a, int n, int x)
    {
      int low = 0;
      int high = n - 1;
      int ans = -1;
      while(low <= high)
      {
        int mid = low + (high - low)/2;
        if(a[mid] >= x)
        {
          ans = a[mid];
          high = mid - 1;
        }
        else
        {
          low = mid + 1;
        }
      }
      return ans;
    }
    public static int getFloor(int[] a, int n, int x)
    {
      int low = 0;
      int high = n - 1;
      int ans = -1;
      while(low <= high)
      {
        int mid = low + (high - low)/2;
        if(a[mid] <= x)
        {
          ans = a[mid];
          low = mid + 1;
        }
        else
        {
          high = mid - 1;
        }
      }
      return ans;
    }

  public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Write your code here.
      int f = getFloor(a,n,x);
      int c = getCeil(a,n,x);
      return new int[] {f,c};
    }
	public static void main(String args[])
	{
		int[] arr = {3, 4, 4, 7, 8, 10};
		int n = arr.length;
		int x = 2;
		int[] res = getFloorAndCeil(arr,n,x);
		for(int i=0; i<res.length; i++)
		{
			System.out.print(res[i] + " ");
		}
	}
}
