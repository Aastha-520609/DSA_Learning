package revision;
import java.util.*;
import java.io.*;
public class PermutationToCombination {
	public static void combination(boolean[] boxes, int current_item, int total_item, int occupied_box)
	{
		if(current_item > total_item)
		{
			for(int i=0; i<boxes.length; i++)
			{
				if(boxes[i])
				{
					System.out.print("i");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
			return;
		}
		for(int i=occupied_box + 1; i < boxes.length; i++)
		{
			if(boxes[i] == false)
			{
				boxes[i] = true;
				combination(boxes, current_item + 1, total_item, i);
				boxes[i] = false;
 			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n_boxes = sc.nextInt();
		int r_items = sc.nextInt();
		combination(new boolean[n_boxes], 1, r_items, -1);
	}
}
