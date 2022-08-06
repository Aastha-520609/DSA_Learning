import java.io.*;
import java.util.*;
public class DuplicateBrackets {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any String: ");
		String str = sc.nextLine();
		
		//Declaration of stack
		Stack<Character> st = new Stack<>();
		for(int i = 0;i < str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == ')')
			{
				if(st.peek() == '(')
				{
					System.out.println(true);
					return;
				}
				else
				{
					while(st.peek() != '(')
					{
						st.pop();
					}
					st.pop();
				}
			}
			else
			{
				st.push(ch);
			}
		}
		System.out.println(false);
	}

}
