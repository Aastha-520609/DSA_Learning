package gfgPrograms;
import java.util.*;
public class mergeSort {
	public static void Merge(int arr[], int l,int mid, int r)
	{
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0; i<n1; i++)
		{
			L[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++)
		{
			R[j] = arr[mid+1+j];
		}
		
		int i = 0, j = 0;
		int k = l;
		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = R[j];
			j++;
			k	++;
		}
		
	}
	public static void MergeSort(int arr[], int l, int r)
	{
		if(l<r)
		{
			int mid = (l+r)/2;
			MergeSort(arr,l,mid);
			MergeSort(arr,mid+1,r);
			//Calling mergeFunction
			Merge(arr,l,mid,r);
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {5,9,8,1,7	,2};
		
		mergeSort ob = new mergeSort();
		ob.MergeSort(arr,0,arr.length - 1);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
