package peepcodingPrograms;
import java.util.*;
import java.io.*;
public class ArrangeBuilding {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no of plots in the one side of the road
		
		int oldEndsWithBuilding = 1;
		int oldEndsWithSpace = 1;
		
		for(int i=2; i<=n; i++)
		{
			int newEndsWithBuilding = oldEndsWithSpace;
			int newEndsWithSpace = oldEndsWithBuilding + oldEndsWithSpace;
			
			//make new to old
			oldEndsWithBuilding = newEndsWithBuilding;
			oldEndsWithSpace = newEndsWithSpace;
		}
		
		int result = oldEndsWithBuilding + oldEndsWithSpace;
		System.out.println(result*result); // since plots are in both side of road, if one side will have particular way to arrange building, the same can be followed by
		                                    // the another side.
	}

}
