package peepcodingPrograms;

import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter the value of n: ");
		int n = Sc.nextInt();
		int star=3;
		int space=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*\t");
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print("\t");
			}
			for( int j=1;j<=star;j++)
			{
				System.out.print("*\t");
			}
			if(i<=n/2)
			{
				star--;
				space=space+2;	
			}
			else {
				star++;
				space=space-2;
			}
			System.out.println();
		}
	   	
	}
}
