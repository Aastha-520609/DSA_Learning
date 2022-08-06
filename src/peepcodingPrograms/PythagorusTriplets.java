import java.util.Scanner;
public class PythagorusTriplets {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c = sc.nextInt();
		int largest = a;
		if(b>=largest)
		{
			largest=b;
		}
		if(c>=largest)
		{
			largest=c;
		}
		if(largest == a)
		{
			boolean flag = ((b * b + c * c) == (a*a));
			System.out.println(flag);
		}
		else if(largest == b)
		{
			boolean flag = ((a * a + c * c) == (b*b));
			System.out.println(flag);	
		}
		else
		{
			boolean flag = ((a * a + b* b) == (c*c));
			System.out.println(flag);
		}
	}
}
