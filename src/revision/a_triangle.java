package revision;
import java.util.*;
public class a_triangle {
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
       
        //Code of reverse
        /*for(int i=5; i>=num; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        
        
	}

}
