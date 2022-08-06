import java.util.Scanner;
public class Pattern3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int space = n-1; //because first star prints after 4 space and we are taking n as 5.
		int star = 1;//because the pattern contain only 1 on the first print.
		for(int i=1;i<=5;i++)
		  {
			//This loop will give tab space as per the input 
			//Here 5 is the input and as space is n-1 this will give 4 tab at the first line and after the loop end it will decrease by 1 and show tab accordingly.
			for(int j=1;j<=space;j++)
			{
				System.out.print("\t");
			}
			//This loop will print one star after 4 tab as star starts from 1.
			//Here starting input is 1 and as star increases after the loop terminates it will increase star and print in accordance with space from the above loop.
			for(int j=1;j<=star;j++)
			{
				System.out.print("*\t");	
			}
			space--;
			star++;
			System.out.println();
		  }
	}

}
