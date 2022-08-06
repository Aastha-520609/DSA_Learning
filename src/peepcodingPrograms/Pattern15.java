import java.util.Scanner;
public class Pattern15 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int space = n/2;
		int star = 1;
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("\t");
			}
			int num1=num;
			for(int j=1;j<=star;j++)
			{
				System.out.print(num1+"\t");
				if(j<=star/2)
				{
					num1++;
				}
				else
				{
					num1--;
				}
			}
			if(i<=n/2)
			{
				space--;
				star=star+2;
				num++;	
			}
			else {
				space++;
				star=star-2;
				num--;
			}
			System.out.println();
		}
	}

}
