package peepcodingPrograms;

import java.util.Scanner;
public class Pattern18 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int space=0;
		int star=7;
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
			for(int j=1;j<=space;j++)
			{
				System.out.print("\t");
			}
			if(i<=n/2)
			{
				space++;
				star=star-2;	
			}
			else
			{
				space--;
				star=star+2;
			}
			System.out.println();
		}
	}
     
}
