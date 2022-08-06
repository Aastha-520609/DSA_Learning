import java.util.Scanner;
public class BarChart {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of elements you want: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0; i<arr.length;i++)
		{
		  arr[i]=sc.nextInt();	
		}	
	}

}
