import java.util.Scanner;
public class SpanOfArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of elements you want: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Greater number is: "+max);
		System.out.println("Smallest number is: "+min);
		int span = max - min;
		System.out.println(span);
	}
    
}
