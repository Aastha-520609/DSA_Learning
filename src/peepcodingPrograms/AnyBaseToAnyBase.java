package peepcodingPrograms;
import java.util.Scanner;
public class AnyBaseToAnyBase {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		System.out.println("Enter the base of the given number:  ");
		int b1 = sc.nextInt();
		System.out.println("Enter the base you want to convert in: ");
		int b2 = sc.nextInt();
		int f = getBase(n,b1,b2);
		System.out.println(f);
	}
        //function to getbase
	public static int getBase(int n, int b1, int b2)
	{
		int rv=0;
		int p=1;
		while(n>0)
		{
			int dig = n % b2;
			n = n / b2;
			
			rv = rv + dig * p;
			p = p*b1;
		}
		return rv;
	}
}
