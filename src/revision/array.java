package revision;
import java.util.*;
public class array {
	public static int[] insertionAtPos(int[] array,int size, int num, int pos)
	{
		int[] array1 = new int[size + 1];
		for(int i=0; i<size+1; i++)
		{
			if(i < pos-1)
			{
				array1[i] = array[i];
			}
			else if( i == pos-1)
			{
				array1[i] = num;
			}
			else
			{
				array1[i] = array[i-1];
			}
		}
		
		return array1;
	}
	
	public static int[] deleteFromPos(int[] array, int size, int pos)
	{
		int[] array2 = new int[size-1];
		for(int i=0, j=0; i<array.length; i++)
		{
			if(i == pos-1)
			{
				continue;//skiping the pos
			}
			array2[j] = array[i];
			j++;
		}
		return array2;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		/*int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0; i<n; i++)
		{
			array[i] = sc.nextInt();
		}*/
		int[] array = {1,2,3,4,5};
		int size = array.length;
		int pos = 2;
		int num = 10;
		int[] result = insertionAtPos(array, size, num, pos);
		for(int i=0; i<result.length; i++)
		{
			System.out.print(result[i] + " ");
		} 
		System.out.println();
		int[] result2 = deleteFromPos(array, size, pos);
		for(int i=0; i<result2.length; i++)
		{
			System.out.print(result2[i] + " ");
		}
	}
}
