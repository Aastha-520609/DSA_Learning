import java.util.Scanner;
public class DecimalToAnyBase {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any decimal number: ");
		int n = sc.nextInt();
		System.out.println("Enter the base of the number you want to convert: ");
		int b = sc.nextInt();
	    int f = getConversion(n,b);
	    System.out.println(f);   
	}
	public static int getConversion(int n, int b)
	{
		int rv=0;//return value
		int p=1;
		while(n>0)
		{
			int dig = n % b;
			n = n / b;
			
			rv = rv + dig * p;
			p = p * 10;
		}
		return rv;
	}
}
