package gfgPrograms;
import java.util.*;
public class insertionSort {
  public static void insertionSort(int arr[], int n)
  {   
	  //code here
      for(int i=0; i<n; i++)
      {
          int key = arr[i];
          int j = i - 1;
          while(j>=0 && arr[j]>key)
          {
              arr[j+1] = arr[j];
              j--;
          }
          arr[j+1] = key;
      }
  }
  public static void main(String[] args)
   {
	int arr[] = {4,7,8,89,1};
	int n = 5;
	insertionSort(arr,n);
	for(int i=0; i<n; i++)
	{
		System.out.print(arr[i] + " ");
	}
   }
}
