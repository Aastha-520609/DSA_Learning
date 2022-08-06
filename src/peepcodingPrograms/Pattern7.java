import java.util.Scanner;
public class Pattern7 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		//With Space method
		/*int star = 1;
		int space = 0;
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
			space++;
			System.out.println();
		}*/
		//With rows and column is equal as its a diagonal
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j)
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
