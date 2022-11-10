package peepcodingPrograms;
import java.io.*;
import java.util.*;
public class BalancedBracket {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.nextLine();
		
		Stack< Character > st = new Stack < > ();
		for(int i = 0;i < str.length(); i++)
		{
			char ch = str.charAt(i);
			//1-if opening bracket then push it to stack
			if(ch == '(' || ch == '{' || ch == '[')
			{
				st.push(ch);
			}
			//2- if bracket is closing bracket ) then search for opening bracket ( , if both is present then pop both stack empty then true after 
			// getting pair pop the opening bracket from the stack.
			//3- if stack size is 0 when we ch is ) then there is no opening bracket, so false.
			//4- if stack peek is not opening bracket ( then there is no match of this closing bracket present , so false.
			else if (ch == ')')
			{
				boolean val = handleClosing(st,'(');
				if(val == false)
				{
					System.out.println(val);
					return;
				}
			}
			else if (ch == '}')
			{
				boolean val = handleClosing(st,'{');
				if(val == false)
				{
					System.out.println(val);
					return;
				}
			}
			else if (ch == ']')
			{
				boolean val = handleClosing(st,'[');
				if(val == false)
				{
					System.out.println(val);
					return;
				}
			}
			else
			{
				
			}
		}
		
		if(st.size() == 0)
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}	
	public static boolean handleClosing(Stack<Character> st, char corresch)
		{
			if(st.size() == 0)
			{
				return false;
			}
			else if(st.peek() != corresch)
			{
				return false;
			}
			else
			{
				st.pop();
				return true;
			}
		}
	}
