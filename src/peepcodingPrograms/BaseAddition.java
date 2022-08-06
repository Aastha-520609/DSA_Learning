package peepcodingPrograms;

import java.util.Scanner;
public class BaseAddition {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the base of the number: ");
		int b = sc.nextInt();
		System.out.println("Enter Number one: ");
		int n1 = sc.nextInt();
		System.out.println("Enter Number Two: ");
		int n2 = sc.nextInt();
		int f = getAddition(b,n1,n2);
		System.out.println(f);
	}
	public static int getAddition(int b, int n1, int n2)
	{
		int rv = 0;
		int c = 0;
		int p = 1;
		while(n1>0 || n2>0 || c>0)
		{
			int rem1 = n1 % 10;
			n1 = n1 / 10;
			int rem2 = n2 % 10;
			n2 = n2 / 10;
			int rem = rem1+rem2+c;
			c = rem / b;
			rem = rem % b;
			
			rv = rv + rem * p;
			p = p * 10;
		}
		return rv;
	}

}
 