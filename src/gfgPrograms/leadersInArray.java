package gfgPrograms;
import java.util.*;
public class leadersInArray {
	public static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> alist = new ArrayList<>();
        int x = arr[n-1];
        alist.add(x);
        for(int i=n-2; i>=0; i--)
        {
           if(arr[i] >= x)
           {
               alist.add(arr[i]);
               x = arr[i];
           }
        }
        Collections.reverse(alist);
        for(int i=0; i<alist.size(); i++)
  	  {
  		  System.out.print(alist.get(i) + " ");
  	  }
        return alist;
    }
	public static void main(String[] args)
	{
	  int[] arr = {16,17,4,3,5,2};
	  int n = 6;
	  leaders(arr,n);
	}

}
