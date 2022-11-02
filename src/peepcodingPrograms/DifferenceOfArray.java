package peepcodingPrograms;
import java.util.Scanner;
public class DifferenceOfArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of the array1: ");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of the array2: ");
		int n2= sc.nextInt();
		int arr2[] = new int [n2];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int[] difference = new int [n2];
		int c = 0;
		
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = difference.length - 1;
		
		while(k >= 0)
		{
			int d = 0;
			//if we get arr2 size more than arr1, so inorder to make calculation accurate we will add 0 before the arr1 values.
			int arr1v = i>=0 ?arr1[i] : 0;
			if(arr2[j]+c >= arr1v)
			{
				d = arr2[j] + c - arr1v;
			}
			else
			{
				d = arr2[j] +c +10 - arr1v;
				c = -1;
			}
			
			difference[k] = d;
			i--;
			j--;
			k--;
		}
		int idx = 0;
		//checking whether 0 is in starting of the number or not
		while(idx < difference.length)
		{
			//if 0 is there then increase the index of the difference 
			if(difference[idx] == 0)
			{
				idx++;
			}
			//if no then break from the same position and print the remaining number
			else
			{
				break;
			}
		}
		//printing the remaining numbers except 0 at the front
		while(idx < difference.length)
		{
			System.out.print(difference[idx] + " ");
			idx++;
		}
	}
}
