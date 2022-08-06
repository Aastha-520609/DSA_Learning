package peepcodingPrograms;

import java.util.Scanner;
public class AnyBaseToDecimal {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		System.out.println("Enter base: ");
		int b = sc.nextInt();
		int f = getDecimal(n,b);
        System.out.println(f);		
	}
	public static int getDecimal(int n,int b)
	{
		int rv=0;
		int p=1;
		while(n>0)
		{
			int dig = n % 10;
			n = n / 10;
			
			rv = rv + dig * p;
			p = p * b;
		}
		return rv;
	}

}
