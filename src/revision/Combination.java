package revision;
import java.util.*;
import java.io.*;
public class Combination {
	public static void combinations(int current_item, int total_item, int selection, int total_selection, String ans)
	{
		if(current_item > total_item)
		{
			if(selection == total_selection)
			{
				System.out.println(ans);
			}
			return;
		}
		combinations(current_item + 1, total_item, selection + 1, total_selection, ans + "i");
		combinations(current_item + 1, total_item, selection, total_selection, ans + "-");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n_items = sc.nextInt();
		int r_items = sc.nextInt();
		combinations(1, n_items, 0, r_items, "");
	}

}
