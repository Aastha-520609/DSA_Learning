import java.util.Scanner;
public class Pattern8 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		//Using space method
		/*int space = n-1;
		int star = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("\t");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*\t");
			}
			space--;
			System.out.println();
		}*/
		//using row + coloum is equal to n+1 method
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j==n+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
