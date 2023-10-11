package revision;
import java.util.*;

public class number_triangle {
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   int n = 5;
	   int num = 1;
	   for(int i=1; i<=n; i++)
	   {
		   for(int j=1; j<=i; j++)
		   {
			   System.out.print(num + "\t");
			   num++;   
		   }
		   System.out.println();
	   }
	}
}
