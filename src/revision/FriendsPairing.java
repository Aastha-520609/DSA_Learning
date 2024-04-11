package revision;
import java.util.*;
import java.io.*;
public class FriendsPairing {
	static int counter = 1;
	public static void solution(int i, int n, boolean[] used, String ans)
	{
		if(i>n)
		{
			System.out.println(counter + "." + ans);
			counter++;
			return;
		}
		//if its already paired then it don't have any other option to get paired , just call another friend
		if(used[i] == true)
		{
			solution(i+1, n, used, ans);
		}//if its not paired
		else
		{
			//used it and mark it paired
			used[i] = true;
			solution(i+1, n, used, ans + "(" + i + ")");
			for(int j=i+1; j<=n; j++)
			{
				if(used[j] == false)
				{
					used[j] = true;
					solution(i+1, n, used, ans + "(" + i + "," + j + ")");
					used[j] = false;
				}
				
			}
			used[i] = false;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] used = new boolean[n+1];
		solution(1, n, used, "");
	}

}
