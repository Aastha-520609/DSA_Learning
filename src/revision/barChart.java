package revision;
import java.util.*;
public class barChart {
	public static void main(String args[])
	{
	   int n = 5;
	   int[] array = {3,1,0,7,5};
	   
	   int max = array[0];
	   for(int i=1; i<array.length; i++)
	   {
		   if(array[i] > max)
		   {
			   max = array[i];
		   }
	   }
	   
	   for(int f = max; f >= 1; f--)
	   {
		   for(int i=0; i<array.length; i++)
		   {
			   if(array[i] >= f)
			   {
				   System.out.print("*\t");
			   }
			   else
			   {
				   System.out.print("\t");
			   }
		   }
		   
		   System.out.println();
	   }
	   
	}
}
