package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class displayArrayUsingRecursion {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		displayArr(arr,0);
	}
	public static void displayArr(int[] arr, int index)
	{
		if(index == arr.length)
		{
			return;
		}
		displayArr(arr, index + 1);
		System.out.println(arr[index]);
	}

}
