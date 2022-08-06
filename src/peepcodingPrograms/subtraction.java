import java.util.Scanner;
public class subtraction {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the base of the number: ");
		int b = sc.nextInt();
		System.out.println("Enter the number 1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the number 2: ");
		int n2 = sc.nextInt();
		int f = getSubtraction(b,n1,n2);
		System.out.println(f);
	}
	public static int getSubtraction(int b,int n1,int n2)
	{
	  int rv = 0;
	  int c = 0;
	  int p=1;
	  while(n2>0)
	  {
		  int rem1 = n1 % 10;
		  n1 = n1 / 10;
		  int rem2 = n2 % 10;
		  n2 = n2 / 10;
		  
		  int rem = 0;
		  rem2 = rem2 + c;
		  
		  if(rem2>=rem1)
		  {
			  c=0;
			  rem = rem2 - rem1;
		  }
		  else
		  {
			  c=-1;
			  rem = rem2 + b - rem1;
		  }
		  
		  rv = rv + rem * p;
		  p = p * 10;
	  }
	  return rv;
	}
}
