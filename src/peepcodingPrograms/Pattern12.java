package peepcodingPrograms;

import java.util.Scanner;
public class Pattern12 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n:" );
		int n = sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+"\t");
				//fibonaaci series concept comes in context
				int c = a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}
		
	}

}
