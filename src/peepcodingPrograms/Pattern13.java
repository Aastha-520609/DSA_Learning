import java.util.Scanner;
public class Pattern13 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n:" );
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int icj=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(icj+"\t"); //Here formula used is of combination like icj i.e 5c1=1
				int icjp1 = icj * (i - j) / (j + 1); //this is formula of combination i.e nck = n!/((k!) (n-k))
				icj=icjp1;
			}
			System.out.println();
		}	
	}
}
