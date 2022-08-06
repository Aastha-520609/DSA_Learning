import java.util.Scanner;
public class Pattern10 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int space=2;
		int midspace =-1	;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("\t");
			}
			System.out.print("*\t");
			for(int j=1;j<=midspace;j++)
			{
				System.out.print("\t");
			}
			if(i>1&&i<n)
			{
				System.out.print("*\t");
			}
			if(i<=n/2)
			{
			  space--;
			  midspace=midspace+2;
			}
			else {
				space++;
				midspace=midspace-2;
			}
			System.out.println();
		}
	}

}
