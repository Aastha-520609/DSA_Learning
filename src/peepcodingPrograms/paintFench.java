package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class paintFench {
	public static void main(String args[])
	{
	  //Question - in how many ways one can paint the fetch so that  not more than two colour can be painted consecutively. Like rrggbbrggbrr.
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt(); // no of fench;
	  int k = sc.nextInt(); // no of colour;
	  
	  long same = k * 1; //if the fench ends with two consecutive colour.
	  long diff = k * (k - 1); // if the fench doesn't end with two consecutive colour.
	  long total = same + diff; // total no of ways to color the fench.
	  
	  for(int i=3; i<=n; i++)
	  {
		  same = diff * 1; // in the fench ending with diff color we add same color that it was ending with.
		  diff = total * (k-1); // in the different fench, we can add 2 colors with total no of ways.
		  total = same + diff;
	  }
	  
	  System.out.println(total);
	}
}
