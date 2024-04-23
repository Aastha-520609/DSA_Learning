package revision;
import java.util.*;
import java.io.*;
public class Permutation {
	public static void permutations(int[] place, int current_item, int total_item)
	{
		if(current_item > total_item)
		{
			for(int i=0; i<place.length; i++)
			{
				System.out.print(place[i]);
			}
			System.out.println();
			return;
		}
		for(int i=0; i<place.length; i++)
		{
			if(place[i] == 0)
			{
				place[i] = current_item;
				permutations(place, current_item + 1, total_item);
				place[i] = 0;
			}
		}
	}
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  int n_place = sc.nextInt();
	  int r_items = sc.nextInt();
	  permutations(new int[n_place], 1, r_items); 
	}

}
