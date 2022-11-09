package peepcodingPrograms;
import java.io.*;
import java.util.*;
import java.util.Stack;
public class DuplicateBrackets {
	public static boolean duplicateBracket(String str)
	{
		//Declaration of stack
		Stack<Character> st = new Stack<>();
		for(int i = 0;i < str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == ')')
			{
				if(st.peek() == '(')
				{
					//System.out.println(true);
					return true;
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
		//System.out.println(false);
		return false;
	}
	public static void main(String[] args)
	{
		String str = "(a+b)+((c+d))";
		System.out.print(duplicateBracket(str));
	}
}
