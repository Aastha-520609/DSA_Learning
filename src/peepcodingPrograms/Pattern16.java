import java.util.Scanner;
public class Pattern16 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n: ");
		int star = 1;
		int space = 5;
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			    int val = 1;
				for(int k=1;k<=star;k++)
				{
				  System.out.print(val+"\t");
				  val++;
				}
				for(int k=1;k<=space;k++)
				{
					System.out.print("\t");
				}
				if(i==n)
				{
					star--;
					val--;
				}
				for(int k=1;k<=star;k++)
				{
					val--;
					System.out.print(val+"\t");
				}
		        star++;
				space=space-2;	
				System.out.println();	
		}
	}

}
