package gfgPrograms;
import java.util.Map;
import java.util.HashMap;
public class firstElementToOccurKtimes {
	static int firstElement(int[] arr, int n, int k)
	{
		HashMap<Integer, Integer> firstElem = new HashMap<>();
		for(int i=0; i < n; i++)
		{
			//here key will be the numbers and value will be how many times the number will occur
			//to get how many times the number occured. We will set a count variable
			int count = 0;
			if(firstElem.get(arr[i]) != null)
			{
				count = firstElem.get(arr[i]);
				//System.out.print(firstElem.get(arr[i]));
			}
			//firstElem.put(arr[i],count + 1);
			System.out.print(firstElem.put(arr[i],count + 1));
		}
		for(int i=0; i<n; i++)
		{
			if(firstElem.get(arr[i]) == k)
			{
				System.out.print(arr[i]);
				//return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[] = {1, 7, 4, 3, 4, 8, 7};
		int n = arr.length;
		int k = 2;
		//firstElement(arr,n,k);
		System.out.print(firstElement(arr,n,k));
	}

}
