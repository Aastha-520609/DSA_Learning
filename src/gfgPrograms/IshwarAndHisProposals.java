package gfgPrograms;
import java.util.*;
public class IshwarAndHisProposals {
	public static ArrayList <Integer> acceptedProposals (int arr[], int n)
    {
        // your code here
        Arrays.sort(arr);
        ArrayList<Integer> li = new ArrayList<>();
        int secondMost = arr[1];
        int secondLeast = arr[n-2];
        li.add(secondLeast);
        li.add(secondMost);
        return li;
    }
	public static void main(String[] args)
	{
	  int[] arr = {1,2,3,4};
	  int n = 4;
	  System.out.print(acceptedProposals(arr,n));
	}
}
