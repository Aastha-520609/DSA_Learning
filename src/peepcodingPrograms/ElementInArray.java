import java.util.Scanner;
public class ElementInArray {
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the no of elements you want: ");
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter the elements of the array: ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("Enter the element you want to find: ");
	    int ele = sc.nextInt();
	    int index = -1;
        for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==ele)
	    	{
	    		index = i;
	    		break;
	    	}
	    }
        System.out.println(index);
	}
    
}
