package revision;
import java.util.Scanner;

public class a_hollowDiamond {
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  int n = 5;
	  
	  int o_space = n/2;
	  int i_space = -1;
	  for(int i=1; i<=n; i++)
	  {
		  for(int j=1; j<=o_space; j++)
		  {
			  System.out.print("\t");
		  }
		  
		  System.out.print("*\t");
		  
		  for(int j=1; j<=i_space; j++)
		  {
			  System.out.print("\t");
		  }
		  
		  if(i>1 && i<n)
		  {
			  System.out.print("*\t");
		  }
		  
		  if(i <= n/2)
		  {
			  o_space--;
			  i_space += 2;
		  }
		  else
		  {
			  o_space++;
			  i_space -= 2;
		  }
		  System.out.println();
	  }
	}
}
