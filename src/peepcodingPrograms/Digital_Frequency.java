import java.util.Scanner;
public class Digital_Frequency {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("Enter the value of d: ");
		int d = sc.nextInt();
	    int f = getDigitFrequency(n,d);
	    System.out.println("Total number of d in n is :" + f);
	}
	public static int getDigitFrequency(int n, int d)
	{
		int rv = 0;
		while(n!=0)
		{
			int dig = n%10;
			n = n/10;
			if(d==dig)
			{
			  rv++;	
			}
		}
		return rv;
	}

}
