import java.io.*;
import java.util.*;
public class PrefixEvaluation {
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any prefix expression: ");
		String exp = br.readLine();
		
		Stack <Integer> prefix = new Stack<>();
		Stack <String> infix = new Stack<>();
		Stack <String> postfix = new Stack<>();
		for(int i=exp.length() -1; i>=0; i--)
		{
			char ch = exp.charAt(i);
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
			{
				int v1 = prefix.pop();
				int v2 = prefix.pop();
				
				int operator_value = operation(v1,v2,ch);
				prefix.push(operator_value);
				
				String i_v1 = infix.pop();
				String i_v2 = infix.pop();
				String i_v = "(" + i_v1 + ch + i_v2 + ")";
				infix.push(i_v);
				
				String p_v1 = postfix.pop();
				String p_v2 = postfix.pop();
				String p_v = p_v1 + p_v2 + ch;
				postfix.push(p_v);
			}
			else
			{
				prefix.push(ch - '0');
				infix.push(ch + "");
				postfix.push(ch + "");
			}
		}
		System.out.println("Prefix Evaluation is: ");
		System.out.println(prefix.pop());
		System.out.println("Infix conversion is: ");
		System.out.println(infix.pop());
		System.out.println("Postfix conversion is: ");
		System.out.println(postfix.pop());
	}
	public static int operation(int v1, int v2,char operator)
	{
		if(operator == '+')
		{
		  return v1 + v2;	
		}
		else if(operator == '-')
		{
		   return v1 - v2;	
		}
		else if(operator == '*')
		{
		   return v1 * v2;	
		}
		else 
		{
		   return v1 / v2;	
		}
	}
}
