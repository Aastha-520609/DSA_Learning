package gfgPrograms;
import java.util.*;
public class tripletFamily {
	public static ArrayList<Integer> findTriplet(int arr[], int n)
    {
        // your code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                for(int k=0; k<n; k++)
                {
                    int temp = arr[i] + arr[j];
                    if(temp == arr[k])
                    {
                        al.add(arr[k]);
                        al.add(arr[j]);
                        al.add(arr[i]);
                        return al;
                    }
                }
            }
        }
        al.add(-1);
        return al;
    }
	public static void main(String args[])
	{
	  int n = 5;
	  int arr[] = {1,2,3, 4, 5};
	  System.out.println(ArrayList<Integer> findTriplet(arr,n));
	}

}
