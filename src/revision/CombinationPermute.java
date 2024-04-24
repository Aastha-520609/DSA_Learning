package revision;
import java.util.*;
import java.io.*;
public class CombinationPermute {
	public static void solution(int current_item, int total_item, int[] items, int selection, int total_selection, String ans)
	{
		if(current_item > total_item) {
			if(selection == total_selection)
			{
				System.out.println(ans);
			}
			return;
		}
		for(int i=0; i<total_selection; i++)
		{
			if(items[i] == 0)
			{
				items[i] = 1;
				solution(current_item + 1, total_item, items, selection + 1, total_selection, ans + (i+1));
				items[i] = 0;
			}
		}
		
		solution(current_item + 1, total_item, items, selection, total_selection, ans + 0);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n_place = sc.nextInt();
		int r_items = sc.nextInt();
		solution(1, n_place, new int[r_items], 0, r_items, "");
	}

}
