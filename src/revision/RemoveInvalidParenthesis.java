package revision;
import java.util.*;
import java.io.*;
public class RemoveInvalidParenthesis {
	public static void solution(String str, int minRemove, HashSet<String> ans)
	{
		if(minRemove == 0)
		{
			int minRemoveNow = getMin(str);
			if(minRemoveNow == 0)
			{
				if(!ans.contains(str))
				{
					System.out.println(str);
					ans.add(str);
				}
			}
			return;
		}

		for(int i=0; i<str.length(); i++)
		{
			String left = str.substring(0, i);
			String right = str.substring(i+1);
			solution(left + right, minRemove - 1, ans);
		}
	}
	public static int getMin(String str)
	{
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch == '(')
			{
				st.push(ch);
			}
			else if(ch == ')')
			{
				if(st.size() == 0)
				{
					st.push(ch);
				}
				else if(st.peek() == ')')
				{
					st.push(ch);
				}
				else if(st.peek() == '(')
				{
					st.pop();
				}
			}
		}
		return st.size();
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	    int minRemove = getMin(str);
	    solution(str, minRemove, new HashSet<>());
	}
}
