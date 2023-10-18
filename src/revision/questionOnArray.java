package revision;
import java.util.*;
public class questionOnArray {
	//finding the span of array
	public static int spanOfArray(int n, int[] array)
	{
		int max = array[0];
		int min = array[0];
		int result = 0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i] < min)
			{
				min = array[i];
			}
			
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		result = max - min;
		
		return result;
	}
	//finding element in an array
	public static int findIndex(int n, int[] array, int ele)
	{
		int index = -1;
		for(int i=0; i<array.length; i++)
		{
			if(array[i] == ele)
			{
				index = i;
				break;
			}
		}
		return index;
	}
	public static void main(String args[])
	{
		int n = 5;
		int[] array = {10,20,60,40,50};
		int elementToFind = 20;
		//int res = spanOfArray(n, array);
		int res = findIndex(n,array,elementToFind);
		System.out.print(res);
		
	}

}
