package revision;
import java.util.*;
public class number_pattern {
	public static void main(String args[])
	{
		/*int num = 5;
		for(int i=0; i<num; i++)
		{
			int icj = 1;
			for(int j=0; j<=i; j++)
			{
				System.out.print(icj + "\t");
				int icjp1 = icj*(i-j)/(j+1);
				icj = icjp1;
			}
			System.out.println();
		}*/
		
		int n = 5;
		int num = 1;
		
		for(int i=n; i>=0; i--)
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
